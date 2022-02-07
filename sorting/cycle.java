package sorting;

import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
        int[] arr = {4 , 5 , 1 , 2 , 3};
            cyc(arr);
            System.out.println(Arrays.toString(arr));
    }

    static void cyc(int[] arr)
    {
       int i = 0 ;
       while(i <arr.length)
       {
           int correctindex = arr[i] - 1 ;
           if(arr[correctindex] != arr[i])
           {
               swap(arr, i , correctindex);
           }
           else {
               // move ahead 
               i++;
           }
       }
    }

    private static void swap(int[] arr, int i, int correctindex) {

        int temp = arr[i] ;
        arr[i] = arr[correctindex];
        arr[correctindex] = temp ;
    }


    
}
