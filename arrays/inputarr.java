package arrays;

import java.util.Arrays;
import java.util.Scanner;


public class inputarr {
    public static void main(String[] args)
    {
       
        // input size from user 
        Scanner scan = new Scanner(System.in);

        //ARRAYS OF PRIMITIVES 
        
        int size = scan.nextInt();
         // declare array 
         int[] arr ;
         arr = new int[size] ;
         // input arr 
         for(int i = 0 ; i < size; i++) // we can also write like->  i < arr.length 
         {
             arr[i] = scan.nextInt();
         }
         // traverse through array 
         for(int i = 0 ; i < size; i++)
         {
             System.out.print(arr[i]+ " ");
         }

         // another way to print arrays 
         System.out.println(Arrays.toString(arr));


         // reverse traverse 
         for(int i = size - 1  ; i >= 0; i--)
         {
             System.out.print("\n" + arr[i] +" ");
         }
scan.close();
    }
}
