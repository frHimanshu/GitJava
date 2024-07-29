package overloading;

public class MethodOverloadingByType7 {

    // Method with int parameter
    public void print(int a) {
        System.out.println("Printing int: " + a);
    }

    // Method with double parameter
    public void print(double a) {
        System.out.println("Printing double: " + a);
    }

    // Method with char parameter
    public void print(char a) {
        System.out.println("Printing char: " + a);
    }

    // Method with String parameter
    public void print(String a) {
        System.out.println("Printing String: " + a);
    }

    public static void main(String[] args) {
        MethodOverloadingByType7 obj = new MethodOverloadingByType7();

        // Calling the overloaded methods
        obj.print(10);          // Calls the method with int parameter
        obj.print(10.5);        // Calls the method with double parameter
        obj.print('A');         // Calls the method with char parameter
        obj.print("Hello");     // Calls the method with String parameter
    }
}
