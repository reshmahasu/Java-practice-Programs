import java.util.Scanner;
public class Program49
{
public static void main(String args[])
{
   Scanner scanner=new Scanner(System.in);
   System.out.println("ENTER THE ROWS");
   int row=scanner.nextInt();
   System.out.println("OUTPUT");

   for(int i=1;i<=row;i++)
    {
      for(int k=1;k<i;k++)
      {
       System.out.print(" ");
      }
     for(int j=i;j<=row;j++)
      {
        System.out.print("*" + " ");
      }
      System.out.println();
    }

  
}
}