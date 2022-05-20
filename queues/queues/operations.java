package queues;

// implement Queue using Arrays 
/*
--> enqueue
--> dequeue 

*/

class QueueUsingArrays{
    int front,  rear ;
    int capacity ; 
    static int[] q1;

    // constructor 
    QueueUsingArrays(int size){
        capacity = size ;
        q1 = new int[capacity];
    }

    // enqueue 
    void enqueue(int value)
    {
        // base condition check -- if queue is full, cannot insert
        if(rear == capacity)
            System.out.println("queue is full , cannot insert");
        else{
            q1[rear] = value;
            rear++;

        }
            
    }

    // dequeue
    void dequeue()
    {
        //base condition check -- if queue is empty  
        if(rear == 0 )
        {
            System.out.println("queue is empty, cannot dequeue");
        }
        
        else{
            for(int i = 0 ; i < rear -1 ; i++)
            {
                q1[i]  = q1[i+1];
            }
            rear--;

        }
    }

    // display 
    void display(){
        if(rear == 0 )
        {
            System.out.println("queue is empty, cannot dequeue");
        }
        else{
            for(int i = 0; i < rear; i++){
                System.out.println(q1[i]);
            }
        }
    }
}
public class operations {
    public static void main(String[] args) {
        
        // object of class 
        QueueUsingArrays q = new QueueUsingArrays(5);
        // insert 
        q.enqueue(2);
        q.enqueue(9);
        q.enqueue(10);
        q.display();

        //dequeue
        q.dequeue();

        q.display();
    
    }
}
