import java.util.Scanner;

class Program14{
    public static void main(String args[]) {
        System.out.println("AREA OF THE RECTANGLE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE WIDTH:");
        int width = scanner.nextInt();
        System.out.println("ENTER THE HEIGHT:");
        int height = scanner.nextInt();
        int area = width * height;
        System.out.println("OUTPUT:");
        System.out.println("AREA OF THE RECTANGLE: " + area);
    }
}
