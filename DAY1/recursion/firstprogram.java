package DAY1.recursion;

public class firstprogram {
    public static void main(String[] args) {
        //recursion for printing 5 numbers 
        
        print(1);
    }

     static void print(int n){

        // base conditions are very important 
        if(n ==5)
        {
            System.out.print(5);
            return;
        }
         System.out.println(n);
         print(n+1);

    }
}
