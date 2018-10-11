package com.company;

public class Animal {
    int hunger;
    int thirst;

    public Animal(){
        hunger=50;
        thirst=50;
    }

    public void eat(){
        this.hunger-=1;
    }

    public void drink(){
        this.thirst-=1;
    }

    public void play(){
        this.hunger += 1;
        this.thirst +=1;
    }

    public static void main(String[] args){

    }
}
