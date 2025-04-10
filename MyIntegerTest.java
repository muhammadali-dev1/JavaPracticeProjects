package lab19;

public class MyIntegerTest {
    public static void main(String[] args) {
        // Create MyInteger objects for testing
        MyInteger myInt1 = new MyInteger(7);  // Prime, odd
        MyInteger myInt2 = new MyInteger(4);  // Even, not prime
        MyInteger myInt3 = new MyInteger(10); // Even, not prime
        MyInteger myInt4 = new MyInteger(13); // Prime, odd

        // Test instance methods
        System.out.println("Testing instance methods:");
        System.out.println("myInt1 (7):");
        System.out.println("isEven: " + myInt1.isEven());  // Expected: false
        System.out.println("isOdd: " + myInt1.isOdd());    // Expected: true
        System.out.println("isPrime: " + myInt1.isPrime()); // Expected: true

        System.out.println("\nmyInt2 (4):");
        System.out.println("isEven: " + myInt2.isEven());  // Expected: true
        System.out.println("isOdd: " + myInt2.isOdd());    // Expected: false
        System.out.println("isPrime: " + myInt2.isPrime()); // Expected: false

        // Test static methods
        System.out.println("\nTesting static methods:");
        System.out.println("Static isEven (myInt3 - 10): " + MyInteger.isEven(myInt3)); // Expected: true
        System.out.println("Static isOdd (myInt3 - 10): " + MyInteger.isOdd(myInt3));   // Expected: false
        System.out.println("Static isPrime (myInt4 - 13): " + MyInteger.isPrime(myInt4)); // Expected: true

        // Test equals methods
        System.out.println("\nTesting equals methods:");
        System.out.println("myInt1.equals(7): " + myInt1.equals(7));                  // Expected: true
        System.out.println("myInt1.equals(new MyInteger(7)): " + myInt1.equals(new MyInteger(7))); // Expected: true
        System.out.println("myInt2.equals(10): " + myInt2.equals(10));                // Expected: false
        System.out.println("myInt3.equals(myInt4): " + myInt3.equals(myInt4));        // Expected: false
    }
}
