import java.util.*;
public class Recursivedupdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=new String();
		str=sc.next();
		int n=str.length();
		String str1="";
		for(i=0;i<n-1;i++)
		{
			if(i==0)
			{
			if(str.charAt(i)!=str.charAt(i+1))
				{
					str1+=str.charAt(i);
				}
			}
			else if(i>0)
			{
				if(str.charAt(i)!=str.charAt(i+1)&&str.charAt(i)!=str.charAt(i-1))
				{
					str1+=str.charAt(i);
				}	
			}
		}
		if(str.charAt(n-1)!=str.charAt(n-2))
		{
			str1+=str.charAt(n-1);
		}
		System.out.print(str1);
	}
}
