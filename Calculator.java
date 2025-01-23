public class Calculator {

    // Addition Method (Instance method)
    public int add(int a, int b) {
        return a + b;
    }

    // Multiplication Method (Instance method)
    public int multiply(int a, int b) {
        return a * b;
    }

    // Subtraction Method (Instance method)
    public int subtract(int a, int b) {
        return a - b;
    }

    // Division Method (Instance method)
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();  // Creating instance of Calculator

        // Calling instance methods
        System.out.println("Addition: " + calc.add(5, 3));
        System.out.println("Multiplication: " + calc.multiply(5, 3));
        System.out.println("Subtraction: " + calc.subtract(5, 3));
        System.out.println("Division: " + calc.divide(5, 3));
    }
}
