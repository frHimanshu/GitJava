// package 3-Conditional Statement;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float age = sc.nextFloat();

        if(age > 18){
            System.out.print("Major");
        } else{
            System.out.print("Minor");
        }

    }
    
}
