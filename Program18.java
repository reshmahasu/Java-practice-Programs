import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 'a' value :");
        int a=scanner.nextInt();
        System.out.println("Enter 'b' value :");
        int b=scanner.nextInt();

        int result1 = ++a - b--;        
        System.out.println("Result of ++a - b--: " + result1 + ", a: " + a + ", b: " + b);

        int result2 = a % b++;
        System.out.println("Result of a % b++: " + result2 + ", a: " + a + ", b: " + b);

        a *= b + 5;
        System.out.println("Result of a *= b + 5: " + a);

        int x = 69 >>> 2;
        System.out.println("Result of x = 69 >>> 2: " + x);
    }
}
