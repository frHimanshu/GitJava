import java.util.*;
// import java.util.Scanner;

public class reversenum {
    public static void main(String[] args) {
        
    
    // Scanner sc = new Scanner(System.in);

    int n = 32;

    while(n > 0) {  
        int reverse = n % 10; //to print last digit
        System.out.print(reverse);
        n /= 10; //to remove last digit


    }
    
}
}
