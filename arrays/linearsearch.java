package arrays;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        // linear search 

        // input array size & array 
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // input 
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }

        // search if that element exits in the array or not 
        System.out.print("enter ele");
        int k = sc.nextInt();
        search(arr,k);
        sc.close(); 
    }

    
     static void search(int[] arr, int k)
    {
        // base condition 
        // arr is empty 
        if(arr.length == 0)
        {
            System.out.print("empty arr"); 
            // if return type is int --> return -1 
        }
       for(int i = 0 ; i < arr.length; i++)
       {
           if(arr[i] == k)
           {
               System.out.println("yes , " + "element is there at index " + i);

           }
          
       }

      //  return -1 ; (if return type is int )
      
    }

}
