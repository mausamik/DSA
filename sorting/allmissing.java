package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class allmissing {

    public static void main(String[] args) {
        int[] nums = {4 , 5 , 1 , 2 , 3};
        findDisappearedNumbers(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
         int i = 0 ;
        while(i < nums.length)
        {
            int correctindex = nums[i];
            if(nums[i] != nums[correctindex])
            {
                swap(nums,correctindex, i);
            }
            else {
                // move ahead 
                i++;
            }
        }
       
       // search for missing number 
        List<Integer> ans = new ArrayList<>();
       for (int j = 0; j < nums.length; j++) {
           if(nums[j] != j + 1 ) // j+ 1 bcoz the sorting is from 1 to N // j only when sortting is from 0 to N 
           {
               ans.add(j + 1);
           }
           
       }
       
        return ans ;
    }
 
    private static void swap(int[] nums, int i, int correctindex){

        int temp = nums[i] ;
        nums[i] = nums[correctindex];
        nums[correctindex] = temp ;
     }
}