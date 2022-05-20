package binarytree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    char key ;
    // left child , right child 
    Node left, right ;


    // constructor 
    Node(char key){
        this.key = key ;
    }
}

class TreeTraversal{
    Node root ;

    // preorder --> root -> left -> right 
    void preorder(Node n) // root node is passed 
    {
        // till when you shoudl traverse ? till you reach leaf node -- end of tree 

        if( n != null)
        {
            // print root 
            System.out.print(n.key + " ");
            // recursive call on left tree 
            preorder(n.left);
            // recursive call on right tree 
            preorder(n.right);

        }
        
    }

    // post order --> left -> right -> root 
    void postorder(Node n)
    {
        if(n != null)
        {
            postorder(n.left);
            postorder(n.right);
            System.out.print(n.key + " ");

        }
    }

    // inorder  --> left -> root -> right 
    void inorder(Node n)
    {
        if(n != null)
        {
            inorder(n.left);
            System.out.print(n.key + " ");
            inorder(n.right);

        }
    }


    void levelorder(Node n)
    {
        // create a queue using Linkedlist 
        Queue<Node> q = new LinkedList<>();
        q.add(n); // root node add 
        q.add(null); 

        // loop until when -? until queue is empty 
        while(!q.isEmpty())
        {
            Node currnode = q.remove();
            if(currnode == null)
            {
                System.out.println(); // print null(nextline)
                if(q.isEmpty())  // if all next nodes are null 
                    break; 
                else 
                    q.add(null); // add null again 


            } 
            else {
                System.out.print(currnode.key + " "); // print out the latest key 

                if(currnode.left !=null) // check for left subtree  & add them to q
                {
                    q.add(currnode.left);
                }
                if(currnode.right != null) // check for right subtree & add them to q 
                {
                    q.add(currnode.right);
                }

            }
            
        }
        
    }
}



public class traversal {
    public static void main(String[] args) {
        // create obj of tree traversal 
        TreeTraversal t = new TreeTraversal();
        //create binary tree first 
        t.root = new Node('A'); // char key 
        // left side of the tree 
        t.root.left = new Node('B');
        t.root.left.left = new Node('D');
        t.root.left.right = new Node('E');

        // right side of the tree 
        t.root.right = new Node('C');
        t.root.right.left = new Node('F');

        System.out.println("preorder: ");
        t.preorder(t.root);
        
        System.out.println();

        System.out.println("postorder: ");
        t.postorder(t.root);

        System.out.println();

        System.out.println("inorder: ");
        t.inorder(t.root);

        System.out.println();

        System.out.println("the level order for this is : ");
        t.levelorder(t.root);
        

    }
}
 