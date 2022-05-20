package binarytree;

/*
--> BUILD TREE 
--> COUNT OF NODES 
--> SUM OF NODES 
--> HEIGHT OF NODES 

*/

public class buildtree {


static class Node {
    int data ;
    Node left;
    Node right;

    //constructor 
    Node (int data)
    {
        this.data = data ;
        this.left = null;
        this.right = null;

    }

}

static class Bintree{
    static int index = -1 ;
    public static Node buildbintree(int arr[])
    {
        index++;
        // form a null node 
        if(arr[index] == -1 )
            return null ;
        
        Node newnode = new Node(arr[index]);
        newnode.left = buildbintree(arr);
        newnode.right = buildbintree(arr);

        return newnode;


    }
}


    public  static int countofNodes(Node root)
    {

        //base case 
        if(root == null)
            return 0; 

        int left = countofNodes(root.left);
        int right = countofNodes(root.right);

        return left+ right+ 1 ;

    }

    public static int sumofNodes(Node root)
    {
        //base case 
        if(root == null)
            return 0 ;
        
        int leftsum = sumofNodes(root.left);
        int rightsum = sumofNodes(root.right);

        return leftsum + rightsum + root.data;
    }

    public static int heightofNodes(Node root)
    {
        // base case 
        if(root == null)
        {
            return 0;
        }

        int leftheight = heightofNodes(root.left);
        int rightheight = heightofNodes(root.right);

        int finalheight = Math.max(leftheight, rightheight) + 1 ;
        return finalheight;
    }


    public static void main(String[] args)
    {
        // a sequence is given preorder --> create a tree according to the sequence 
        int arr[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6, -1,-1};
        // -1 stands for NULL 
        Bintree bt = new Bintree();
        Node root = bt.buildbintree(arr);
        System.out.println(root.data); // this only prints the root 

        System.out.println(countofNodes(root));

        System.out.println(sumofNodes(root));

        System.out.println(heightofNodes(root));


    }
}
