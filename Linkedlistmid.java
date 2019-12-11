import java.util.Scanner;
//Entering data in the middle of the linkedlist
public class Linkedlistmid
{
	static Node head;
	static class Node
	{
		Node next;
		int data;
		Node(int d)
		{
			data=d;
			next=null;
		}
}
	public static Linkedlistmid insert (Linkedlistmid li,int data) {
		Node newNode=new Node(data);
		newNode.next=null;
			if(li.head==null)
			{
				li.head=newNode;
			}
			else
			{
				Node last=li.head;
				while(last.next!=null)
				{
					last=last.next;
				}
				last.next=newNode;
			}
			return li;
	}
	public static Linkedlistmid mid(Linkedlistmid li,int data,int index)
	{
		int count=0;
		Node newNode=new Node(data);
		Node cur=head;
		while(count<index)
		{
			count++;
			cur=cur.next;
		}
		newNode.next=cur.next;
		cur.next=newNode;
		return li;
	}
	public static void display(Linkedlistmid li)
	{
		Node cur=head;
		while(cur.next!=null)
		{
			System.out.print(cur.data+" ");
			cur=cur.next;
		}
		System.out.print(cur.data+" ");
	}
	public static void main(String[] args)
	{
		Linkedlistmid li=new Linkedlistmid();
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements");
		int n =sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int z=sc.nextInt();
			insert(li,z);
		}
		System.out.println("original LinkedList is");
		display(li);
		int mid=n/2;
		System.out.println("\nEnter data you want to insert at the mid");
		int z=sc.nextInt();
		mid(li,z,mid);
		System.out.println("New LinkedList is");
		display(li);
	}

}
