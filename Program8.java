public class Program8 {
    // Static variable
    static int staticVariable = 10;

    // Static method
    static void staticMethod() {
        System.out.println(" staticMethod()");
        System.out.println("Value of staticVariable: " + staticVariable);
    }

    // Static block
    static {
        System.out.println(" static block");
        System.out.println("This block is executed before the main method");
        staticVariable = 20;
    }

    public static void main(String[] args) {
        System.out.println("Value of staticVariable in main(): " + Program8.staticVariable);
        Program8.staticMethod();
        Program8 obj = new Program8();
        System.out.println("Value of staticVariable using object: " + obj.staticVariable);
        obj.staticMethod();
    }
}
