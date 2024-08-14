package org.chess.model;

public class Knight extends Piece{
    public Knight(boolean isWhite) {
        super(isWhite);
    }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        int dX = Math.abs(endX - startX);
        int dY = Math.abs(endY - startY);


        System.out.println( "dX " + Math.abs(endX - startX));
        System.out.println("dY "+ Math.abs(endY - startY));
        if((dX ==2 && dY == 1) || (dX == 1 && dY ==2)){
            Piece destinationPiece = board.getPiece(endX , endY);
            return destinationPiece == null || destinationPiece.isWhite != this.isWhite;
        }
        return false;
    }
}
