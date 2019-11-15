import java.util.*;
public class balancedparenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Character> stk=new Stack<Character>();
		String str=new String();
		System.out.println("Enter the string");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='{'||ch=='['||ch=='(')
			{
				stk.push(ch);
			}
			else if(ch=='}'&&stk.peek()=='{'||ch==']'&&stk.peek()=='['||ch==')'&&stk.peek()=='(')
			{
				stk.pop();
			}
		
		}
		if(	stk.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Unbalanced");
		}
	}
}
