import java.util.Scanner;

public class Program44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] +" ");
                    break;
                } 
            }
        }
    }
}
