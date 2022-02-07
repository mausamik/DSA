package sorting;

import java.util.Arrays;

public class selection {
    
        public static void main(String[] args) {
            int[] arr = {4 , 5 , 1 , 2 , 3};
            select(arr);
            System.out.println(Arrays.toString(arr));
    }

    static void select(int[] arr)
    {
        // for every step we are gonna n-1 
        for (int i = 0; i < arr.length ; i++) {

            // find max element in array and swap with correct index 
            int last = arr.length - i - 1 ; // at i = 0 ; at 4th index jo 3 hai usko arr ke max ele(5) ke sath swap kro 
            //swap last with max element 
            int max = getmax(arr,0,last);

            swap(arr,max, last);
            
        }
    }

    private static int getmax(int[] arr, int start, int end)
    {
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i] )
            {
                max = i ;
            }
        }   
        return max;
    }

    static void swap(int[] arr, int first, int sec)
    {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp ;
    }


}
