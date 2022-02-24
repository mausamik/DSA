package sorting;

import java.util.Arrays;

// DIVIDE AND CONQUERR 
/*
divide array into halves .. sort them individyally using recursion .. then merge them 

how to merge ?

a1=[3 , 5 , 9]
a2= [4, 6, 8]

a3 of size -> a1 + a2

compare them --> 
 is 3 < 4 --> put in array --> the pointer moves to 5 
 is 4 < 5 --> put in array --> pointer move to 6 
 is 5 < 6 --> put in array --> pointer to 9 
 is 6 < 9 --> put in arr --> pointer moves to 8 
 is 8 < 9 --> put in array -> end of that array 
 append the remaining parts of a1 

*/
public class mergesort {
    public static void main(String[] args) {
        
    }


    static int[] merges(int[] arr){
         // base condition 
         if(arr.length == 1)
         {
             return arr;
         }

         // divide arr by mid 
         int mid = arr.length / 2 ;

         // get ans from left  and arr 
         int[] left = merges(Arrays.copyOfRange(arr, 0, mid)); // created letf object 
         int[] right = merges(Arrays.copyOfRange(arr, mid, arr.length));



        return merge(left, right);

    }


    private static int[] merge(int[] first, int[] second) {
        // create new array that will be left + right 

        int[] mix = new int[first.length + second.length];

        
        return null;
    }
}
