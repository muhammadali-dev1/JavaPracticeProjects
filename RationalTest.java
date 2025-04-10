// Muhammad Ali
// 115921494

package homework5;
import java.util.Scanner;

public class RationalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input first rational number
        System.out.print("Enter numerator for the first rational number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the first rational number: ");
        int den1 = input.nextInt();
        Rational r1 = new Rational(num1, den1);

        // Input second rational number
        System.out.print("Enter numerator for the second rational number: ");
        int num2 = input.nextInt();
        System.out.print("Enter a non-zero denominator for the second rational number: ");
        int den2 = input.nextInt();
        Rational r2 = new Rational(num2, den2);

        // Display the rational numbers
        System.out.println("First rational number is: " + r1);
        System.out.println("Second rational number is: " + r2);

        // Perform and display arithmetic operations
        System.out.println("Addition of the rational numbers is: " + r1.add(r2));
        System.out.println("Subtraction of the rational numbers is: " + r1.subtract(r2));
        System.out.println("Multiplication of the rational numbers is: " + r1.multiply(r2));
        System.out.println("Division of the rational numbers is: " + r1.divide(r2));

        input.close();
    }
}
