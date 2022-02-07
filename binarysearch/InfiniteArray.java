package binarysearch;

public class InfiniteArray {
    public static void main(String[] args) {
        // start with size 2 -- dividing into chunks 
    }



   /*
    //static int ans(int[] arr, int target)
    {
        // first find range 
        // first start with chunk of size 2 
        int start = 0 ;
        int end = 1;
        
        // condition for target to lie in the range -->  start  <target < end 
        // when target > end -- > keep doubling the chunk 

        while(target > arr[end])
        {
            int newstart = end + 1 ;
            // end = end + sizeofbox * 2 
            end = end + (end - start + 1 ) * 2 ;
            
        }

    }
    */
    static int searchbin(int [] arr , int target, int start , int end)
    {
        int mid ;
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
