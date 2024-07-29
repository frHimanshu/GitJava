public class SumOfDigits {
    // Method to compute the sum of the digits in an integer
    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        int number = 1234;
        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }
}
