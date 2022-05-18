package linkedlist;

public class doublelinkedlist {

    class Node{
        int data;
        Node prev ;
        Node next;


        public Node(int data)
        {
            this.data = data ;
        }
    }

    Node head = null;

    // INSERT 
    public void insertstart(int data)
    {
        Node newnode = new Node(data);
        if (head == null)
        {
           newnode.prev = head ;
           head = newnode ;
           return ;

        }

        newnode.next = head ;
        newnode.prev = null;
        if (head!=null)
        {
            head.prev = newnode;
        }
        head = newnode ;
    }

    public void insertend (int data)
    {
        Node newnode = new Node(data);
        Node curr = head ;

        if(head == null)
        {
           newnode.prev = head ;
           head = newnode ;
           return ; 

        }

        // traverse to the end of list 
        while(curr.next != null)
        {
            curr = curr.next ;
        }
        curr.next = newnode ;
        newnode.prev = curr ;
        newnode.next = null ;
    }

    // INSEERRT AT INDEX 


    // DELETE FROM START 
    public void deletestart()
    {
        if (head == null)
        {
            System.out.println("Nothing to delete");

        }
        head = head.next;
        head.prev = null; 
     
    }

    public void deleteend()
    {
        if (head == null)
        {
            System.out.println("Nothing to delete");

        }

        Node secondlast = head ;
        Node last = head.next ;

        while(last.next != null)
        {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;


    }

    // DISPLAY 
    public void display()
    {
        // if head == NULL 
        if(head == null)
        {
            System.out.print("List is empty");
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

    public static void main(String[] args)
    {
        doublelinkedlist dll = new doublelinkedlist();
        dll.insertstart(5);
        dll.insertstart(3);
        dll.insertend(4);
        dll.insertend(8);
        dll.display();
        System.out.println();
        dll.deletestart();
        dll.display();
        System.out.println();
        dll.deleteend();
        dll.display();
        
    }

}