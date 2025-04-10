// Muhammad Ali 
// SBU ID: 115921494

package homework2;
import java.util.Scanner;


public class PerfectNumber {
	// Method to check if a number is perfect
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Find all divisors of the number and add them to the sum (excluding the number itself)
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // A number is perfect if the sum of its divisors (excluding itself) equals the number
        return sum == number;
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the upper limit
        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();

        System.out.print("The perfect numbers below " + upperLimit + " are: ");

        // Check for perfect numbers up to the upper limit
        for (int i = 1; i <= upperLimit; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }

        // Close the scanner
        input.close();
    }

}
