package com.company;

public class Main {

    public static void main(String[] args) {
        // Create a function that takes a string parameter,
        // counts the occurrences of the letter "a", and returns it as a number.

        // example: on the input "Apple" the function should return 1 -
        // print this result
        // example: on the input "Avocado" the function should return 2 -
        // print this result
        // example: on the input "Blueberry" the function should return 0 -
        // print this result

        String word = "Avocado";
        System.out.println(count(word));
    }

    public static int count(String text) {
        int counta = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i+1).equals("a") ||
                    text.substring(i, i+1).equals("A")) {
                counta = counta + 1;
            }
        }
        return counta;
    }
}
