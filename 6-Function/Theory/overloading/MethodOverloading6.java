package overloading;

public class MethodOverloading6 {

    // Method with one parameter
    public void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    // Method with two parameters of the same type
    public void display(int a, int b) {
        System.out.println("Method with two int parameters: " + a + ", " + b);
    }

    // Method with two parameters of different types
    public void display(int a, double b) {
        System.out.println("Method with int and double: " + a + ", " + b);
    }

    // Method with two parameters of different types, order swapped
    public void display(double a, int b) {
        System.out.println("Method with double and int: " + a + ", " + b);
    }

    public static void main(String[] args) {
        MethodOverloading6 obj = new MethodOverloading6();
        obj.display(5);
        obj.display(5, 10);
        obj.display(5, 5.5);
        obj.display(5.5, 5);
    }
}
