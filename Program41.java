import java.util.Scanner;

public class Program41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int arrayLength = scanner.nextInt();
        int[] originalArray = new int[arrayLength];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arrayLength; i++) {
            originalArray[i] = scanner.nextInt();
        }
        int[] copyArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            copyArray[i] = originalArray[i];
        }
        System.out.println("Original array:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println("\nCopy array:");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(copyArray[i] + " ");
        }
    }
}
