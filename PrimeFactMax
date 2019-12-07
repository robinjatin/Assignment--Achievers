//Find the highest prime number which is a factor of a number
import java.util.Scanner;
public class PrimeFactMax {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int max=0;
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			while(n%i==0)
			{
				if(i>max) 
				{
					max=i;
				}
				n=n/i;
			}
		}
		System.out.println("Highest factor of the number which is a prime number is: "+max);
	}
}
