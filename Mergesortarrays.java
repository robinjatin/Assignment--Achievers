//Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).
import java.util.*;
public class Mergesortarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the input size of array 1");
		n1=sc.nextInt();
		System.out.println("Enter the input size of array 2");
		n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<n1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements of array 2");
		for(int i=0;i<n2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n3=n1+n2;
		int arr3[]=new int[n3];
		int k=0,i=0,j=0;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr3[k]=arr1[i];
				i++;
			}
			else
			{
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr3[k]=arr2[j];
			j++;
			k++;
		}
		System.out.println("The merged sorted array is: ");
		for(int d=0;d<n3;d++)
		{
			System.out.print(arr3[d]+" ");
		}
	}
}
