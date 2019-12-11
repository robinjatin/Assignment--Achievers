import java.util.*;
//printing a 2d array in spiral order
public class Spiralarray {
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of rows");
     int r=sc.nextInt();
     System.out.println("Enter the number of columns");
     int c=sc.nextInt();
     System.out.println("Enter the elements");
     int arr[][]=new int[r][c];
     for(int i=0;i<r;i++)
     {
         for(int j=0;j<c;j++)
         {
             arr[i][j]=sc.nextInt();
         }
     }
     int rows=0;
     int columns=0;
     while(rows<r&&columns<c)
     {
         for(int i=0;i<r;i++)
         {
             System.out.print(arr[rows][i]+" ");
         }
         rows++;
         for(int i=rows;i<c;i++)
         {
             System.out.print(arr[i][c-1]+" ");
         }
         r--;
         if(rows<c)
         {
             for(int i=r-1;i>=columns;i--)
             {
                 System.out.print(arr[c-1][i]+" ");
             }
             c--;
         }
         if(columns<r)
         {
             for(int i=c-1;i>rows;i--)
             {
                 System.out.print(arr[i][columns]+" ");
             }
             columns++;
         }
     }
 }
}
