import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int[][] rotatedArray = leftRotateArray(array);
        System.out.println("Rotated array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] leftRotateArray(int[][] array) {
        int size = array.length;
        int[][] rotatedArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(rotatedArray[j][size - i - 1] = array[i][j]);
            }
        }

        return rotatedArray;
    }
}
