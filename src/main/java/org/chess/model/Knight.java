package org.chess.model;

public class Knight extends Piece{
    public Knight(boolean isWhite) {
        super(isWhite);
    }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        /*int dX = Math.abs(endX - startX);
        int dY = Math.abs(endY - startY);

        if((dX ==2 && dY == 1) || (dX == 1 && dY ==2)){
            Piece destinationPiece = board.getPiece(endX , endY);
            return destinationPiece == null || destinationPiece.isWhite != this.isWhite;
        }*/


        if( (endX == startX+1 && endY == startY+2) || (endX == startX+1 && endY == startY-2) ||
            (endX == startX-1 && endY == startY-2) || (endX == startX-1 && endY == startY+2)||
            (endX == startX+2 && endY == startY+1) || (endX == startX+2 && endY == startY-1)||
            (endX == startX-2 && endY == startY+1) || (endX == startX-2 && endY == startY-1)){

            Piece destinationPiece = board.getPiece(endX , endY);
            return destinationPiece == null || destinationPiece.isWhite != this.isWhite;
        }else{
            System.out.println("não e valida");
        }

        return false;
    }
}
