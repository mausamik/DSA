package DAY1.recursion;

/* 

count no of zeros 

30201 -->
i can take 2 arguments ( num , count =0 )
n % 10 --> if this is == 0--> count+ 1 ;
then recursivelt call the function ( n/10, count) 
*/
public class Countzero {
    public static void main(String[] args) {
        System.out.println(count(30201));
    }

    static int count(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        
        if(n == 0)
            return c ;

        int rem = n % 10 ;
        if(rem == 0)
            return helper(n/10, c + 1);

        return helper(n/10, c);


    }
}
