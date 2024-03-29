import java.util.Scanner;

public class Program40 {
    public static void main(String args[]) {
        System.out.println("INPUT");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        int arrayLength =scanner.nextInt();
        System.out.println("ENTER THE ELEMENTS:");
        int array[] = new int[arrayLength];
        int count=0;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
            count+=1;
        }
        System.out.println("OUTPUT");
        System.out.println("NUMBER OF ELEMENTS IN THE ARRAY: " + count);
    }
}
