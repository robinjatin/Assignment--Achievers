//Max number
import java.util.*;
public class LargestNumber 
{

    public static String formLargest(List<String> list)
    {
        Collections.sort(list,new Comparator<String>() 
        {
            public int compare(String a,String b )
            {
                String ab = a+b;
                String ba = b+a;

                return (ab.compareTo(ba) > 0) ? -1 : 1;
            }
        });
        String num="";

        for (int i = 0; i < list.size(); i++) 
        {
            num +=list.get(i);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the input size");
        int n = sc.nextInt();

        List<String> list = new ArrayList<String>();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) 
        {
            list.add(Integer.toString(sc.nextInt()));
        }
        System.out.println("Max number is");
        System.out.println(formLargest(list));
        
        sc.close();
    }
}
