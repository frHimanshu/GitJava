
public class NestedLoopx {
    public static void main(String[] args) {
        // Loop through lines
        for (int line = 1; line <= 5; line++) { // Correct the condition to `line <= 5`
            // Loop through stars in each line
            for (int star = 1; star <= line; star++) {
                System.out.print("*");
            }
            // Print a new line after each line of stars
            System.out.println();
        }
    }
}
