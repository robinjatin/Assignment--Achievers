/*Given two unsorted arrays A of size N and B of size M of distinct elements, the task is to find all pairs from both arrays whose sum is equal to X.
I/p : 5 5 9
1 2 4 5 7
5 6 3 4 8

I/p : 2 2 3
0 2
1 3

O/p : 1 8, 4 5, 5 4
O/p :  0 3, 2 1
*/
import java.util.Scanner;
public class Arrayssumcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first and then the second array");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		System.out.println("Enter the value of x of which you want to find the equivalent pairs to");
		int x=sc.nextInt();
		System.out.println("Enter the elements of the first array");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of the second array");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(arr1[i]+arr2[j]==x)
				{
					System.out.println("The pair is: "+arr1[i]+", "+arr2[j]);
					flag++;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("There are no pairs present");
		}
	}
}
