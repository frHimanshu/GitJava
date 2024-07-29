import java.util.Scanner;
public class largestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type value for a: "); 
        int a = sc.nextInt(); 
        

        System.out.print("Type value for b: "); 
        int b = sc.nextInt();
        

        System.out.print("Type value for c: "); 
        int c = sc.nextInt();
        
        // Largest of three: 

        if(a > b){
            if(a > c){
                System.out.print("a is greater than 'b' & 'c'.");
            }

        } else if(b > c ) {
            System.out.print("b is greater than 'a' & 'c'.");
            
        } else {
            System.out.print("c is greater than 'a' & 'b' ");
        }



    }
    
}
