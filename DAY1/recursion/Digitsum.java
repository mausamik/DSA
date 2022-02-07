package DAY1.recursion;
/* 
number = 3421 

number  % 10  ==> give us 1 
we will be left with (342) --> n / 10 


*/
public class Digitsum {
    public static void main(String[] args) {
        System.out.println(sum(3421));
    }

    static int sum(int n){

        // basecase 
        if( n == 0)
            return  0 ;
      
    return (n % 10) + sum(n / 10);

    }
}
