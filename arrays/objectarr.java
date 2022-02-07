package arrays;

import java.util.*;
public class objectarr {
    public static void main(String[] args)
    {
        // array of objects 
        Scanner sc = new Scanner(System.in); 

        String[] arr= new String[4];
        for(int i = 0 ; i < arr.length; i++)
        {
            arr[i] = sc.next();
        }
    sc.close();
    }
}
