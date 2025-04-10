// Muhammad Ali
// 115921494

package homework5;
import java.util.Scanner;

public class ComplexTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the first complex number
        System.out.print("Enter real part of the first complex number: ");
        double real1 = input.nextDouble();
        System.out.print("Enter imaginary part of the first complex number: ");
        double imaginary1 = input.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);

        // Input the second complex number
        System.out.print("Enter real part of the second complex number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter imaginary part of the second complex number: ");
        double imaginary2 = input.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);

        // Display the complex numbers
        System.out.print("First complex number is: ");
        c1.print();
        System.out.print("Second complex number is: ");
        c2.print();

        // Addition of the two complex numbers
        Complex sum = c1.add(c2);
        System.out.print("Addition of the complex numbers is: ");
        sum.print();

        // Subtraction of the two complex numbers
        Complex difference = c1.subtract(c2);
        System.out.print("Subtraction of the complex numbers is: ");
        difference.print();

        input.close();
    }
}
