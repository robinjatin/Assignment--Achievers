/*Given an array of n integers where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are m students, the task is to distribute chocolate packets such that:

Each student gets one packet.
The difference between the number of chocolates in packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
Examples:

Input : arr[] = {7, 3, 2, 4, 9, 12, 56}
m = 3
Output: Minimum Difference is 2
We have seven packets of chocolates and
we need to pick three packets for 3 students
If we pick 2, 3 and 4, we get the minimum
difference between maximum and minimum packet
sizes.*/
import java.util.Arrays;
import java.util.Scanner;
public class chocolatemin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input size");
		int n = sc.nextInt();
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter size of m");
		int m = sc.nextInt();
		Arrays.sort(arr);
		int min=arr[0];
		for(int i=0;i<=n-m;i++)
		{
			int diff=arr[i+m-1]-arr[i];
			if(diff<min)
			{
				min=diff;
			}
		}
		System.out.println("The difference is: "+min);
	}
}
