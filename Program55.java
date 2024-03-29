import java.util.Scanner;

public class Program55 {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("ENTER THE ROWS");
        int row = scanner.nextInt();
        System.out.println("OUTPUT");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || j == 1 || i == row ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
