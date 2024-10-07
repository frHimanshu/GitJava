import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read an integer input from the user
        int num = sc.nextInt();

        // Check if the number is even or odd using modulus
        if (num % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }

        sc.close(); // Close the scanner to avoid resource leak
    }
}
