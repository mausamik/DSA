package sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {4 , 5 , 1 , 2 , 3};
            insert(arr);
            System.out.println(Arrays.toString(arr));
    }


    static void insert(int[] arr)
    {
        for (int i = 0; i <= arr.length - 2 ; i++) {
            for (int j = i + 1 ;j > 0 ; j--) { // impt remember this line 

                if(arr[j] < arr[j-1])
                {
                    swap(arr, j , j-1);
                   
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int sec)
    {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp ;
    }


}
