// Muhammad Ali
// 115921494

package homework5;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    // Constructor with arguments
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    // No-argument constructor (default values)
    public Complex() {
        this(0.0, 0.0);
    }

    // Add two complex numbers
    public Complex add(Complex other) {
        double real = this.realPart + other.realPart;
        double imaginary = this.imaginaryPart + other.imaginaryPart;
        return new Complex(real, imaginary);
    }

    // Subtract two complex numbers
    public Complex subtract(Complex other) {
        double real = this.realPart - other.realPart;
        double imaginary = this.imaginaryPart - other.imaginaryPart;
        return new Complex(real, imaginary);
    }

    // Print the complex number in the form (a, b)
    public void print() {
        System.out.printf("(%.1f, %.1f)%n", realPart, imaginaryPart);
    }
}

