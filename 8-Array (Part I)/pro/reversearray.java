import java.util.*;

public class reversearray {

    public static void reverse(int number[]) {
        int first = 0, last = number.length -1; 
        
        while(first < last) {
            //swap
            int temp = number[last];
            number[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};

        reverse(number);

        //print
        for(int i=0; i <number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
    
}
