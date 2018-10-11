package com.company;

public class Counter {
    public static void main(String [] args) {
        counter(5);
    }

    public static void counter(int num) {
        System.out.println(num);
        if (num != 1) {
            counter(num-1);
        }

    }
}
