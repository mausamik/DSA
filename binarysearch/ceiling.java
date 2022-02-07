/* CEILING OF A NUMBER  -- the smallest number in array that is equal to or greater than target nummber 

given :
 arr and target 
 find cieling 


*/


package binarysearch;
public class ceiling{
    public static void main(String[] args) {
        int[] arr ={2, 4, 5, 6, 7, 8 , 12 ,14};
        int target = 8 ;

        System.out.println(ceil(arr, target));
    }

    static int ceil(int[] arr , int target)
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

         return start; // only change in code , rest everything same as BS 
         
    }
}