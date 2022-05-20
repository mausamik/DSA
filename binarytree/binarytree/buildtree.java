package binarytree;



/*
--> BUILD TREE 
--> COUNT OF NODES 
--> SUM OF NODES 
--> HEIGHT OF NODES 
--> DIAMETER OF NODES (no of nodes in the longest path) 
        2 approaches 



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

// diameter approach  1 with O(n2) time complex 
    public static int diameter(Node root)
    {
        // base case 
        if(root == null)
            return 0 ;
        
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);

        int diam3 = heightofNodes(root.left) + heightofNodes(root.right) + 1 ;

        int finaldiam = Math.max(diam3, Math.max(diam1, diam2));
        return finaldiam;
    }


    // Diameter approach 2 with O(n) time compl. 
    static class TreeInfo
    {
        int ht;
        int diam; 

        TreeInfo(int ht, int diam)
        {
            this.ht = ht ;
            this.diam = diam ; 

        }
    }

    // fucntion 
    public static TreeInfo diameter2(Node root)
    {
        if(root == null)
            return new TreeInfo(0, 0);
        
        
        //store left subtree and store right subtree
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        // final height
        int myheight = Math.max(left.ht, right.ht) + 1;

        // extract my diameters 
        int d1 = left.diam;
        int d2 = right.diam;
        int d3 = left.diam + right.diam + 1 ;

        int mydiam = Math.max(d3, Math.max(d1,d2));

        // we have return type as class  --> create an object 
        TreeInfo t = new TreeInfo(myheight, mydiam);
        return t ; 


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

        System.out.println(diameter(root));

        System.out.println(diameter2(root).diam);  // we have TreeInfo as class, and we are printing one attribute(diam) of this class 



    }
}
