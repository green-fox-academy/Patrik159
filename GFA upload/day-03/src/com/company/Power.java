package com.company;
// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
public class Power {
    public static void main(String [] args){
        System.out.println(power(3, 2));
    }
    public static int power(int a, int b) {
        if (b == 1) {
            return a;
        }
        else {
            return a * power(a, b-1);
        }
    }
}
