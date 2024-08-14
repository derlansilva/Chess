package org.chess.controller;

import org.chess.model.Board;
import org.chess.model.Piece;

public class GameController {

    private Piece selectedPiece ;
    private Board board;
    private boolean isWhiteTurn;
    private int startX , startY;


    public GameController(Board board) {
        this.board = board;
        this.selectedPiece = null;
        this.isWhiteTurn = Math.random() < 0.5;
        isWhiteTurn = true;
    }

    public void movePiece(int row , int col ){
        System.out.println("tentando movimentar a peça " + selectedPiece);
        if(selectedPiece == null){
            selectedPiece(row , col);
        }else{
            System.out.println("fazendo alguns testes ");
            System.out.println(row +" " + col + " " + selectedPiece  );
            System.out.println(startX + "  startY " + startY);
            //implementar aqui logica para um jogador por vez
            if(board.movePiece(startX , startY , row , col )){
                System.out.println("estou movimentando a peça ");
            }
        }
    }

    private void selectedPiece(int x , int y){
        Piece piece = board.getPiece(x , y);
        if(piece != null /*&& piece.isWhite() == isWhiteTurn*/){
            selectedPiece = piece;
            startX = x ;
            startY = y;
        }
    }

    public void handleClick(int x , int y){
        System.out.println("selected piece ");
        Piece piece =board.getPiece(x , y);
        if(selectedPiece == null){
            //se a peça selecionada e igual a null
            selectedPiece = board.getPiece(x , y);//seleciona a peça
            if(selectedPiece != null && selectedPiece.isWhite() == isWhiteTurn){
                startX = x;
                startY = y;
            }
        }else{
            if(board.movePiece(startX , startY , x ,y)){
                toggleWhiteTurn();
            }
            selectedPiece = null;
        }
    }

    public void toggleWhiteTurn(){
        isWhiteTurn = !isWhiteTurn;
    }
}
