import java.util.Scanner;
import java.util.ArrayList;

public class Program52
{
    public static void reverse(String word)
    {
         word+=" ";
        ArrayList<String> array = new ArrayList<>();
        String str = " ";

        for (int i = 0; i < word.length(); i++)
        {
            if (word.charAt(i) != ' ')
            {
                str += word.charAt(i);
            }
            else 
            {
                array.add(str);
                str=" ";

            }
        }
         for(int j=array.size()-1;j>=0;j--)
       {
        System.out.print(array.get(j)+" ");
       }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The String :");
        String string = scanner.nextLine();
        reverse(string);
    }
}
