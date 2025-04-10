package lab19;

public class MyInteger {
    // Data field
    private int value;

    // Constructor
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter method for value
    public int getValue() {
        return value;
    }

    // Instance methods
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 != 0;
    }

    public boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    // Static methods
    public static boolean isEven(MyInteger myInteger) {
        return myInteger.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger) {
        int value = myInteger.getValue();
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    // equals methods
    public boolean equals(int otherValue) {
        return this.value == otherValue;
    }

    public boolean equals(MyInteger otherMyInteger) {
        return this.value == otherMyInteger.getValue();
    }
}
