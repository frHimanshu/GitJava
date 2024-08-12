import java.util.*;

public class pairsubarray {
    public static void Subarray(int num[]) {
        for(int i = 0; i < num.length; i++) {  // Outer loop for the start of the subarray
            for(int j = i; j < num.length; j++) {  // Middle loop for the end of the subarray
                for(int k = i; k <= j; k++) {  // Inner loop to print elements of the subarray
                    System.out.print(num[k] + " ");  // Print elements of the subarray
                }
                System.out.println();  // New line after printing each subarray
            }
            System.out.println();  // Extra new line after printing all subarrays starting from i
        }
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};  // Array for which we want to generate subarrays
        Subarray(num);  // Call the Subarray method
    }
}
