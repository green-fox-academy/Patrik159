package com.company;

public class Counter {
    int Counter;

    public Counter(int Counter){
        Counter=Counter;
    }

    public Counter(){
        Counter=0;
    }

    public void add(int number){
        Counter += number;
    }

    public void add(){
        Counter++;
    }

    public void reset(){
        Counter=0;
    }

    public int get(){
        return this.Counter;
    }

    public static void main(String [] args){

    }
}
