package binarytree;


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


    public static void main(String[] args)
    {
        // a sequence is given preorder --> create a tree according to the sequence 
        int arr[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6, -1,-1};
        // -1 stands for NULL 
        Bintree bt = new Bintree();
        Node root = bt.buildbintree(arr);
        System.out.println(root.data);


    }
}
