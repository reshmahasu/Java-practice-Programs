import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        long firstNumber = input.nextLong();
        System.out.println("Enter the second Number:");
        long secondNumber = input.nextLong();
        System.out.println("OUTPUT:");

        System.out.println("Addition:");
        long add = firstNumber + secondNumber;
        System.out.println(add);

        System.out.println("Subtraction:");
        long sub = firstNumber - secondNumber;
        System.out.println(sub);

        System.out.println("Multiplication:");
        long mul = firstNumber * secondNumber;
        System.out.println(mul);

        System.out.println("Division:");
        long div = firstNumber / secondNumber;
        System.out.println(div);

        System.out.println("Modulo:");
        long mod = firstNumber % secondNumber;
        System.out.println(mod);
    }
}
