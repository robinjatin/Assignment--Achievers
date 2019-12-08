import java.util.Scanner;
public class BSTLeaf
{

	static class Node {
		int data;
		Node left;
		Node right;
		Node()
		{
			left=right=null;
		}
		Node(int data)
		{
			this.data=data;
		}

}
	static Node root;
	BSTLeaf()
    {
        root=null;
    }
	BSTLeaf(int data)
    {
        root=new Node(data);
    }
	public static void insert(int data)
	{
		root = insertitem(root,data);
	}
	public static Node insertitem(Node root,int data)
	{
		if(root == null)
		{
			root = new Node(data);
		}	
		else
		{
			if(data < root.data)
				root.left = insertitem(root.left,data);	
			else if(data > root.data)	
				root.right = insertitem(root.right,data);	
		}
		return root;
	}
	public static void leaf(Node root) {
		if(root==null)
			return;
		if(root.right==null && root.left==null)
			System.out.println(root.data+" ");
		leaf(root.left);
		leaf(root.right);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input size");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		BSTLeaf lf=new BSTLeaf();
		for(int i=0;i<n;i++)
		{
			lf.insert(sc.nextInt());
		}
        lf.leaf(root);
	}
}
