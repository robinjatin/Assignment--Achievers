import java.util.Scanner;
class Node
{
	int data;
	Node left;
	Node right;
	
	Node(int d)
	{
		data = d;
		left = null;
		right = null;
	}
}
public class Checkbst {

	static Node root;
	static int n;
	static int count1,count2=0,count=0;
	
	Checkbst()
	{
		root = null;
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
	public static int check(Node root)
	{
		if(root.left!=null||root.right!=null)
		{
			if(root.data<root.left.data) {
				return 0;
			}
			else if(root.data>root.right.data)
			{
				return 0;
			}
			else {
				check(root.left);
				check(root.right);
			}
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkbst bst = new Checkbst();
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the elements");
		root=new Node(sc.nextInt());
		root.left=new Node(sc.nextInt());
		root.right=new Node(sc.nextInt());
		root.left.left=new Node(sc.nextInt());
		root.left.right=new Node(sc.nextInt());
		root.right.left=new Node(sc.nextInt());
		root.right.right=new Node(sc.nextInt());
		 int a=check(root);
		 if(a==1)
		 {
			 System.out.println("It is a BST");
		 }
		 else
		 {
			 System.out.println("It is not a BST");
		 }
	}
}
