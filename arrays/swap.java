package arrays;

import java.util.* ;
public class swap {
    public static void main(String[] args) {
        int[] arr= {1,3,4,6,7};
        swapno(arr, 1 , 3 );
        System.out.println(Arrays.toString(arr));
    }

    static void swapno(int[] arr, int index1 , int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
