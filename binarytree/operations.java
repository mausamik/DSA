package binarytree;

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
}



public class operations {
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

        t.preorder(t.root);
        System.out.println();
        t.postorder(t.root);
        System.out.println();
        t.inorder(t.root);
        

    }
}
 