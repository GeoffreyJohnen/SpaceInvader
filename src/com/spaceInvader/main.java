package com.spaceInvader;

import com.spaceInvader.model.Monster;
import com.spaceInvader.model.Position;
import com.spaceInvader.model.Swarm;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Swarm swarm = new Swarm();
        ArrayList<Monster> monsters = new ArrayList<Monster>();
        for (int i = 0; i<3; i++){
            Position p = new Position(i,0);
            Monster m = new Monster(p);
            monsters.add(m);
            swarm.add(m);
        }

        for (Monster m : monsters){
            System.out.println("Monster "+m+" position is "+m.getPosition());
        }
        swarm.move(0,1);

        for (Monster m : monsters){
            System.out.println("Monster "+m+" position is "+m.getPosition());
        }
        swarm.move(1,0);

        for (Monster m : monsters){
            System.out.println("Monster "+m+" position is "+m.getPosition());
        }
    }
}
