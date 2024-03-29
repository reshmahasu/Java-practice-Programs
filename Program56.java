import java.util.Scanner;

public class Program56 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int numberOfRow = scanner.nextInt();
        int row = numberOfRow / 2;
        int count = 0;
        for (int i = 1; i <row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
