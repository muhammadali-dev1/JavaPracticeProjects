package lab19;
import java.util.Scanner;


public class LinearEquation {
    // Private data fields
    private double a, b, c, d, e, f;

    // Constructor with arguments for a, b, c, d, e, and f
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter methods
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Method to check if the equation is solvable
    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    // Method to get the value of x
    public double getX() {
        if (isSolvable()) {
            return (e * d - b * f) / (a * d - b * c);
        } else {
            throw new ArithmeticException("The equation has no solutions.");
        }
    }

    // Method to get the value of y
    public double getY() {
        if (isSolvable()) {
            return (a * f - e * c) / (a * d - b * c);
        } else {
            throw new ArithmeticException("The equation has no solutions.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for inputs
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Create a LinearEquation object
        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        // Display the result
        if (equation.isSolvable()) {
            System.out.println("X is " + equation.getX() + " and Y is " + equation.getY());
        } else {
            System.out.println("The equation has no solutions.");
        }

        input.close();
    }
}
