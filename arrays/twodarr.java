package arrays;

import java.util.Arrays;

import java.util.Scanner;

public class twodarr {
     public static void main(String[] args) {
        /*
                1 2 3
                4 5 6 
                7 8 9 
        */
        Scanner sc = new Scanner(System.in);
        int[][] matrix  = new int[3][3]; 
        System.out.println(matrix.length); // this will print no of rows // 3 
        // adding no of col is not mandatory 

        // as columns can differ example 
      /*  int[] MissingFormatArgumentException = {              
                    {1 ,2, 3}, // 0th index 
                    {4,5},  // 1st 
                    {6,7,8,9}  // 2nd 
        };
        */

        // input 
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = sc.nextInt();
            }
           
        }
        sc.close();

        // output 

        for (int row = 0; row < matrix.length; row++) {
            // for each column in every row 
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]+" ");
            }
        System.out.println();
        }

        // simplest method 
        for(int[] a : matrix)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
