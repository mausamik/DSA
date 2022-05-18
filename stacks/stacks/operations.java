package stacks;

import java.util.Iterator;
import java.util.Stack;

/*
basic operations of a stack 
1. push
2. pop 
3. peek - returns top ele 
4. isempty - no element in stack  --> cannot pop 
5. isfull - no space in stack --> cannot push  
*/
public class operations {
    public static void main(String[] args) {
        //create stack 
        Stack<Integer> s1 = new Stack<>(); 

        // inserting values 
        s1.push(2);
        s1.push(1);
        s1.push(10);
        System.out.println(s1);

        // remove values 
        s1.pop();
        System.out.println(s1);

        // peek operation 
        System.out.println(s1.peek());

        // empty 
        boolean status = s1.empty();
        System.out.println(status);

        // inbuilt method for search in stack 
        int indexfound = s1.search(4);
        System.out.println(indexfound);

        // how to iterate over a stack  -- Iterator object 
        Iterator i1 = s1.iterator();
        while(i1.hasNext()){
            Object s2 = i1.next();
            System.out.println(s2);
        }

        //to know size of given stack 
        
        System.out.println(s1.size());

        // how to sort the array 
        s1.sort(null);
        System.out.println(s1);






    }


    
}
