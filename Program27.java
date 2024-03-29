import java.util.Scanner;

class Program27 {
    public static void main(String args[]) {
        System.out.println("SWAP TWO NUMBERS");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER:");
        int firstNumber = scanner.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int secondNumber = scanner.nextInt();

        System.out.println("BEFORE SWAPPING:");
        System.out.println("first number: " + firstNumber);
        System.out.println("second number: " + secondNumber);

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println();

        System.out.println("AFTER SWAPPING:");
        System.out.println("first number: " + firstNumber);
        System.out.println("second number: " + secondNumber);
    }
}
