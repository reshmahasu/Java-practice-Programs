import java.util.Scanner;

class Program5 {
    static void letterPrint(char start) {
        int num = (int) start;
        for (int i = num; i >= 65; i--) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char) (i));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Letter:");
        char start = scanner.next().charAt(0);
        letterPrint(Character.toUpperCase(start));
    }
}
