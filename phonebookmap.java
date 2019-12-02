/*You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. For each query, print the phone number of that person.

Input Format

The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.

Sample Input

3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
Sample Output

uncle sam=99912222
Not found
harry=12299933*/
import java.util.*;
public class phonebookmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String, Integer> hmap= new HashMap<>();
		System.out.println("Enter the input size");
		int n=sc.nextInt();
		System.out.println("Enter the name and phone number");
		for(int i=0;i<n;i++)
		{
			String s=sc.next();
			int a=sc.nextInt();
			hmap.put(s,a);
		}
		System.out.println("Enter the name of person whose phone number you want to print");
		for(int i=0;i<n;i++)
		{
			String s1=sc.next();
			if(hmap.get(s1)!=null)
			{
				System.out.println(s1+" = "+hmap.get(s1));
			}
			else
			{
				System.out.println("Not Found");
			}
		}
	}
}
