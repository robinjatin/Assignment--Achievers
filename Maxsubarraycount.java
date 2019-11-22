import java.util.Scanner;
public class Maxsubarraycount {

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
		System.out.println("Enter the element to check the maximum subarray with");
		int k1=sc.nextInt();
		int a=0;
		int arr1[]=new int[100];
		for (int i=0; i <n; i++) 
		{
			for (int j=i; j<n; j++)   
			{
				int max=0;
				for (int k=i; k<=j; k++) 
 
				{
					
				if(arr[k]>max)
				{
					max=arr[k];
					
				}
					
				}
				arr1[a]=max;
				a++;
				
			}
		}
		int count=0;
		for(int i=0;i<a;i++)
		{
			if(arr1[i]>k1)
			{
				count++;
			}
		}
		System.out.println(" The count is: "+ count);
	}

}
