import java.util.Scanner;

public class Program21 {
    public static void main(String args[]) {
        System.out.println("FIND THE VALUE OF Z ");
        Scanner number = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF Y:");
        int y = number.nextInt();
        int z = (++y * (y++ + 5));
        System.out.println("OUTPUT");
        System.out.println("VALUE OF Z IS( z = (++y * (y++ + 5))):" + z);
    }
}
