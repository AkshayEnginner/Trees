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
        System.out.println("Enter  data in left of " +root.data);
        root.left = create();
        System.out.println("Enter  data in right of " +root.data);
        root.right = create();
        return root;
    }
    static void  inorder ( Node root)
    {
         if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
        
    }
     static void  preorder ( Node root)
    {
         if(root == null)
        {
            return;
        }
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
        
    }
     static void  postorder ( Node root)
    {
         if(root == null)
        {
            return;
        }
        inorder(root.left);
       
        inorder(root.right);
         System.out.println(root.data);
        
    }
     
     
    
    public static void main(String args[])
    {
        Node root = create();
        System.out.println("INORDER :-");
        inorder(root);
        System.out.println("PREORDER :-");
        preorder(root);
        System.out.println("POSTORDER :-");
        postorder(root);
        
    }
}