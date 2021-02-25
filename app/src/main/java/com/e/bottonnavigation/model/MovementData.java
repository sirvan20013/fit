package com.e.bottonnavigation.model;

public class MovementData {

    private String moveName;
    private int moveImg;

    public MovementData(String moveName, int moveImg) {
        this.moveName = moveName;
        this.moveImg = moveImg;
    }

    public String getMoveName() {
        return moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public int getMoveImg() {
        return moveImg;
    }

    public void setMoveImg(int moveImg) {
        this.moveImg = moveImg;
    }
}
