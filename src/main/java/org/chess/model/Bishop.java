package org.chess.model;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        System.out.println("bispo __________________________");
        System.out.println("DX " +dx);
        System.out.println("DY " +dy);
        System.out.println("bispo __________________________");
        return false;
    }
}
