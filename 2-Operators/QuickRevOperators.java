public class QuickRevOperators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Unary Operators
        System.out.println("\nUnary Operators:");
        System.out.println("a = " + a);
        System.out.println("++a = " + (++a)); // Pre-increment
        System.out.println("a++ = " + (a++)); // Post-increment
        System.out.println("a = " + a);
        System.out.println("--a = " + (--a)); // Pre-decrement
        System.out.println("a-- = " + (a--)); // Post-decrement
        System.out.println("a = " + a);
        System.out.println("~a = " + (~a)); // Bitwise complement
        System.out.println("!true = " + (!true)); // Logical complement

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 15;
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 5; // c = c / 5
        System.out.println("c /= 5: " + c);
        c %= 4; // c = c % 4
        System.out.println("c %= 4: " + c);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

        // Bitwise Operators
        int m = 5; // 0101 in binary
        int n = 3; // 0011 in binary
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n: " + (m & n)); // Bitwise AND
        System.out.println("m | n: " + (m | n)); // Bitwise OR
        System.out.println("m ^ n: " + (m ^ n)); // Bitwise XOR
        System.out.println("~m: " + (~m)); // Bitwise NOT
        System.out.println("m << 1: " + (m << 1)); // Left shift
        System.out.println("m >> 1: " + (m >> 1)); // Right shift
        System.out.println("m >>> 1: " + (m >>> 1)); // Unsigned right shift

        // Assignment Operators in detail
        System.out.println("\nDetailed Assignment Operators:");
        detailedAssignmentOperators();
    }

    public static void detailedAssignmentOperators() {
        int a = 10;
        System.out.println("Initial value of a: " + a);

        // Simple assignment
        a = 10;
        System.out.println("a = 10: " + a);

        // Addition assignment
        a += 5; // a = a + 5
        System.out.println("a += 5: " + a);

        // Subtraction assignment
        a -= 3; // a = a - 3
        System.out.println("a -= 3: " + a);

        // Multiplication assignment
        a *= 2; // a = a * 2
        System.out.println("a *= 2: " + a);

        // Division assignment
        a /= 4; // a = a / 4
        System.out.println("a /= 4: " + a);

        // Modulus assignment
        a %= 5; // a = a % 5
        System.out.println("a %= 5: " + a);

        // Bitwise AND assignment
        a &= 3; // a = a & 3
        System.out.println("a &= 3: " + a);

        // Bitwise OR assignment
        a |= 2; // a = a | 2
        System.out.println("a |= 2: " + a);

        // Bitwise XOR assignment
        a ^= 1; // a = a ^ 1
        System.out.println("a ^= 1: " + a);

        // Left shift assignment
        a <<= 1; // a = a << 1
        System.out.println("a <<= 1: " + a);

        // Right shift assignment
        a >>= 1; // a = a >> 1
        System.out.println("a >>= 1: " + a);

        // Unsigned right shift assignment
        a >>>= 1; // a = a >>> 1
        System.out.println("a >>>= 1: " + a);
    }
}
