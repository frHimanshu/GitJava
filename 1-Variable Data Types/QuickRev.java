// Boolean 1
// byte 8
// char 16
// short 16
// int 32
// long 64
// float 32
// double 64

public class QuickRev {
    
    // Instance variable
    int instanceVariable = 20;
    
    // Static variable
    static int staticVariable = 30;
    
    public void myMethod() {
        // Local variable
        int localVariable = 10;
        
        // Different data types
        byte byteVar = 1;
        short shortVar = 100;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 10.5f;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean boolVar = true;
        
        // Type casting and conversion
        // Implicit casting (widening conversion)
        long longFromInt = intVar;
        double doubleFromFloat = floatVar;
        
        // Explicit casting (narrowing conversion)
        int intFromLong = (int) longVar;
        float floatFromDouble = (float) doubleVar;
        
        // String conversion
        String stringFromInt = Integer.toString(intVar);
        String stringFromDouble = Double.toString(doubleVar);
        
        // Output all variables
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
        
        // Output data types
        System.out.println("Byte Variable: " + byteVar);
        System.out.println("Short Variable: " + shortVar);
        System.out.println("Int Variable: " + intVar);
        System.out.println("Long Variable: " + longVar);
        System.out.println("Float Variable: " + floatVar);
        System.out.println("Double Variable: " + doubleVar);
        System.out.println("Char Variable: " + charVar);
        System.out.println("Boolean Variable: " + boolVar);
        
        // Output type casting and conversion
        System.out.println("Long from Int (Implicit Casting): " + longFromInt);
        System.out.println("Double from Float (Implicit Casting): " + doubleFromFloat);
        System.out.println("Int from Long (Explicit Casting): " + intFromLong);
        System.out.println("Float from Double (Explicit Casting): " + floatFromDouble);
        
        // Output string conversion
        System.out.println("String from Int: " + stringFromInt);
        System.out.println("String from Double: " + stringFromDouble);
    }
    
    public static void main(String[] args) {
        QuickRev example = new QuickRev();
        example.myMethod();
    }
}
