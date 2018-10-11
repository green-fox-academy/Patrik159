package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Create a function that takes a list
        // as a parameter,

        // and returns a new list with every second element
        // from the original list

        // example: [1, 2, 3, 4, 5] should produce [2, 4] -
        // print this result

        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(second(arr)));
//        System.out.print('[');
//        for (int i = 0; i < ((arr).length/2 - 1); i++) {
//            System.out.print(second(arr)[i] + ", ");
//        }
//        System.out.print(second(arr)[arr.length/2] + ']');
    }

    public static int [] second(int [] numbers) {
        int count = 0;
        int [] result = new int[numbers.length/2];
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                result [count] = numbers[i];
                count = count + 1;
            }
        }
        return result;
    }

}
