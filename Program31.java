import java.util.Scanner;
import java.text.DecimalFormat;

public class Program31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter the value of a:");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b:");
        double b = scanner.nextDouble();

        System.out.println("Enter the value of c:");
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct:");
            System.out.println("Root 1: " + df.format(root1));
            System.out.println("Root 2: " + df.format(root2));
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root: " + df.format(root));
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different:");
            System.out.println("Root 1: " + df.format(realPart) + " + " + df.format(imaginaryPart) + " i ");
            System.out.println("Root 2: " + df.format(realPart) + " - " + df.format(imaginaryPart)+ " i ");
        }
    }
}
