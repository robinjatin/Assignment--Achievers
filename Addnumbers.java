import java.util.Scanner;
public class Addnumbers {
	public static void main(String arg[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the two numbers you want to add");
		int a=in.nextInt();
		int b=in.nextInt();
		while(a!=0) {
			a--;
			b++;
		}
		System.out.println("The sum is: "+b);
	}
}
