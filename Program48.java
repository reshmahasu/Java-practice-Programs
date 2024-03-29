import java.util.Scanner;
public class Program48
{
public static void main(String args[])
{
   Scanner scanner=new Scanner(System.in);
   System.out.println("ENTER THE ROWS");
   int row=scanner.nextInt();
   System.out.println("OUTPUT");


    for(int i=row;i>=1;i--){
            for(int j=i; j>1;j--){
                System.out.print(" ");
            }
            for(int k=i;k<=row;k++){
                System.out.print(k);
            }
             
            for(int k=row-1;k>=i;k--){
                System.out.print(k);
            }
            
            System.out.println();
        }


  
}
}
