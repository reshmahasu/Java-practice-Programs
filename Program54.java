import java.util.Scanner;

public class Program54 {
    public static void sortOddEven(int[] array) {
        int arrayLength = array.length;
        // odd positions (descending order)
        for (int i = 1; i < arrayLength; i += 2) {
            for (int j = i + 2; j < arrayLength; j+=2) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // even positions (ascending order)
        for (int i = 0; i < arrayLength; i += 2) {
            for (int j = i + 2; j < arrayLength; j+= 2) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter the array element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        sortOddEven(array);

        System.out.println("Sorted array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
