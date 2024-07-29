package overloading;

public class Example1 {

    // Instance variable
    int instanceVariable;

    // Constructor
    public Example1(int value) {
        this.instanceVariable = value;
    }

    // Instance method
    public void displayInstanceVariable() {
        System.out.println("Instance Variable: " + instanceVariable);
    }

    // Static method
    public static void displayMessage() {
        System.out.println("Hello from the static method!");
    }

    public static void main(String[] args) {
        // Creating an object of the Example class
        Example1 example = new Example1(10);

        // Calling the instance method
        example.displayInstanceVariable();

        // Calling the static method
        Example1.displayMessage();
    }
}
