package org.chess.model;

public class King extends Piece{

    public King(boolean isWhite) { super(isWhite); }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        return false;
    }
}
