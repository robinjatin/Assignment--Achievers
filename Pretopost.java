import java.util.*;
public class Pretopost {
	public static void main(String[] args) {
		// ToDo Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the prefix expression");
		  String str=sc.next();
		  Stack s=new Stack();
		  for(int i=str.length()-1;i>=0;i--)
		  {
			  if(str.charAt(i)=='/' || str.charAt(i)=='*' || str.charAt(i)=='+' || str.charAt(i)=='-')
			  {
				  String strr=(String) s.peek();
				  s.pop();
				  String strrr= (String) s.peek();
				  s.pop();
				  String strrrrr=strr+strrr+str.charAt(i);
				  s.push(strrrrr);
			  }
			  else
			  {
				  s.push(str.charAt(i)+"");
			  }
		  }
		  System.out.println("Enter the postfix expression");
		  for(int i=0;i<s.size();i++)
		  {
			  System.out.println(s.pop());
		  }
	}
}
