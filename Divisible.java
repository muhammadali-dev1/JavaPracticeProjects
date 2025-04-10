// Muhammad Ali SBU ID: 115921494

package homework1;
import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		
        // Create a Scanner object to read input
		Scanner stdin = new Scanner(System.in);
		
        // Prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = stdin.nextInt();
		
		// Check divisibility conditions
        boolean divisibleByBoth = (number % 5 == 0) && (number % 6 == 0);
        boolean divisibleByEither = (number % 5 == 0) || (number % 6 == 0);
        boolean divisibleByOneButNotBoth = (number % 5 == 0) ^ (number % 6 == 0); // XOR operator checks if only one is true

        // Display the results
        System.out.println("Is " + number + " divisible by 5 and 6? " + divisibleByBoth);
        System.out.println("Is " + number + " divisible by 5 or 6? " + divisibleByEither);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisibleByOneButNotBoth);

        // Close the scanner
        stdin.close();

		
		
	}
	
	


}
