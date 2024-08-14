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
