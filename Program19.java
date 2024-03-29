import java.util.Scanner;

public class Program19 {
    public static void main(String args[]) {
        System.out.println("FIND THE VALUE");
        Scanner number = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF a:");
        int a = number.nextInt();
        int b = a += a++ + ++a + -a + a--;
        System.out.println("OUTPUT");
        System.out.println("a += a++ + ++a + -a + a--  :"+b);
    }
}
