package lab17;

public class MyInteger {
    // Data field
    private int value;

    // Constructor
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter method
    public int getValue() {
        return value;
    }

    // Method to check if the value is even
    public boolean isEven() {
        return value % 2 == 0;
    }

    // Method to check if the value is odd
    public boolean isOdd() {
        return value % 2 != 0;
    }

    // Method to check if the value is prime
    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Static method to check if a MyInteger value is even
    public static boolean isEven(MyInteger myInt) {
        return myInt.isEven();
    }

    // Static method to check if a MyInteger value is odd
    public static boolean isOdd(MyInteger myInt) {
        return myInt.isOdd();
    }

    // Static method to check if a MyInteger value is prime
    public static boolean isPrime(MyInteger myInt) {
        return myInt.isPrime();
    }

    // Method to check if the value equals a specified int
    public boolean equals(int anotherValue) {
        return this.value == anotherValue;
    }

    // Method to check if the value equals a specified MyInteger object
    public boolean equals(MyInteger anotherMyInt) {
        return this.value == anotherMyInt.getValue();
    }
}
