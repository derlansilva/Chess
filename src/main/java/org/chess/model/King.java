package org.chess.model;

public class King extends Piece{

    public King(boolean isWhite) { super(isWhite); }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);

        if(dx <= 1&& dy<=1){
            Piece destinationPiece = board.getPiece(endX, endY);
            if(destinationPiece != null && destinationPiece.isWhite()== isWhite){
                return  false;
            }
            return true;
        }
        return false;
    }
}
