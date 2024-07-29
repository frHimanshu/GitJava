package overloading;
public class OverloadingByType4 {

    // Method with int parameter
    public void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    // Method with double parameter
    public void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    public static void main(String[] args) {
        OverloadingByType4 obj = new OverloadingByType4();
        obj.display(5);
        obj.display(5.5);
    }
}
