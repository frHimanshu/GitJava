public class AverageOfThreeNumbers {
    // Method to compute the average of three numbers
    public static double computeAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        double average = computeAverage(a, b, c);
        System.out.println("Average: " + average);
    }
}
