package lab10;
import java.util.Scanner;

public class ReverseInteger {
	
	// Method to reverse the digits of the integer
	public static void reverse(int number) {
	        while (number != 0) {
	            // Extract the last digit of the number
	            int digit = number % 10;
	            // Print the digit (without a newline)
	            System.out.print(digit);
	            // Remove the last digit from the number
	            number /= 10;
	        }
	        System.out.println(); // Move to a new line after printing the reversed number
	    }

	    public static void main(String[] args) {
	        // Create a scanner object to take user input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter an integer
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        // Call the reverse method to display the reversed number
	        System.out.print("The reversed number is: ");
	        reverse(number);

	        // Close the scanner
	        scanner.close();
	}

}
