import java.util.Scanner;

class Program3 {
    static void check(int firstNumber, int secondNumber) {
        System.out.println("AND-(&):");
        System.out.println(firstNumber & secondNumber);

        System.out.println("OR-(|):");
        System.out.println(firstNumber | secondNumber);

        System.out.println("XOR-(^):");
        System.out.println(firstNumber ^ secondNumber);

        System.out.println("COMPLEMENT-(~):");
        System.out.println(~(firstNumber));
        System.out.println(~(secondNumber));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitwise Operators");
        System.out.println("Enter the First number:");
        int firstNumber = sc.nextInt();
        System.out.println("Enter the Second number:");
        int secondNumber = sc.nextInt();
        check(firstNumber, secondNumber);
    }
}
