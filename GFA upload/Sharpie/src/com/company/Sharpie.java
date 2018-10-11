package com.company;

public class Sharpie {
    String color;
    float width;
    float inkAmount;

    public Sharpie(String color, float width){
        color=color;
        width=width;
        inkAmount = 100;
    }

    public void Use(){
        inkAmount -= 1;
    }

    public static void main(String[] args){

    }
}
