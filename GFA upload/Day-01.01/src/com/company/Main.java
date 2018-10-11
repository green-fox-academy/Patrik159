package com.company;

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `printParams`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printParams("first")
// printParams("first", "second")
// printParams("first", "second", "third", "fourth")
// ...

public class Main {

    public static void main(String[] args) {
	// write your code here
        printParams("first");
    }

    public static void printParams(String... a){
        for (String b : a) {
            System.out.println(b);
        }
    }
}
