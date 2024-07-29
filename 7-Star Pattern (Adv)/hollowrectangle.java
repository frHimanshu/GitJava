public class hollowrectangle {
    public static void hollowRectangle(int trows, int tcols) {
        // outer loop for rows
        for(int i = 1; i <= trows; i++) {
            // inner loop for columns
            for(int j = 1; j <= tcols; j++) {
                // cell - (i,j)
                if(i == 1 || i == trows || j == 1 || j == tcols) {
                    // boundary cell
                    System.out.print("*");
                } else {
                    System.out.print(" "); // use print instead of println
                }
            }
            System.out.println(); // move to the next line after each row
        }
    }

    public static void main(String args[]) {
        hollowRectangle(3, 6);
    }
}
