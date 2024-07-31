package theory;
import java.util.*;


public class linearsearch {
    public static int linearS(int number[], int key){
        for(int i =0; i<number.length; i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
        
    }
        public static void main(String[] args) {
            int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
            // String menu[] = {"dosa" . "chole"}
            int key = 10;
            
            int index = linearS(number, key);
            if(index == -1){
                System.out.println("not found");
            } else {
                System.out.println("key is at index");
            }
        }

    
}
