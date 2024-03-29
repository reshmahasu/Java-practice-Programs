import java.util.Scanner;

class Program24 {
    public static void main(String args[]) {
        Scanner letter = new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER");
        char character = letter.next().charAt(0);
        int asciiValue = (int) character;
        System.out.println("THE ASCII VALUE OF " + character + " IS: " + asciiValue);
    }
}
