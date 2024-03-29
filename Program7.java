import java.util.Scanner;
public class Program7
{
 public static void main(String[]args)
  {
    Scanner sc=new Scanner (System.in);
    System.out.print("ENTER THE STRING FOR ODD LENGTH:");
    String string=sc.nextLine();
    int len=string.length();
    
    if(len%2==0)
    {
      System.out.print("STRING LENGTH IS EVEN");
    }
   else
    {
      for(int i=0;i<len;i++)
      {
         for(int j=0;j<len;j++)
         {
           if(i==j)
             {
              System.out.print(string.charAt(i)+" ");
              }
           else if(i+j==(len-1))
             {
              System.out.print(string.charAt(i)+" ");
              }
           else{
              System.out.print("  "); 
           }
          }
       System.out.println(""); 
      }
    }
    
  }
}