package org.chess.model;

public abstract class Piece {
    protected boolean isWhite;
    private String name ;
    private User user ;
    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }
    

    public boolean isWhite() {
        return isWhite;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public abstract boolean move(int startX , int startY , int endX , int endY , Board board);
}
