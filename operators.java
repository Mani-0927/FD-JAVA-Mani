class operators {
    public static void main(String[] args) {

        // ********** Arithmetic Operators **********
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus

        // ********** Relational Operators **********
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ********** Logical Operators **********
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y)); // Logical AND
        System.out.println("x || y : " + (x || y)); // Logical OR
        System.out.println("!x     : " + (!x));     // Logical NOT

        // ********** Bitwise Operators **********
        int p = 5, q = 3; // binary: 101 and 011
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q));   // AND
        System.out.println("p | q = " + (p | q));   // OR
        System.out.println("p ^ q = " + (p ^ q));   // XOR
        System.out.println("~p    = " + (~p));      // Complement
        System.out.println("p << 1 = " + (p << 1)); // Left Shift
        System.out.println("p >> 1 = " + (p >> 1)); // Right Shift
        System.out.println("p >>> 1 = " + (p >>> 1));// Unsigned Right Shift

        // ********** Assignment Operators **********
        int m = 5, n = 10;
        System.out.println("\nAssignment Operators:");
        m += 5;   // add and assign
        n -= 2;   // subtract and assign
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        m *= 2;   // multiply and assign
        n /= 2;   // divide and assign
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        m %= 3;   // modulus and assign
        n &= 2;   // bitwise AND assignment
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        m |= 2;   // bitwise OR assignment
        n ^= 3;   // bitwise XOR assignment
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        m <<= 1;  // left shift and assign
        n >>= 1;  // right shift and assign
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        m >>>= 1; // unsigned right shift and assign
        n >>>= 1;
        System.out.println("m = " + m);
        System.out.println("n = " + n);

        // ********** Unary Operators **********
        int u = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("++u = " + (++u)); // pre-increment
        System.out.println("u++ = " + (u++)); // post-increment
        System.out.println("--u = " + (--u)); // pre-decrement
        System.out.println("u-- = " + (u--)); // post-decrement

    }
}
