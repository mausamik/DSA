package recursion;

public class fibonacci {
    // 0      1     1    2     3       5       8       13 
   // 0      1    (0+1) (1+1) (1+2) (2+3)    (5+3)   (8+5)..

   // fib(n) = fib(n-1) + fib(n-1)

     public static void main(String[] args) {
        System.out.println(fib(6));
    }

    static int fib(int n)
    {
       // base case is important 
       if(n < 2)
       {
           return n ;
       }
       
        return  fib(n-1) + fib(n-2);

    }
}
