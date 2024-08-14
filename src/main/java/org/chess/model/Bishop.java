package org.chess.model;

public class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        return false;
    }
}
