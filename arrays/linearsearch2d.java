package arrays;

import java.util.Arrays;

public class linearsearch2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2 , 3 },
            {24, 34},
            {4, 5 , 6 }};
        int target = 34;

        int[] ans = search2d(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search2d(int[][] arr, int target)
    {
        if(arr.length == 0)
        {
            return new int[]{-1,-1};
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = 0 ; j < arr[i].length; j++)
            {
                if(arr[i][j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1}; 
    }
}
