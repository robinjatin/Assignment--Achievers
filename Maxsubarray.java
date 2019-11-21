import java.util.*;
public class Maxsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the window size");
		int k=sc.nextInt();
		int a=0;
		int arr1[]=new int[n+k];
		for(int i=0;i<n-k+1;i++)
		{
			int max=arr[i];
			for(int j=i;j<i+k;j++)
			{
				if(arr[j]>=max)
					{
					max=arr[j];
					}
			}
			arr1[a]=max;
			a++;
		}
		for(int i=0;i<a;i++)
		{
			System.out.println(arr1[i]+" ");
		}
	}

}
