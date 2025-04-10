package lab17;

public class TestMyInteger {
    public static void main(String[] args) {
        // Create MyInteger objects
        MyInteger myInt1 = new MyInteger(15);
        MyInteger myInt2 = new MyInteger(28);
        MyInteger myInt3 = new MyInteger(2);

        // Test isEven, isOdd, and isPrime methods
        System.out.println("myInt1 (15):");
        System.out.println("isEven: " + myInt1.isEven());
        System.out.println("isOdd: " + myInt1.isOdd());
        System.out.println("isPrime: " + myInt1.isPrime());

        System.out.println("\nmyInt2 (28):");
        System.out.println("isEven: " + myInt2.isEven());
        System.out.println("isOdd: " + myInt2.isOdd());
        System.out.println("isPrime: " + myInt2.isPrime());

        System.out.println("\nmyInt3 (2):");
        System.out.println("isEven: " + myInt3.isEven());
        System.out.println("isOdd: " + myInt3.isOdd());
        System.out.println("isPrime: " + myInt3.isPrime());

        // Test static methods
        System.out.println("\nStatic method tests:");
        System.out.println("isEven(myInt1): " + MyInteger.isEven(myInt1));
        System.out.println("isOdd(myInt2): " + MyInteger.isOdd(myInt2));
        System.out.println("isPrime(myInt3): " + MyInteger.isPrime(myInt3));

        // Test equals methods
        System.out.println("\nEquality tests:");
        System.out.println("myInt1 equals 15: " + myInt1.equals(15));
        System.out.println("myInt1 equals myInt2: " + myInt1.equals(myInt2));
        System.out.println("myInt3 equals new MyInteger(2): " + myInt3.equals(new MyInteger(2)));
    }
}


