import java.util.*;

public class ContinueExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a given number: ");
            int n = sc.nextInt();
            
            if (n % 10 == 0) {
                System.out.println("Skipping number: " + n);
                continue;
            }

            System.out.println("Number was: " + n);

            if (n == 1) {
                break;
            }

        } while (true);
        
        sc.close(); // Close the scanner
    }
}
