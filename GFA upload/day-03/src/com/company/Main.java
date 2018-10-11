package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fact2(3));
        System.out.println(fact(3, 1));
    }
    public static int fact2(int num) {
        if (num == 1) {
            return 1;
        }
        else {
            return num * fact2(num - 1);
        }
    }
    public static int fact (int max, int current) {
        if (current == max) {
            return current;
        }
        else {
            return current * fact(max, current+1);
        }
    }
}


