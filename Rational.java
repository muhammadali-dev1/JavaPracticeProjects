// Muhammad Ali
// 115921494

package homework5;

public class Rational {
    private int numerator;
    private int denominator;

    // Constructor with arguments
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce(); // Reduce to simplest form
    }

    // No-argument constructor (default to 0/1)
    public Rational() {
        this(0, 1);
    }

    // Add two Rational numbers
    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Subtract two Rational numbers
    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Multiply two Rational numbers
    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Divide two Rational numbers
    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    // Reduce the fraction to its simplest form
    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        // Ensure the denominator is always positive
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Helper method to calculate GCD (Greatest Common Divisor)
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Return a String representation of the Rational number
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
