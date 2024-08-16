package org.chess.model;

public class Queen extends Piece{
    public Queen(boolean isWhite){ super(isWhite);}

    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);

        if(dx == dy ||startX == endX || startY == endY){
            int stepX = Integer.signum(endX - startX);
            int stepY = Integer.signum(endY - startY);

            int x =startX + stepX;
            int y = startY + stepY;

            while (x != endX || y != endY){
                if(board.getPiece(x , y ) != null){
                    return false;
                }
                x += stepX;
                y += stepY;
            }

            Piece destinationPiece = board.getPiece(endX , endY);
            if(destinationPiece != null && destinationPiece.isWhite == isWhite){
                return false;
            }

            return true;

        }
        return false;
    }
}
