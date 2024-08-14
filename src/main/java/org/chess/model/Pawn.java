package org.chess.model;

public class Pawn extends Piece {

    public Pawn(boolean isWhite) {
        super(isWhite);
    }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        //implementar logica para movimentar
        int  direction = isWhite ? 1 : -1;

        if(startX == endX){
            if(endY == startY + direction && board.getPiece(endX , endY) == null){
                return true;
            }
            if( endY == startY + 2 * direction && startY == (isWhite ? 1 : 6 ) && board.getPiece(endX  , endY ) == null){
                return true;
            }
            //end x  = 2 for igual a
        } else if (Math.abs(startX - endX) == 1 && endY == startY + direction) {
            if(board.getPiece(endX , endY) != null && board.getPiece(endX , endY).isWhite != isWhite){
                return true;
            }
        }
        return false;
    }
}
