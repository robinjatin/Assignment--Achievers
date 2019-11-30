import java.util.Scanner;
class Node{
	int data;
	Node left,right;
	Node(int d){
		data=d;
	}
}
public class LeftBT{
	static Node root;
	LeftBT(){
		root=null;
	}
	static int n=0;
	static void print(Node root,int x){
		if(root==null)
			return ;
		if(n<x){
			System.out.print(root.data+" ");
			n=x;
		}	
		print(root.left,x+1);
		print(root.right,x+1);	
	}
	static void display(){
		print(root,1);
	}
	public static void main(String[] args){
		LeftBT tree=new LeftBT();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements");
		root = new Node(sc.nextInt());
		root.left = new Node(sc.nextInt());
		root.right = new Node(sc.nextInt());
		root.left.left = new Node(sc.nextInt());
		root.left.right = new Node(sc.nextInt());
		root.right.left = new Node(sc.nextInt());
		root.right.right = new Node(sc.nextInt());
		display();		
	}
}
