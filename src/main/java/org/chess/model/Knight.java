package org.chess.model;

public class Knight extends Piece{
    public Knight(boolean isWhite) {
        super(isWhite);
    }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        return false;
    }
}
