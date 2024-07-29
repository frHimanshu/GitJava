package overloading;

public class OverloadingByOrder5 {

    // Method with parameters in one order
    public void display(int a, double b) {
        System.out.println("Method with int and double: " + a + ", " + b);
    }

    // Method with parameters in another order
    public void display(double a, int b) {
        System.out.println("Method with double and int: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadingByOrder5 obj = new OverloadingByOrder5();
        obj.display(5, 5.5);
        obj.display(5.5, 5);
    }
}
