import java.util.Scanner;
public class sumindexsubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number of which you want to compare the sum of subarrays to");
		int num=sc.nextInt();
		int total=0,flag=0;
		for(int i=0;i<n;i++)
		{
			total=0;
			for(int j=i;j<n;j++)
			{

					total=total+arr[j];
					if(total==num)
					{
						flag++;
						System.out.println("The starting index is:"+i+"\n The ending index is:"+j);
						break;
					}
			}
		}
		if(flag==0)
		{
			System.out.println("Sum of subarrays aren't equal to the number");
		}
	}
}
