package org.chess.model;

public class Rook extends Piece{

    public Rook(boolean isWhite){
        super(isWhite);
    }
    @Override
    public boolean move(int startX, int startY, int endX, int endY, Board board) {
        //// Rook moves in straight lines horizontally or vertically
        if(startX == endX || startY == endY){
            int dx = Integer.signum(endX - startX);
            int dy = Integer.signum(endY - startY);
            int x = startX + dx ;
            int y = startY + dy;

            while( x !=endX || y!=endY){
                if(board.getPiece(x , y ) != null){
                    return false;
                }
                x += dx;
                y += dy;
            }
            Piece destinationPiece = board.getPiece(endX , endY);
            //verifica se ha uma peça no caminho e se e do adversario
            if(destinationPiece != null && destinationPiece.isWhite() == this.isWhite){
                return false ;
            }

            return true;
        }
        return false;
    }
}
