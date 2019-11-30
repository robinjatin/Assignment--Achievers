/*Given two numbers represented by two lists, write a function that returns the sum list. The sum list is list representation of the addition of two input numbers.
Input: List1: 5->6->3  // represents no. 365
List2: 8->4->2 //  represents no. 248
Output: Resultant list: 3->1->6  // represents number 613*/

import java.util.Scanner;
public class SumLL {	
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
	 Node head;
	void insert(int data)
	{
		 Node newNode=new Node(data);
	       if(head==null)
	       {
	           head=newNode;
	           return;
	       }
	       Node current=head;
	       while(current.next!=null)
	       {
	           current=current.next;
	       }
	       current.next=newNode;
	       return;
	}
	 void display()
	{
		Node current=head;
	    while(current!=null)
			{
			    System.out.print(current.data+" ");
			   current=current.next;
			}
	}
    public static SumLL sum(SumLL li1,SumLL li2)
    {
        Node current1=li1.head;
        Node current2=li2.head;
        int num1=0;
        int num2=0;
        int n=0;
        while(current1!=null)
        {
            num1=num1+current1.data*(int)Math.pow(10,n);
           current1=current1.next;
            n++;
        }
        n=0;
        while(current2!=null)
        {
            num2=num2+current2.data*(int)Math.pow(10,n);
            current2=current2.next;
           n++;
        }
        int num3=num1+num2;
        SumLL li3=new SumLL();
        int rem=0;
        while(num3!=0)
        {
            rem=num3%10;
            li3.insert(rem);
            num3=num3/10;
        }
        return li3;
    }

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		SumLL li=new SumLL();
		SumLL li1=new SumLL();
		SumLL li2=new SumLL();
		System.out.println("Enter the amount of elements you want to enter in LL1 and LL2");
		int n=sc.nextInt();
		System.out.println("Enter the elements in LL1");
		for(int i=0;i<n;i++)
		{
			li.insert(sc.nextInt());
		}
		
		System.out.println("Enter the elements in LL2");
		for(int i=0;i<n;i++)
		{
			li1.insert(sc.nextInt());
		}
		
		System.out.println("Sum of LinkedLists");
		li2=sum(li,li1);
		li2.display();
	}
}
