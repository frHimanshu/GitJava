package overloading;

public class MethodOverloadingExample2 {

    // Method with one int parameter
    public int add(int a) {
        return a + a;
    }

    // Method with two int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloadingExample2 example = new MethodOverloadingExample2();

        // Calling the different overloaded methods
        System.out.println("add(int a): " + example.add(10));
        System.out.println("add(int a, int b): " + example.add(10, 20));
        System.out.println("add(int a, int b, int c): " + example.add(10, 20, 30));
        System.out.println("add(double a, double b): " + example.add(10.5, 20.5));
    }
}
