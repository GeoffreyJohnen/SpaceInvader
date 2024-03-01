package com.spaceInvader.model;


public abstract class Actor  {
    private Position position;

    public  Actor(Position position){
        this.position = position;
    }

    public void setPosition(Position position){
        this.position = position;
    }
    public void moveUp(){
        this.position.move(0,1);
    }
    public void moveDown(){
        this.position.move(0,-1);
    }
    public void moveLeft(){
        this.position.move(-1,0);
    }
    public void moveRight(){
        this.position.move(1,0);
    }
}
