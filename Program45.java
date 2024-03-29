import java.util.Scanner;

public class Program45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int arrayLength = scanner.nextInt();
        System.out.println("Enter the array elements:");
        
        int array[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        System.out.println("OUTPUT");
        System.out.println("Sum of the array: " + sum);
    }
}
