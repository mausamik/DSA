package linkedlist;

public class circularlinkedlist {

    Node head, tail  ;
    class Node {
        int data ;
        Node head;
        Node tail;
        Node next;

// constructor 
        Node(int data)
        {
            this.data = data ;
            this.head = null;
            this.tail = null;


        }
    }

    public void insert(int data)
    {
        
        Node newnode = new Node(data);
        // base case -- list is empty 
        if (head == null)
        {
            head = newnode;
            tail = newnode ;
        }

        tail.next = newnode ;
        newnode.next = head ;
        tail = newnode;

    }

    // DISPLAY 

    // curr and head should not overlap again 

    public void display()
    {
        Node curr  = head ;
        if(head !=null)
        {
            do{
                System.out.print(curr.data + "->");
                curr = curr.next ;
            }while(curr != head );
        }
        

    }

    // DELETE 
    public void delete(int data)
    {
        Node curr = head ;
        if(curr == null)
        {
            return ;
        }
        if(curr.data == data)
        {
            head = head.next ;
            tail.next =head ;
            return;
        }

        do{
            Node n = curr.next;
            if(n.data == data)
            {
                curr.next = n.next ;
                break;

            }
            
            curr = curr.next ;
        }while(curr!=head);



    }




    public static void main(String[] args)
    {
        circularlinkedlist cll = new circularlinkedlist();
        cll.insert(3);
        cll.insert(4);
        cll.insert(8);
        cll.insert(10);
        cll.display();
        System.out.println();
        cll.delete(4);
        cll.display();
    }
}
