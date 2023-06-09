import java.util.*;
class Node
{
    int data;
    Node left,right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}

class createTree
{
    static Node create()
    {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if(data == -1)
        {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left data" +root.data);
        root.left = create();
        System.out.println("Enter the right data" +root.data);
        root.right = create();
        return root;
    }
     public static void main(String args[])
    {
        Node root = create();
    }
    
}
/*class main
{
    public static void main(String args[]);
    {
        Node root = create();
    }
}*/