import java.util.*;
public class LinkedList1 {
	static Node head;
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
	public static void insert(LinkedList1 li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node last=li.head;
			int flag=0;
			while(last!=null)
			{
				if(last.data==data)
				{
					flag++;
				}
				last=last.next;
			}
			if(flag==0)
			{
				Node last1=li.head;
				while(last1.next!=null)
				{
					last1=last1.next;
				}
			last1.next=newNode;
			}
		}
	
	}
	public static void display(LinkedList1 li)
	{
		Node current=li.head;
		System.out.println("The LinkedList is as follows: ");
		while(current.next!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
		System.out.print(current.data);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		LinkedList1 li=new LinkedList1();
		System.out.println("Enter the amount of elements you want to enter");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			li.insert(li,a);
		}
		System.out.println("Displaying the linkedlist after removal of duplicate elements");
		display(li);
	}
}
