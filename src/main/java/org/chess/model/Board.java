package org.chess.model;

public class Board {

    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        setupBoard();
    }
    private void setupBoard(){
        for (int i = 0; i < 8 ; i++) {
            board[1][i] = new Pawn(true);
            board[6][i] = new Pawn(false);
        }
        //rook
        board[0][0] = new Rook(true);
        board[0][7] = new Rook(true);
        board[7][0] = new Rook(false);
        board[7][7] = new Rook(false);

        //Knight
        board[0][1] = new Knight(true);
        board[0][6] = new Knight(true);
        board[7][1] = new Knight(false);
        board[7][6] = new Knight(false);


        //Bishop
        board[0][2] = new Bishop(true);
        board[0][5] = new Bishop(true);
        board[7][2] = new Bishop(false);
        board[7][5] = new Bishop(false);

        //Queen
        board[0][3] = new Queen(true);
        board[7][3] = new Queen(false);

        //King
        board[0][4] = new King(true);
        board[7][4] = new King(false);


    }

    public Piece getPiece(int x, int y) {
        return board[y][x];
    }

    public void setPiece(int x , int y , Piece piece){
        board[y][x] = piece;
    }

    public Piece[][] getBoard() {
        return board;
    }

    public boolean movePiece(int startX , int startY, int endX , int endY ){

        Piece piece = getPiece(startX, startY);

        if(piece != null && piece.move(startX , startY , endX , endY , this)){
            setPiece(endX , endY , piece);
            setPiece(startX , startY , null);

            return true;
        }
        return false;
    }
}
