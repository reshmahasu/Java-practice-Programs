import java.util.Scanner;

class Program33 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Character :");
        char character=scanner.next().charAt(0);

        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            System.out.println(character + " is an alphabet.");
        } else {
            System.out.println(character + " is not an alphabet.");
        }
    }
}
