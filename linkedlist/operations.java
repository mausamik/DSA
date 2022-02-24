package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class operations {
    public static void main(String[] args) {
        
       // useing Linkedlist class
        LinkedList<Integer> l1 = new LinkedList<>();
        // add elements 
        l1.add(2);
        l1.add(3);
        l1.add(10);

        // Insert the value at a given index 
         l1.add(1, 4);

        // remove ele - del 
       l1.remove(2); 

       l1.removeFirst();

       l1.removeLast();

        //access the elements of the list --Iterator obj 
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        // size of linkedlist 
        System.out.println(l1.size());

        // search ele  -- contains 
        boolean b = l1.contains(7);
        System.out.println(b);

        //copy elements / contents from stack to linkedlist (any other DS to linkedlist)

        Stack<String> s1 = new Stack<>();
        LinkedList<String> l2 = new LinkedList<>();

        // insert some elements into stack 
        s1.push("hello");
        s1.push("Myself");

        // shift them to linkedlist 
        l2.addAll(s1);


        Iterator it1 = l2.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

    }
}
