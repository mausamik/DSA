package linkedlist;
// this is not using Linkedlist class 



// SINGLE LINKED LIST

/*
    Insertion 
        insert add 
        Insert at the end 
        insert at a specific position 
    Deletion 
         delete from begin
         delete from end 
         delete from position 
*/



public class operations2 {

    Node head;
    // create node class 
    class Node{
        int data ;
        Node next ;

        // constructor
        Node(int data){
            this.data = data ;
            this.next = null;
        }
    }

    // Insert  at the beginning 

    /*
         (head) 2  --> 3 --> 4  --> N 
         now add 1 at the start :

         --> 1 ka next --> 2 
         --> point head --> 1 
    */
    public void addfirst(int data)
    {
        // create a new ndode 
        Node newnode = new Node(data);
        
        // check if linkedlist exits 
        if (head == null){
            head = newnode;
            return ;

        }
        // if linked list already exists 

        else {
            newnode.next = head ; // newnode (1) --> head(2) 
            head = newnode; // head(2) --> newnode (1) 
        }
    }
/*
     Insert at the  end of the list 
         traverse through the beginning to
         the end and find null 
         the node before null(last node) --> newnode 

*/
    public void addlast(int data)
    {
        // create a new ndode 
        Node newnode = new Node(data);
        
        // check if linkedlist exits 
        if (head == null){
            head = newnode;
            return ;

        }
        // traverse through linkedlist 
        // because never manipulate head 
        // hence currnode which points to head , and basically acts like temp 
        Node currnode = head ;
        
        while(currnode.next != null)
        {
            currnode = currnode.next;

        }
        currnode.next = newnode;

    }
/*
INSERT AT ANY POSITION IN THE LIST 
      10       8       11     null
    (head) 

    add new node = 15 at position 3 
      10       8       15        11    null 
                    (newnoode) 
      steps : 
      10        8       11     null 
      (previous)  //count = 1 

      10        8       11     null 
     (head)    (prev)  (Curr) 

                    15 (newnode)   null 
     -> curr = prev.next 
     -> newnode.next i.e null = curr ;
     -> prev.next = newnode 
*/
    public void addposition(int data, int position)
    {
      // boundary check condition 
      if(position < 1)
      {
          System.out.println("Invalid position");
      }

        // create a new node 
        Node newnode = new Node(data);
        // assign a prev node to the head and start traversing 
        Node prev = head ;
        int count = 1 ;
        while(count < position - 1 )
        {
            prev = prev.next;
            count++;
        }
        Node curr = prev.next; // temp variable 
        newnode.next = curr;
        prev.next = newnode;

    }


    // print the list 
    public void print()
    { 
        // if head == NULL 
        if(head == null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currnode = head ;
        
        while(currnode != null)
        {
            System.out.print(currnode.data + " -> ");
            currnode = currnode.next;

        }
        System.out.print("NULL");
  
    }

    /* 
         DELETE --> Delete from the beginninng 

         steps :
         point head to the next node 
    */

    public void deletefirst()
    {
        // case --> list empty 
        if(head == null)
        {
           System.out.println("list is empty, nothing to delete");
        }
        else {
            // make head point to next of head 
            head = head.next ;
        }
    }


/*
     DELETE -- > delete the last element 
     steps :
        traverse till the second last node 
        point second last --> null 
*/
     public void deletelast()
     {
         // case --> list empty 
        if(head == null)
        {
           System.out.println("list is empty, nothing to delete");
        }

        // where list has only 1 element i.e head.next == null 
        if(head.next == null)
        {
            head = null;
            return;
        }
        else{
            Node secondlast = head ;
            Node lastnode = head.next;
            while(lastnode.next != null)
            {
                lastnode = lastnode.next;
                secondlast = secondlast.next ;
            }

            secondlast.next = null ;
        }

     }

     /*
    
        Delete from a specific position 

    */ 

    public void  deleteposition(int position)
    {
        Node prev = head ;
        
        // if linkedlist is empty 
        if(head == null)
        {
            System.out.println("Linkedlist is empty");
        }

        // if there is only 1 element --> i.e head needs to be removed 
        if(position == 0)
        {
            head = prev.next;
            return ;
        }

        // find prev node of the node to be deleted 
        for (int i = 0 ;  prev != null && i < position - 1 ;i++)
        {
            prev = prev.next;
        }

        if(prev == null || prev.next ==null)
            return ;
        

        Node next = prev.next.next;
        prev.next = next ;


    }

// count the number of nodes present -- LINKED LIST SIZE 

        public int getcount()
        {
            Node temp = head ;
            int count = 0 ;
            
            while(temp != null)
            {
                count++;
                temp = temp.next;
            
            }
            return count;
        }



    public static void main(String[] args) {
        // linkedlist's object 
        operations2 obj = new operations2();
        obj.addfirst(2);
        obj.addfirst(4);
        obj.print();

        obj.addlast(10);
        System.out.println();
        obj.print();

        System.out.println();

        obj.deletefirst();
        obj.print();

        System.out.println();

        obj.deletelast();
        obj.print();

        System.out.println();

        obj.addposition(13, 2);  
        obj.print(); 
        System.out.println();

        obj.deleteposition(1);
        obj.print();

       System.out.println("Size of linkedlist is : " + obj.getcount());
     }
}
