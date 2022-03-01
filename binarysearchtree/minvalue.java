package binarysearchtree;


/*
     FIND THE MINIMUM VALUE NODE IN BST 

     -> minimum values --> will be at the left 
     traverse from root till left , until left == null 
     when left = null , its the mininmum node 

*/


class Node {
    char key ;
    Node left, right ;

    Node(char key){
        this.key = key ;
        
    }
}


class BST{
    Node root ;

    // INSERT  elements into BST  --> just to take input 
    

// LOGIC FOR INSERTION IN BST 
    Node insertintree(Node root, char key)
    {
       if(root == null) // no node in tree
       {
           root = new Node(key);
           return root ;
       }
       // if key is less than root node -->left child 
       if( key < root.key)
       {
           root.left = insertintree(root.left, key);
       }
       else if( key > root.key)
       {
           root.right = insertintree(root.right, key);
       }
       
        return root;

    }

    // FIND MIN IN TREEE 
    char min(Node root)
    {
        Node current = root ;
        while (current.left != null)
        {
            current = current.left;
        }
        
        
        return (current.key);

    }

}
public class minvalue {
    public static void main(String[] args) {
        BST bst = new BST();
       

        // insert
        Node root = null;
       root = bst.insertintree(root, 'P'); 
        bst.insertintree(root, 'C');
        bst.insertintree(root,'I');
        bst.insertintree(root, 'B');
        bst.insertintree(root, 'G');
        bst.insertintree(root,'M');
        bst.insertintree(root,'A');

   
        System.out.println("Minimum value in bst is "  + bst.min(root));
    }
}
