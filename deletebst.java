import java.util.*;
class deletebst
{
    static class Node
    {
        int data;
        Node left;
        Node right;
    
    
    Node(int data)
    {
        this.data = data;
    }
    }
    
    public static Node create(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }
        if(root.data > val)
        {
            root.left = create(root.left,val);
        }
        else
        {
            root.right = create(root.right,val);
        }
        return root;
    }
    
    static void inorder(Node root)
    {
        if (root== null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    
    static boolean search(Node root,int key)
    {
        if(root == null)
        {
            return false;
        }
        else if(root.data == key)
        {
            return true;
        }
        else if(root.data > key)
        {
            return search(root.left,key);
        }
        else 
        {
            return search(root.right,key);
        }
    }
    
    static Node delete(Node root,int val)
    {
        if(root.data > val)
        {
            root.left = delete(root.left,val);
        }
        else if(root.data < val)
        {
            root.right = delete(root.right,val);
        }
        else
        {
            ///case 1
            if(root.left == null && root.right == null)
            {
                return null;
            }
            
            
            //case 2
            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            
            ////case 3
            Node Is = inorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right,Is.data);
        }
        return root;
    }
    
    public static Node inorderSuccessor(Node root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }
    public static void main(String args[])
    {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        
        for(int i=0;i<values.length;i++)
        {
            root = create( root,values[i]);
        }
        
        inorder(root);
        System.out.println();
         
        /* if(search( root,7))
         {
             System.out.println("found");
         }
         else
         {
             System.out.println("not found");
         }*/
         
         delete( root,4);
        inorder(root);
    }
}    
    
   
  
