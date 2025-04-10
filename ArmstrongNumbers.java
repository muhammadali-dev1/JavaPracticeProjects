// Muhammad Ali 
// SBU ID: 115921494

package homework2;
import java.util.Scanner;

public class ArmstrongNumbers {

	// Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        // Convert the number to a string to easily find the number of digits
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int sum = 0;
        int temp = number;

        // Loop through each digit and sum up the nth powers of the digits
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        // A number is Armstrong if the sum of the nth powers of its digits equals the number itself
        return sum == number;
    }

    public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the lower and upper limits
        System.out.print("Enter the lower limit: ");
        int lowerLimit = input.nextInt();

        System.out.print("Enter the upper limit: ");
        int upperLimit = input.nextInt();

        System.out.print("The Armstrong numbers between " + lowerLimit + " and " + upperLimit + " are: ");

        // Check for Armstrong numbers between the lower and upper limits
        boolean foundArmstrong = false;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                foundArmstrong = true;
            }
        }

        // If no Armstrong number was found in the range, print a message
        if (!foundArmstrong) {
            System.out.print("None");
        }

        // Close the scanner
        input.close();
    }
}
