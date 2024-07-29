// package 3-Conditional Statement;
import java.util.Scanner;


public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float num = sc.nextFloat();
        num = num / 2;



        if(num == 0 || num < 0){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }

    }
    
}
