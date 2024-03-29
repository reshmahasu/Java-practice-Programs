import java.util.Scanner;

public class Program23 {
    public static void main(String args[]) {
        System.out.println("FIND THE VALUE OF X1");
        Scanner number = new Scanner(System.in);
        System.out.println("ENTER THE VALUE:");
        int x = number.nextInt();
        int x1 = ++x - x++ + -x;
        System.out.println("OUTPUT");
        System.out.println("VALUE OF X1 IS (x1 = ++x - x++ + -x) :" + x1);
    }
}
