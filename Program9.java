import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Program9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The 1st Array Size:");
        int num1 = scanner.nextInt();
        System.out.println("Enter The 2nd Array Size:");
        int num2 = scanner.nextInt();
        int[] firstArray = new int[num1];
        int[] secondArray = new int[num2];
        
        for (int i = 0; i < num1; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            firstArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < num2; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            secondArray[i] = scanner.nextInt();
        }

        int[]arr = new int[firstArray.length + secondArray.length];
        int index = 0;

        for (int item: firstArray) {
            arr[index++] = item;
         }
       for (int item: secondArray) {
         arr[index++] = item;
        }

        Arrays.sort(arr);

        ArrayList<Integer> new_array = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (new_array.size() == 0) {
                new_array.add(arr[i]);
            } else if (!new_array.contains(arr[i])) {
                new_array.add(arr[i]);
            }
        }

        int[] newArray = new int[new_array.size()];
        for (int i = 0; i < new_array.size(); i++) {
            newArray[i] = new_array.get(i);
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
