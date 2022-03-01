package binarysearchtree;



class Node{
    char key;
    Node left , right ;

    Node(char key){
        this.key = key ;
    }
}

class BinarySearchTree{
    Node root ;

    // INSERT  elements into BST  --> just to take input 
    void insertkey(char key)
    {
        // if there are already some nodes present, create a new funtion 
        root = insertintree(root,key);
        

    }

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

    // SEARCH  a given Key in BST 

    Node recursivesearch(Node root, char key)
    {
        // base case : if key is present at root node  / root is null 
        if(root == null || root.key == key)
        {
            return root ;
        }

        // base case 2 : 
        // if my root  is less than  key 
        if(key > root.key)
        {
            return recursivesearch(root.right, key);
        }
       

            return recursivesearch(root.left , key);
     
    }

    // to print this search result 
    boolean search(char key)
    {
        root = recursivesearch(root, key);
        if(root != null)
            return true;
        else
            return false ;
    }


    /*
    DELETE FUNC :
         1. Node to be deleted is simply the leaf --> simple remove from the tree 
         2. Node to be deleted has one child --> copy child to node , then delete
         3. Node to be deleted has 2 children 
             50
           /     \
          40      70
                 /  \
                60   80

            if we want to delete 50  --> 
                 go to right subtree 
                 find mininum in right tree 
                 replace it with root node 
         
    */
    // DELETE FUNCTION 
    void deletekey(char key)
    {
        root = recursiveDelete(root, key);
    }
// LOGIC FOR DELETE FUNCTIONS 
    Node recursiveDelete(Node root , char key)
    {
        // base case :
        // tree is empty 
        if(root == null)
        {
            return root ;
        }

        // case 2 :
        if ( key < root.key)
        {
            root.left = recursiveDelete(root.left, key);
        }
        else if (key > root.key)
        {
            root.right = recursiveDelete(root.right, key);
        }

        // if key is same as root 
        else {

            // node with only one child or no child 
            if(root.left == null)
            {
                return root.right;
            }
            else if (root.right == null)
            {
                return root.left ;
            }

            // if has 2 children --> find min in the right tree
            root.key = minvalue(root.right);

            // delete it 
            root.right = recursiveDelete(root.right, root.key);


        }
        
        
        return root;

    }

    char minvalue(Node root)
    {
        char minv = root.key;
        while(root.left != null)
        {
            minv = root.left.key;
            root = root.left ;

        }
        return minv;
        
    }

    

    // TRAVERSAL of the tree 
    void preorder(Node root)
    {
        if(root != null)
        {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void inorder(Node root)
    {
        if(root != null)
        {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
}






public class bstoperations {
    public static void main(String[] args) {
        
        // make obj for class 
        BinarySearchTree bst = new BinarySearchTree();
        // insert nodes 
        bst.insertkey('C');
        bst.insertkey('I');
        bst.insertkey('B');
        bst.insertkey('G');
        bst.insertkey('M');
        bst.insertkey('A');

        bst.preorder(bst.root);

        System.out.println();

        boolean b = bst.search( 'A');       
        System.out.println(b);

        bst.deletekey('M');
        bst.inorder(bst.root);
    }
}
