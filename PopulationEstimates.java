package lab4;
import java.util.Scanner;

public class PopulationEstimates {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
        Scanner stdin = new Scanner(System.in);
        
        // Prompt the user to enter a four-digit year
        System.out.print("Enter a year: ");
        int year = stdin.nextInt();
        
        // Extract the last two digits of the year
        int lastTwoDigits = year % 100;
        
        // Apply the formula to estimate the population
        int populationEstimate = (lastTwoDigits - 10) * 3 + 310;
        
        // Display the population estimate
        System.out.println("Population estimate (millions of people): " + populationEstimate);
        
        // Close the scanner
        stdin.close();
	}

}
