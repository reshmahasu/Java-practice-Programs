import java.text.DecimalFormat;
import java.util.Scanner;

public class Program12 {
    
    public static void decimalFormat(double number) {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(number));
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");
        double number = scanner.nextDouble();
        decimalFormat(number);
    }
}
