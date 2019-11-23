import java.util.Scanner;
public class Doublylinkedlistrev {
	static Node head;
	public static Scanner sc=new Scanner(System.in);
	static class Node
	{	
		int data;
		Node prev;
		Node next;
		Node(int d)
		{
			data=d;
			
		}
	}
	public static Doublylinkedlistrev insert(Doublylinkedlistrev li,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(li.head==null)
		{
			li.head=newNode;
			newNode.next=null;
			newNode.prev=null;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
			newNode.prev=last;
			newNode.next=null;
			
		}
		return li;
	}
	public static void display(Doublylinkedlistrev li)
	{
		Node current=li.head;
		if(li.head==null)
		{
			System.out.println("No list is present");
		}
		else
		{
			System.out.println("The list is: ");
			while(current.next!=null)
			{
				System.out.println(current.data);
				current=current.next;
			}
			System.out.println(current.data);
		}
	}
	public static void displayrev(Doublylinkedlistrev li)
	{
		if(li.head==null)
		{
			System.out.println("No list is present");
		}
		else
		{
			   Node tail = li.head;  
			    while (tail.next != null) 
			    {  
			        tail = tail.next;  
			    }   
			    while (tail != li.head) 
			    {  
			    	
			        System.out.println(tail.data);  
			        tail = tail.prev;  
			    }  
			    System.out.println( tail.data );
		}
	}
	public static void main(String[] args){
		Doublylinkedlistrev li=new Doublylinkedlistrev();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input size");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			insert(li, sc.nextInt());
		}
		System.out.println("Press 1 for displaying normally and 2 for reversed");
		int c=sc.nextInt();
		switch(c)
		{
		case 1:
		{
			display(li);
			break;
		}
		case 2:
		{
			displayrev(li);
			break;
		}
		default:
		{
			System.out.println("Invalid input");
		}
		}
		
	}
}
