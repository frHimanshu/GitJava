import java.util.*;
import java.util.Scanner;

public class sumofn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a range: ");
        int range = sc.nextInt();

        int sum = 0;
        int i =1;

        while(i <= range){
            sum += i;
            i++;

        } System.out.print(sum);
    }
    
}
