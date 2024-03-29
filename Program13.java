import java.util.Scanner;

class Program13 {
    public static void main(String args[]) {
        System.out.println("AREA OF THE SQUARE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE SIDE LENGTH OF THE SQUARE:");
        double sideLength = scanner.nextDouble();
        double area = sideLength * sideLength;
        System.out.println("OUTPUT:");
        System.out.println("AREA OF THE SQUARE: " + area);
    }
}
