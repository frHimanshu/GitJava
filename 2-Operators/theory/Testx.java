public class Testx {
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 2; // Initialize all variables to 2
        x += y; // x = x + y -> x = 2 + 2 = 4
        y -= z; // y = y - z -> y = 2 - 2 = 0
        z /= (x + y); // z = z / (x + y) -> z = 2 / (4 + 0) = 2 / 4 = 0 (integer division)
        System.out.println(x + " " + y + " " + z); // Print the values of x, y, and z
    }
}
