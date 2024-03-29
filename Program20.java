import java.util.Scanner;

public class Program20 {
    public static void main(String args[]) {
        System.out.println("FIND THE VALUE OF X ");
        Scanner number = new Scanner(System.in);
        System.out.println("ENTER THE VALUE:");
        int x = number.nextInt();
        int a = x++ * 2 + 3 * -x;
        System.out.println("OUTPUT");
        System.out.println("VALUE OF X IS (x++ * 2 + 3 * -x):" + x);
    }
}
