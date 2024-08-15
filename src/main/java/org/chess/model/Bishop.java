package org.chess.model;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {

        //Veririca se o movimento e diagonal
        if(Math.abs(endX - startX) != Math.abs(endY - startY)) {
            return false;
        }
        int xDirection = (endX > startX) ? 1 : -1;
        int yDirection = (endY > startY) ? 1 : -1;

        int x = startX + xDirection ;
        int y = startY + yDirection;
        while (x != endX || y != endY) {
            if( board.getPiece(x , y) != null){
                return false;
            }
            x+=xDirection;
            y+=yDirection;
        }
        while (x!=endX && y!=endY) {
            if(board.getPiece(x , y) != null){
                return  false;
            }
            x+=xDirection;
            y+=yDirection;
        }


        Piece destinationPiece = board.getPiece(endX, endY);
        if(destinationPiece != null && destinationPiece.isWhite() == this.isWhite){
            return false;
        }

        return true;
    }
}
