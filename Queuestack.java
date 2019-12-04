//Write a Java program to implement a queue using 2 stacks
import java.util.Scanner;
public class Queuestack {

	Node top;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Queuestack()
	{
		top=null;
	}
	public  void push(int data)
	{
		Node temp=new Node(data);
		if(temp==null)
		{
			System.out.println("overflow");
			return;
		}
		else
		{
			temp.data=data;
			temp.next=top;
			top=temp;
		}
	}
	public  void pop()
	{
		if(top==null)
		{
			System.out.println("empty");
			return;
		}
		top=top.next;
	}
	public  void display()
	{
		Node current=top;
		while(current.next!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.print(current.data);
	}

	public  boolean isEmpty()
	{
		return top==null;
	}
	public  int peek(Queuestack q1)
	{
		if(!isEmpty())
		{	
			return top.data;
		}
		else
			return -1;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Queuestack s1=new Queuestack();
		Queuestack s2=new Queuestack();
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			int d=sc.nextInt();
			s1.push(d);
		}
		System.out.println("Stack is: ");
		s1.display();
		for(int i=0;i<n;i++)
		{
			int z=s1.peek(s1);
			s1.pop();
			s2.push(z);
		}
		System.out.println("\nQueue after using 2 stacks is:");
		s2.display();
		s2.pop();
		System.out.println("After dequeue of the stack:");
		s2.display();

	}	

}
