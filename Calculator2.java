public class Calculator2 {

    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

   
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + Calculator2.add(5, 3));
        System.out.println("Multiplication: " + Calculator2.multiply(5, 3));
        System.out.println("Subtraction: " + Calculator2.subtract(5, 3));
        System.out.println("Division: " + Calculator2.divide(5, 3));
    }
}
