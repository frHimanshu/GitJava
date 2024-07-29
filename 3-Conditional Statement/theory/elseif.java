// package 3-Conditional Statement;
import java.util.Scanner;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();
        int tax = sc.nextInt();

        if(income >= 200000){
            tax = 0;
        }
        else if (income >= 60000){
            tax = (int) (income * 0.5);

        } else {
            tax = (int) ( income * 30);
        }
        
        System.out.println("Your tax amount is: " + tax);


    }
}
