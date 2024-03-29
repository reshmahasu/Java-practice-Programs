import java.util.Scanner;

public class Program34 {

    public static void calculateSum(int n) {
        int sum=n * (n + 1) / 2;
        System.out.println("Sum of natural numbers from 1 to " + n + ": " + sum);
        findLargestDigit(sum);
    }
    public static void findLargestDigit(int num) {
        int largestDigit = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit > largestDigit) {
                largestDigit = digit;
            }
            num /= 10;
        }
       System.out.println("Largest digit of the sum: " + largestDigit);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        calculateSum(n);
    }
}
