import java.util.Scanner;

class Program32 {
    public static void main(String args[]) {
        System.out.println("CHECK WHETHER A NUMBER IS POSITIVE, NEGATIVE, OR ZERO");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int number = scanner.nextInt();
        System.out.println("OUTPUT");
        if (number > 0) {
            System.out.println("The given number is positive");
        } else if (number < 0) {
            System.out.println("The given number is negative");
        } else {
            System.out.println("The given number is zero");
        }
    }
}
