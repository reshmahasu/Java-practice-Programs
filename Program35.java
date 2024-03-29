import java.util.Scanner;

class Program35 {
    public static int calculateFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static int calculateDigitSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum+= i;
        }
        return sum;
    }
    public static void main(String args[]) {
        System.out.println("FIND FACTORIAL OF A NUMBER AND THE SUM OF ITS DIGITS");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER A NON-NEGATIVE INTEGER:");
        int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Please enter a non-negative integer:");
            }
        
        int factorial = calculateFactorial(number);
        int digitSum = calculateDigitSum(number);
        System.out.println("OUTPUT");
        System.out.println("Factorial is: " + factorial);
        System.out.println("Sum of digits is: " + digitSum);
            }
}
