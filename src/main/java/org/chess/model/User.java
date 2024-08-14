package org.chess.model;

public class User {
    private String name;
    private boolean isTime;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTime() {
        return isTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(boolean time) {
        isTime = time;
    }

    @Override
    public String toString() {
        return name;
    }
}
