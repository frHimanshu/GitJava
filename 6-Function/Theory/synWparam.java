// Syntax with parameters
import java.util.Scanner;
public class synWparam {
    public static void printHelloWorld() {
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

        
    }

    public static int calculateSum(int a, int b) {

        int sum = a + b;

        return sum;

    }


    public static void main(String args[]) {
        printHelloWorld();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);

        System.out.println("Sum is: " + sum);




    }
    
}
