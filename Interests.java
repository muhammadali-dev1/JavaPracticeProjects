// Muhammad Ali 
// SBU ID: 115921494

package homework2;

import java.util.Scanner;

public class Interests {

	public static void main(String[] args) {
        // Create a scanner to take user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the loan amount and loan period
        System.out.print("Loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        int numberOfYears = input.nextInt();

        // Display the table header
        System.out.printf("%-10s %-18s %-15s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        // Loop through interest rates from 5% to 8%, incrementing by 0.125% (1/8%)
        for (double annualInterestRate = 5.0; annualInterestRate <= 8.0; annualInterestRate += 0.125) {
            // Calculate monthly interest rate
            double monthlyInterestRate = annualInterestRate / 1200;

            // Calculate monthly payment
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 
                Math.pow(1 / (1 + monthlyInterestRate), numberOfYears * 12));

            // Calculate total payment
            double totalPayment = monthlyPayment * numberOfYears * 12;

            // Display the results
            System.out.printf("%.3f%%         %-18.2f %-15.2f\n", annualInterestRate, monthlyPayment, totalPayment);
        }

        // Close the scanner
        input.close();
}
}
