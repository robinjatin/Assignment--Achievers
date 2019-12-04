//Write a Java Program to implement a stack using 2 queues
import java.util.*;
public class Stackqueue {
	static Queue <Integer>q1=new LinkedList<>();
	static Queue <Integer>q2=new LinkedList<>();
	public static void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}
	public static void pop() {
		q1.remove();
	}
	public static void peek() {
		System.out.println(q1.element());
		System.out.println(q1);
	}
	public static void Stackqueue(String[] args) {
		Stackqueue qs1=new Stackqueue();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			qs1.push(sc.nextInt());
		}
		qs1.pop();
		qs1.peek();
	}
}
