import java.util.*;

public class LargestNumbers {
    // Method to get the largest and smallest number in the array
    public static int getLargest(int[] numbers) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible value
        int smallest = Integer.MAX_VALUE;  // Initialize to the largest possible value

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        
        System.out.println("Smallest Value: " + smallest); // Print the smallest value
        return largest; // Return the largest value
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 7, 5}; // Initialize the array
        System.out.println("Largest Value: " + getLargest(numbers)); // Print the largest value
    }
}
