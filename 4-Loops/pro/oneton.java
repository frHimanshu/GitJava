import java.util.Scanner;

public class oneton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type a range: ");
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range){
            System.out.print(counter + " ");
            counter++;
        }
    }
}