package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        todoText= "My toto:\n" + todoText + " - Download games \n\t - Diablo";

        System.out.println(todoText);

    }
}
