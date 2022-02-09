//https://leetcode.com/problems/missing-number/

// cycle sort 

package sorting.leetcode;

import java.util.Arrays;

public class Missing {
    public static void main(String[] args) {
        int[] nums = {4 , 5 , 1 , 2 , 3};
        missingNumber(nums);
        System.out.println(Arrays.toString(nums)); 
    }
    public static int missingNumber(int[] nums) {
       
        int i = 0 ;
        while(i <nums.length)
        {
            int correctindex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctindex])
            {
                swap(nums, i , correctindex);
            }
            else {
                // move ahead 
                i++;
            }
        }
       
       // search for missing number 
       for (int j = 0; j < nums.length; j++) {
           if(nums[j] != j) 
           {
               return j ;
           }
           
       }
       
        return nums.length;
        
    } 

    private static void swap(int[] nums, int i, int correctindex) {

        int temp = nums[i] ;
        nums[i] = nums[correctindex];
        nums[correctindex] = temp ;
    }
}
