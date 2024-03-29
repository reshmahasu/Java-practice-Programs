import java.util.Scanner;

public class Program43 {
  public static void main(String[] args) {
    System.out.println("INPUT");
    Scanner scanner = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER OF ELEMENTS:");
    int arrayLength = scanner.nextInt();
    System.out.println("ENTER THE NUMBER FOR LEFT ROTATE:");
    int n = scanner.nextInt();
    System.out.println("ENTER THE ELEMENTS:");
    int array[] = new int[arrayLength];

    for (int i = 0; i < arrayLength; i++) {
        array[i] = scanner.nextInt();
    }

    System.out.println("Given array is: ");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }

    for(int i = 0; i < n; i++){
      int j, firstElement;
      firstElement = array[0];
      for(j = 0; j < array.length-1; j++){
        array[j] = array[j+1];
      }
      array[j] = firstElement;
    }
    System.out.println();
    System.out.println("Array after "+n+" left rotations: ");
    for(int i = 0; i< array.length; i++){
      System.out.print(array[i] + " ");
    }
  }
}  