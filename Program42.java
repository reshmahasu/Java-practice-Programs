import java.util.Scanner;

public class Program42 {
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

        for (int k = 0; k < array.length; k++) {
            int result = 1;
            for (int j = k + 1; j < array.length; j++) {
                if (array[k] == array[j]) {
                    result++;
                } else {
                    break;
                }
            }
            if (result >= 1) {
                System.out.println(array[k] + "---->" + result);
                k += (result - 1);
                
            }
        }
    }
}
