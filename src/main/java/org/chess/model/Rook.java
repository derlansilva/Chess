package org.chess.model;

public class Rook extends Piece{

    public Rook(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        return false;
    }
}
