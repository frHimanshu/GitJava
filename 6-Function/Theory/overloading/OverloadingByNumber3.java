package overloading;
public class OverloadingByNumber3 {

    // Method with one parameter
    public void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    // Method with two parameters
    public void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        OverloadingByNumber3 obj = new OverloadingByNumber3();
        obj.display(5);
        obj.display(5, 10);
    }
}
