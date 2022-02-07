package sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = { 5 , 7, 2 , 8 , 10};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void  bubblesort(int[] arr)
    {
      
     // run steps n - 1 steps 
        for (int i = 0; i < arr.length; i++) 
        {
        
            // for each step , max element will be at last 
            for (int j = 1; j <= arr.length - i -1  ; j++)
             {
                
                // swap if j < i 
                if(arr[j] < arr[j - 1])
                {
                    int temp = arr[j] ;
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }

        }
    }
}
