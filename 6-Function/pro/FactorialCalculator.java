public class FactorialCalculator {

    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        int n = 10;  // You can change this value to test other numbers
        int result = factorial(n);
        
        System.out.println("The factorial of " + n + " is: " + result);
    }
}
