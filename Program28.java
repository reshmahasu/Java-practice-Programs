import java.util.Scanner;

class Program28 {
    public static void main(String args[]) {
        System.out.println("CHECK WHETHER A NUMBER IS EVEN OR ODD");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int number = scanner.nextInt();
        System.out.println("OUTPUT");
        if (number % 2 == 0) {
            System.out.println("Given  Number is even");
        } else {
            System.out.println("Given  Number is odd");
        }
    }
}
