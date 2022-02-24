package queues;
/*

- extended version of regular queue 
- last element is connected to the 1st element - making it circular 
-- circular increment -->
i = (i + 1) % size

*/
 class CircularQueue {
    int front , rear ;
    int capacity;
    static int[] arr;


    // constructor 
    CircularQueue(int size){
        capacity = size ;
        arr = new int[capacity];
    }


    // check if queue is full 
    // 1 condition changes 

    boolean isfull()
    {
        if(front == 0 && rear == capacity -1 )
        {
            return true;
        }
        if(front == rear + 1){
            return true;
        }
            
        return false ;
    }


    // check if empty 
    boolean isempty()
    {
        if(front == -1 ){
            return true ;
        }
        else
            return false;
    }

    // add an element -- enqueue 
    void enqueue(int ele)
    {
        if(isfull())
        {
            System.out.println("queue is full");
        }
        else {
            if(front == -1)
            {
                front = 0 ;
                

            }
            rear = (rear + 1 ) % capacity;
            arr[rear] = ele ;
            System.out.println("inserted " + ele);
        }
    }

    int dequeue()
    {
        int ele ;
        if(isempty())
        {
            System.out.println("queue is empty , cannot delete");
          return -1 ;

        }
        else{
            // if it has only 1 element -- reset the queue 
            ele = arr[front];
            if(front == rear)
            {
                front = -1 ;
                rear = -1 ;
            }
            else {
                front = (front + 1 ) % capacity;
            }
            return ele;

        }
        
    }

    // display 
    void display()
    {
        if(isempty())
        {
            System.out.println("nothing to display - empty queue");
        }
        else {
            System.out.println("front : " + front);
            for (int i = front ; i != rear ; i = (i+1) % capacity)
            {
                System.out.println(arr[i]);

            }
            System.out.println("rear : " + rear);
        }

    }
}




public class circular {
    public static void main(String[] args) {
        
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(2);
        cq.enqueue(4);
        cq.enqueue(6);
        cq.enqueue(8);
        

        cq.display();
    }
}
