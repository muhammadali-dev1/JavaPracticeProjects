package lab24;
import java.util.Scanner;
import java.util.InputMismatchException;

public class SumTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;

        // Get the first integer
        while (!validInput) {
            System.out.print("Enter the first integer: ");
            try {
                num1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        validInput = false; // Reset for second input

        // Get the second integer
        while (!validInput) {
            System.out.print("Enter the second integer: ");
            try {
                num2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Display the sum
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
