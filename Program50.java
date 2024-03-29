import java.util.Scanner;
public class Program50
{
public static void main(String args[])
{
   Scanner scanner=new Scanner(System.in);
   System.out.println("ENTER THE ROWS");
   int row=scanner.nextInt();
   System.out.println("OUTPUT");

   for(int i=row;i>=1;i--)
    {
      for(int k=row;k>=i;k--)
      {
       System.out.print(" ");
      }
     for(int j=1;j<=i;j++)
      {
        System.out.print(i+" ");
      }
      System.out.println();
    }

  
}
}