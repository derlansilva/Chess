package org.chess.model;

public class Queen extends Piece{
    public Queen(boolean isWhite){ super(isWhite);}

    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        return false;
    }
}
