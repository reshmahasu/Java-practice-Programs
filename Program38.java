import java.util.Scanner;

public class Program38 {
    public static void main(String args[]) {
        System.out.println("INPUT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        int number = scanner.nextInt();
        System.out.println("ENTER THE ELEMENTS:");
        int array[] = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        int maximum = array[0];
        for (int i = 1; i < number; i++) {
            if (maximum < array[i]) {
                maximum = array[i];
            }
        }
        System.out.println("OUTPUT");
        System.out.println("LARGEST ELEMENT IN AN ARRAY: " + maximum);
    }
}
