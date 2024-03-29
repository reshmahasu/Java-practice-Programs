import java.util.Scanner;

public class Program37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Enter the array element " + (i+1) +":");
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements at odd positions:");
        for (int i = 0; i < arrayLength; i += 2) {
            System.out.print(array[i] + ",");
        }
    }
}
