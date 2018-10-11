package com.company;

// Write a program that asks for a number.

// It would ask this many times to enter an integer,

// if all the integers are entered, it should print the sum and average of these

// integers like:

// Sum: 22, Average: 4.4

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int quantity = input.nextInt();
        int sum = 0;
        for (int i= 0; i < quantity; i++) {
            sum = sum + input.nextInt();
        };
        System.out.println("Sum: " + sum + ", Average: " + sum/quantity);
    }
}
