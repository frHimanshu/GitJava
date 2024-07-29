public class BinomialCoefficient {

    // Function to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    // Function to calculate binomial coefficient
    public static int binomialCoefficient(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMinusRFact = factorial(n - r);

        return nFact / (rFact * nMinusRFact);
    }

    public static void main(String[] args) {
        int n = 5;  // You can change this value to test other numbers
        int r = 2;  // You can change this value to test other numbers

        int result = binomialCoefficient(n, r);

        System.out.println("The binomial coefficient C(" + n + ", " + r + ") is: " + result);
    }
}
