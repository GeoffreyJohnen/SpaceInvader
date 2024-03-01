package com.spaceInvader.model;

import java.lang.Math;

public class Position {
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void move(int x, int y){
        this.x += x;
        this.y += y;
    }

    public double distanceSq(Position position){
        int distanceX = this.x - position.getX();
        int distanceY = this.y - position.getY();
        return Math.sqrt(Math.pow(distanceX,2)+Math.pow(distanceY,2));
    }

}
