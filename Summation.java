package lab8;

public class Summation {
	public static void main(String[] args) {
		
		// Initialize the sum
        double sum = 0.0;
        
        // Start numerator at 1 and denominator at 3
        int numerator = 1;
        int denominator = 3;
        
        // Loop until numerator is 97 and denominator is 99
        while (numerator <= 97 && denominator <= 99) {
            // Add the fraction to the sum
            sum += (double) numerator / denominator;
            
            // Increase numerator and denominator by 2
            numerator += 2;
            denominator += 2;
        }
        
        // Print the result
        System.out.println("The result of the summation is: " + sum);
		
	}
	

}
