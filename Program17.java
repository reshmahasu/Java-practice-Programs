import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the outer circle:");
        double outerRadius = input.nextDouble();
        System.out.println("Enter the radius of the inner circle:");
        double innerRadius = input.nextDouble();
        double outerCircleArea = Math.PI * outerRadius * outerRadius;
        double innerCircleArea = Math.PI * innerRadius * innerRadius;
        double areaBetweenCircles = outerCircleArea - innerCircleArea;
        System.out.println("Area between the concentric circles: " + areaBetweenCircles);
    }
}
