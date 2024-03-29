import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Program16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter the Quadratic Equation:");
        String equation = scanner.nextLine();
        String[] tokens = equation.split(" ");

        ArrayList<Double> coefficients = new ArrayList<>();
        for (String token : tokens) {
            if (isNumeric(token)) {
                coefficients.add(Double.parseDouble(token));
            }
        }

        if (coefficients.size() != 3) {
            System.out.println("Invalid quadratic equation format.");
            return;
        }

        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);

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
            System.out.println("Root 2: " + df.format(realPart) + " - " + df.format(imaginaryPart) + " i ");
        }
    }
}
