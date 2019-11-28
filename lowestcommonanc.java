//Write a Java program to find the lowest common ancestor in a binary tree
import java.util.Scanner;
class lowestcommonanc
{   
    public static Node root;
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
        }
    }
    lowestcommonanc()
    {
        root=null;
    }
    lowestcommonanc(int data)
    {
        root=new Node(data);
    }
    public static Node lca(Node root,int a,int b)
    {
        if(root==null||root.data==a||root.data==b)
            return root;
        Node left= lca(root.left,a,b);
        Node right= lca(root.right,a,b);
        if(left!=null && right!=null)
            return root;
        if(left!=null)
            return left;
        if(right!=null)
            return right;
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the tree");
        lowestcommonanc t=new lowestcommonanc(sc.nextInt());
        t.root.left=new Node(sc.nextInt());
        t.root.right=new Node(sc.nextInt());
        t.root.left.left=new Node(sc.nextInt());
        t.root.left.right=new Node(sc.nextInt());
        t.root.right.left=new Node(sc.nextInt());
        t.root.right.right=new Node(sc.nextInt());
        System.out.println("Enter Nodes of which you want to find the lowest ancestor of");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Node n=t.lca(t.root,a,b);
        System.out.println("Lowest common ancestor of ("+a +", "+b+") = "+n.data);
    }
}
