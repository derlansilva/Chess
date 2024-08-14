package org.chess.controller;

import org.chess.model.Board;
import org.chess.model.Piece;
import org.chess.model.User;

import java.util.List;

public class GameController {

    private Piece selectedPiece ;
    private Board board;
    private boolean isWhiteTurn;
    private int startX , startY;


    private UserController userController =new UserController();

    public GameController(Board board) {
        this.board = board;
        this.selectedPiece = null;
        this.isWhiteTurn = Math.random() < 0.5;
        isWhiteTurn = true;

    }

    public void movePiece(int x , int y ){

        if(selectedPiece == null){
            selectedPiece(x , y);
        }else{

            if(board.movePiece(startX , startY , x , y )){
                toggleWhiteTurn();
            }

            selectedPiece = null;
        }
    }

    private void selectedPiece(int x , int y){
        selectedPiece = board.getPiece(x , y);
        if(selectedPiece != null && selectedPiece.isWhite() == isWhiteTurn ){

            startX = x ;
            startY = y;
        }
    }

    public void toggleWhiteTurn(){
        isWhiteTurn = !isWhiteTurn;
    }

    public  void setUser(){
        User play1 = new User("PLAYER 1");
        User play2 = new User("PLAYER 2");

        userController.userAdd(play1);
        userController.userAdd(play2);

        getUser();

    }

    public  void getUser(){
        List<User> users  = userController.getUsers();

        for (int i = 0; i < users.size() ; i++ ){
            for (int j = 0; j < 8; j++) {
                for (int k = 0; k < 8; k++) {
                    if(board.getPiece(j , k ).isWhite() == true){
                        board.getPiece(j , k).setUser(users.get(0));
                    }else{
                        board.getPiece(j , k).setUser(users.get(1));
                    }

                }
            }
            System.out.println("user " + users.get(i).getName());
        }

        for (int j = 0; j < 8; j++) {

            for (int k = 0; k < 8; k++) {
                System.out.println(board.getPiece(j , k).getUser().getName());

            }
        }
    }

}
