
import java.util.*;
public class Arrayfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of inputs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter inputs");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		int arr1[]=new int[max+1];
		for(int i=0;i<n;i++)
		{
			arr1[arr[i]]++;
		}
		for(int i=0;i<=max;i++)
		{
			if(arr1[i]>0)
			{
				System.out.println(i+" occurs "+arr1[i]+" times");
			}
		}
	}
}
