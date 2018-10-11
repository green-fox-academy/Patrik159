package com.company;

public class Modulo {
    public static void main(String [] args) {
        System.out.println(modulo(6, 5));
    }

    public static int modulo (int a, int b) {
        return a - a/b*b;
    }
}
