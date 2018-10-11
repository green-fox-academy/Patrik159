package com.company;

// - Create (dynamically) a two dimensional array

//   with the following matrix. Use a loop!

//

//   1 0 0 0

//   0 1 0 0

//   0 0 1 0

//   0 0 0 1

//

// - Print this two dimensional array to the output

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] [] array = new int [4] [4];
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                if (i==j) {
                    array[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }

    }
}
