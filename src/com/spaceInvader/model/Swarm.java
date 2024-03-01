package com.spaceInvader.model;

import java.util.ArrayList;

public class Swarm implements IMovable{
    private ArrayList<IMovable> members;

    public void add(IMovable member){
        this.members.add(member);
    }

    public void remove(IMovable member){
        this.members.remove(member);
    }

    public void move(int x, int y){
        for (IMovable member : members){
            member.move(x,y);
        }
    }
}
