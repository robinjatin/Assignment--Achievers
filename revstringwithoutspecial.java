import java.util.*;
public class revstringwithoutspecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter the string");
		str=sc.nextLine();
		char ch1[]=new char[str.length()];
		char ch2[]=new char[str.length()];
		int a=0,b=0,c=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>=33&&ch<=64||ch>=91&&ch<=96||ch>=123&&ch<=126)
			{
				ch1[a]= ch;
				a++;
			}
			else
			{
				ch2[b]=ch;
				b++;
			}
		}
		char ch3[]=str.toCharArray();
		char ch4[]=new char[b];
		for(int i=0;i<b;i++)
		{
			ch4[i]=ch2[b-i-1];
		}
		int e=0,f=0;
		System.out.println("The reversed string is:");
		for(int i=0;i<str.length();i++)
		{
			if(ch3[i]>=33&&ch3[i]<=64||ch3[i]>=91&&ch3[i]<=96||ch3[i]>=123&&ch3[i]<=126)
			{
				System.out.print(ch1[e]);
				e++;
			}
			else
			{
				System.out.print(ch4[f]);
				f++;
			}
		}
	}
}
