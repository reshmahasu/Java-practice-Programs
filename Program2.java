import java.util.Scanner;

class Program2 {
    static void letterPrint(char start) {
        for (char letter = start; letter <= 'Z'; letter++) {
            System.out.print(letter);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting Letter: ");
        char start = scanner.next().toUpperCase().charAt(0);
        letterPrint(start);
    }
}
