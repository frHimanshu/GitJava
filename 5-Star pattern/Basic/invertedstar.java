// package 5-Star pattern.Basic;

public class invertedstar {
    public static void main(String[] args) {
        
        int n = 2;

        for(int line=1; line <= n; line++) {
            for(int stars=1; stars <= n - line + 1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
}
