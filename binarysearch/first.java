/* 

-------------------------------------------
ONLY FOR SORTED ARRAYS 
-------------------------------------------

1. find middle element =>( start + end) / 2 

2. if target > mid --> search in right 
else left 

3. if target == middle -> return ans 

*/

package binarysearch;

public class first {
    public static void main(String[] args) {
        int[] arr ={2, 4, 5, 6, 7, 8 , 12 ,14};
        int target = 8 ;

        System.out.println(searchbin(arr, target));
    }

    static int searchbin(int [] arr , int target)
    {
        int mid ;
        int start = 0 ;
        int end = arr.length - 1 ;

        while(start <= end)
        {
                 // find middle element 
   // mid = (start+ end)/ 2 ; // but this  start + end can exceed int values 

                 // hence
            mid = start + (end - start )/ 2 ;
            if (target < arr[mid])
            {
                end = mid - 1 ;
            }
            else if (target> arr[mid])
            {
                start = mid + 1 ;
            }
            else{
                return mid ;
            }
         }

         return -1;
         
      
    }
}
