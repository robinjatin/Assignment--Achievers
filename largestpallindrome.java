import java.util.*;
public class largestpallindrome {
	public static String palin(String str,int n1)
	{
		int n=str.length();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)==str.charAt(n-i-1))
			{
				flag++;
			}
		}
		if(flag==n&&flag>1)
		{
			//System.out.print(str+" ");
		return str;
		}
		else
			return "%";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter the string");
		str=sc.nextLine();
		int n=str.length();
		int flag=0;
		int a=0;
		String strarr[]=new String[200];
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				strarr[a]=palin(str.substring(i,j),n);
				a++;
			}
		}
		int max=strarr[0].length();
		String str1=new String();
		for(int i=0;i<a;i++)
		{
			if(strarr[i].length()>max&&strarr[i]!=null)
			{
				max=strarr[i].length();
				str1=strarr[i];
			}
			else if(strarr[i]==null||strarr[i]=="%")
			{
				flag++;
			}
				
		}
		if(flag==a)
		{
			System.out.println("No pallindromes present");
		}
		else
		System.out.println("Longest pallindrome is: "+ str1);
	}
}
