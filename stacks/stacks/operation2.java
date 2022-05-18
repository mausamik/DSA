package stacks;

//create a stack  using arrays 

public class operation2 {
    public static void main(String[] args)
    {
        // create from scratch 
        Stack st = new Stack(5);

        st.push(2);
        st.push(3);
        st.push(5);

        st.printstack();

        st.pop();
        st.pop();
        st.pop();

        st.isempty();


    
    }
}



    class Stack{

        //create aan array to store elements 
        int arr[];

        //
        int top;
        int capacity ;
    
        //create a stack 
        Stack(int size)
        {
            //init the array 
            arr = new int[size];
            capacity = size ;
            top = -1 ; 
        }

        // -----PUSH -------------
        public void push(int x )
        {
            if(isfull())
            {
                System.out.println("Stack is full, cannot insert element");

            }

            arr[++top] = x ;
            System.out.println("element is inserted");        
        }


        public int pop()
        {
            if(isempty())
            {
                System.out.print("Stack is empty, nothing to pop out");

            }

            return arr[top--];
        }

        public int getsize()
        {
            return top + 1 ;

        }

        public boolean isempty()
        {
            return top == -1 ;
           
        }

        public boolean isfull()
        {
            return top == capacity - 1 ;

        }

        public void printstack()
        {
            for( int i = 0 ; i <= top  ; i++ )
            {
                System.out.println(arr[i] + " ");
            }
        }
            
    

    }

