import java.util.Scanner;

public class Program60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the number of terms: ");
        int number = scanner.nextInt();

        int sum = 0;
        int currentTerm = 0;
        System.out.print("Output: ");
        for (int i = 1; i <= number; i++) {
            currentTerm = currentTerm * 10 + 1;
            System.out.print(currentTerm);
            if (i < number) {
                System.out.print(" + ");
            }
            sum += currentTerm;
        }

        System.out.println("\nThe Sum is: " + sum);
    }
}
