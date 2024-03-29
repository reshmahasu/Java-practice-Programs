import java.util.Scanner;

public class Program39 {
    public static void main(String args[]) {
        System.out.println("INPUT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        int arrayLength = scanner.nextInt();
        System.out.println("ENTER THE ELEMENTS:");
        int array[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        int minNumber = array[0];
        for (int i = 1; i <arrayLength; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        System.out.println("OUTPUT");
        System.out.println("SMALLEST ELEMENT IN AN ARRAY: " + minNumber);
    }
}
