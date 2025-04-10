package lab4;
import java.util.Scanner;

public class Intererst {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
        Scanner stdin = new Scanner(System.in);

        
     // Prompt the user to enter the balance and the annual percentage interest rate in a single line
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = stdin.nextDouble();
        double annualInterestRate = stdin.nextDouble();
        
        // Calculate the interest for the next month
        double monthlyInterest = balance * (annualInterestRate / 1200);
        
        // Display the monthly interest rounded to 5 decimal places
        System.out.printf("The interest is %.5f\n", monthlyInterest);
        
        // Close the scanner
        stdin.close();
        
	}

}