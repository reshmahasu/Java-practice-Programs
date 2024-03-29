import java.util.Scanner;

class Program29 {
    public static void main(String args[]) {
        System.out.println("CHECK WHETHER A CHARACTER IS A VOWEL OR CONSONANT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE LETTER:");
        char character = scanner.next().charAt(0);
        character = Character.toUpperCase(character);

        System.out.println("OUTPUT");
        if (character <= 'Z') {
            if (character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                System.out.println("The given character is a vowel");
            } else {
                System.out.println("The given character is a consonant");
            }
        }
    }
}
