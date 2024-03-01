package com.spaceInvader.model;


public abstract class Actor implements IMovable{
    private Position position;

    public  Actor(Position position){
        this.position = position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void move(int x, int y){
        this.position.move(x,y);
    }
}
