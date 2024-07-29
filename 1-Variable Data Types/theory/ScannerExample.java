import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        int i = sc.nextInt();
        
        System.out.println(i);
        
        sc.close(); // It's a good practice to close the Scanner object when done
    }
}


// nextInt
// nextFloat
// nextBoolean
