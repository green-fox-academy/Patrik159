package com.company;


//  From now on, create the usual class wrapper

//  and main method on your own.



// - Create a string variable named `al` and assign the value `Greenfox` to it

// - Create a function called `greet` that greets it's input parameter

//     - Greeting is printing e.g. `Greetings dear, Greenfox`

// - Greet `al`

public class Main {

    public static void main(String[] args) {
	// write your code here
        String al = "Greenfox";
        System.out.println(greet(al));


    }
    public static String greet (String name) {
        return "Greetings dear, " + name;
    }
}
