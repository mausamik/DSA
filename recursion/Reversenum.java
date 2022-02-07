package recursion;

import javax.print.event.PrintJobListener;

/* reverse a number using recursion 

1842 --> reverse this num  --> 2481 

take the last integer put it in first 

2 + f(184)
4 + f(18)
8  + f(1)
 
 2481 
 1. n % 10 
 2. put it at the start  --> how do you do it 
-->
            2  then 4 --> 24 --> 2  * 10 + 4 == 24 
            24 * 10 == 240 + 8 ==> 248 
            248 *10 == 2480 + 1 == > 2481 

 3. repeat the function 

*/
public class Reversenum {
    public static void main(String[] args) {
        rev(1824);
        System.out.println(sum);
    }

    static int sum = 0 ;
    static void  rev(int num)
    {
       
        if(num == 0)
        {
           return; 
        }
        int rem = num  % 10 ;
        sum = sum * 10 + rem; // previous sum  like 24 * 10 +  8 whihc is rem
        rev(num/10);
        
    }
}
