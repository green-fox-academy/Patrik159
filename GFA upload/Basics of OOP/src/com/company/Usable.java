package com.company;

public class Usable {
    int number;

    public Usable() {
        number = 2;
    }

    public void write(){
        System.out.println(number);
    }

    public static void main(String[] args) {
        Usable firstUsable = new Usable();
        firstUsable.write();
    }
}
