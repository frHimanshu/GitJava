public class QuickRevLoops {

    public static void main(String[] args) {
        // For loop example
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop example
        System.out.println("\nWhile Loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Do-while loop example
        System.out.println("\nDo-While Loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);

        // Break statement example
        System.out.println("\nBreak Statement:");
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                break; // Exit the loop when m equals 6
            }
            System.out.println("Iteration " + m);
        }

        // Continue statement example
        System.out.println("\nContinue Statement:");
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue; // Skip iteration when n equals 3
            }
            System.out.println("Iteration " + n);
        }
    }
}
