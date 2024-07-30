import java.util.*;

public class FunctionArg {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 97, 98, 99 };
        int nonChangable = 5;

        update(marks);
        System.out.println(nonChangable);

        // print out marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
