import java.util.Scanner;

class Program25 {
    public static void main(String args[]) {
        System.out.println("QUOTIENT AND REMAINDER");
        Scanner number = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER");
        int firstNumber = number.nextInt();
        System.out.println("ENTER THE SECOND NUMBER");
        int secondNumber = number.nextInt();
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        System.out.println("OUTPUT:");
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
