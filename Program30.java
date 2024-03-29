import java.util.Scanner;

class Program30 {
    static void findMax(int firstNumber, int secondNumber, int thirdNumber) {
        int maxNumber=firstNumber;

        if (secondNumber > maxNumber) {
            maxNumber = secondNumber;
        }
        if (thirdNumber > maxNumber) {
            maxNumber = thirdNumber;
        } 
        System.out.println("OUTPUT");
        System.out.println("The largest number is: " + maxNumber);
    }

    public static void main(String args[]) {
        System.out.println("FIND THE LARGEST NUMBER AMONG THREE NUMBERS");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ENTER THE FIRST NUMBER:");
        int firstNumber = scanner.nextInt();
        System.out.println("ENTER THE SECOND NUMBER:");
        int secondNumber = scanner.nextInt();
        System.out.println("ENTER THE THIRD NUMBER:");
        int thirdNumber = scanner.nextInt();

        findMax(firstNumber, secondNumber, thirdNumber);
    }
}
