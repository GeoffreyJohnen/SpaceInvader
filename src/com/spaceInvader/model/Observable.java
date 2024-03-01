package com.spaceInvader.model;

import java.util.ArrayList;

public class Observable {
    private ArrayList<Observer> observers=null;
    public Observable(){
        this.observers = new ArrayList<Observer>();
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }
}