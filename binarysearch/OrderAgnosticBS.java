package binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {92,56, 19,12, 11, 8 , 5 , 2 };
        int target = 56;
        System.out.print(orderag(arr, target));
    }


    static int orderag(int[] arr, int target)
    {
        int mid ;
        int start = 0 ;
        int end = arr.length - 1 ;


// find if arr is sorted in asc or desc 

        boolean asc;
        if(arr[start] < arr[end])
            asc = true;

        else 
            asc = false ;


        while(start <= end)
        {
                 // find middle element 
   // mid = (start+ end)/ 2 ; // but this  start + end can exceed int values 

                 // hence
            mid = start + (end - start )/ 2 ;

            if( arr[mid] == target)
            {
                return mid ;
            }
        // for asc order array 
            if(asc)
            {
                    if (target < arr[mid])
                {
                    end = mid - 1 ;
                }
                else if (target> arr[mid])
                {
                    start = mid + 1 ;
                }

            }
            // for desc order array 
            else 
            {
                if(target > arr[mid])
                {
                    end = mid - 1 ;
                }
                else{
                    start = mid + 1 ;
                }

            }

            
            
         }

         return -1;
    }
}
