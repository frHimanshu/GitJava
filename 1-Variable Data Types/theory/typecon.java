// package 1-Variable Data Types;
import java.util.Scanner;

public class typecon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read a float value from the user
        float number = sc.nextFloat();
        
        // Cast the float value to an integer, truncating the decimal part
        int marks = (int) number;
        
        // Print the casted value
        System.out.println(marks);
    }
}


// byte>short> int >float >long>double