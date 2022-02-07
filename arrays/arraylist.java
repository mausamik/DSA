package arrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        
        // when to use arraylist ?
        // when you dont know the size of array 

        // syntax 

        ArrayList<Integer> arrlist = new ArrayList<>();

        // add
      arrlist.add(67);
      arrlist.add(54);
      arrlist.add(2);
      arrlist.add(8974);


      System.out.println(arrlist.size());

      // find all the fucntions using arrlist.

      // iterate
      for (int i = 0; i < arrlist.size(); i++) {
          System.out.print(arrlist.get(i) + " ");
      }

    }
}
