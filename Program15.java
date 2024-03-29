import java.util.Scanner;

class Program15 {
    public static void main(String args[]) {
        System.out.println("AREA OF THE CYLINDER");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE RADIUS:");
        double radius = scanner.nextDouble();
        System.out.println("ENTER THE HEIGHT:");
        double height = scanner.nextDouble();
        double area = (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height); // A=2PI r(r+h) or ((22*r*r*h)/7)
        System.out.println("OUTPUT:");
        System.out.println("AREA OF THE CYLINDER: " + area);
    }
}
