public class FunctionConcepts {

    // 1. Introduction to Function
    public static void printGreeting() {
        System.out.println("Hello, welcome to Java programming!");
    }

    // 2. Syntax of a Function
    public static int add(int a, int b) {
        return a + b;
    }

    // 3. Syntax with Parameters
    public static int multiply(int a, int b) {
        return a * b;
    }

    // 4. Parameter vs Argument
    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
    }

    // 5. Call by Value
    public static void modifyValue(int x) {
        x = x + 10;
    }

    // 6. Call Stack Example
    public static void functionA() {
        System.out.println("Function A");
        functionB();
    }

    public static void functionB() {
        System.out.println("Function B");
        functionC();
    }

    public static void functionC() {
        System.out.println("Function C");
    }

    // 7. Inbuilt vs User Defined Methods
    public static int userDefinedAdd(int a, int b) {
        return a + b;
    }

    // 8. Function Overloading
    public static double add(double a, double b) {
        return a + b;
    }

    // 9. Overloading Using Parameters
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 10. Overloading Using Data Types
    public static void display(int a) {
        System.out.println("Integer: " + a);
    }

    public static void display(String a) {
        System.out.println("String: " + a);
    }

    // 11. Method Scope
    public static void printNumber() {
        int number = 10; // Local variable
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {
        // 1. Introduction to Function
        printGreeting();

        // 2. Syntax of a Function
        int sumResult = add(5, 10);
        System.out.println("Sum: " + sumResult);

        // 3. Syntax with Parameters
        int productResult = multiply(4, 5);
        System.out.println("Product: " + productResult);

        // 4. Parameter vs Argument
        printSum(10, 20);

        // 5. Call by Value
        int num = 5;
        modifyValue(num);
        System.out.println("Original Value: " + num); // Output will be 5

        // 6. Call Stack Example
        functionA();

        // 7. Inbuilt vs User Defined Methods
        double sqrtResult = Math.sqrt(25);
        System.out.println("Square root: " + sqrtResult);

        int userSum = userDefinedAdd(10, 15);
        System.out.println("Sum: " + userSum);

        // 8. Function Overloading
        System.out.println("Sum of integers: " + add(5, 10));
        System.out.println("Sum of doubles: " + add(5.5, 10.5));

        // 9. Overloading Using Parameters
        System.out.println("Product of 2 numbers: " + multiply(2, 3));
        System.out.println("Product of 3 numbers: " + multiply(2, 3, 4));

        // 10. Overloading Using Data Types
        display(100);
        display("Hello");

        // 11. Method Scope
        printNumber();

        // 12. Block Scope
        if (true) {
            int blockVar = 20; // Variable scoped to this block
            System.out.println("Block variable: " + blockVar);
        }
        // Uncommenting the next line would cause an error
        // System.out.println(blockVar); // 'blockVar' is out of scope
    }
}
