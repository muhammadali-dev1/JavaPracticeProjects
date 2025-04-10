package lab6;
import java.util.Random;

public class RandomIntegersAverage {
	public static void main(String[] args) {
		// Create an instance of the Random class
        Random random = new Random();

        // Variables to store the sum of random numbers and the average
        int sum = 0;
        double average;

        // Loop to generate 10 random integers between 0 (inclusive) and 100 (exclusive)
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // Generates random integer between 0 and 99
            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);
            sum += randomNumber; // Add the generated number to the sum
        }

        // Compute the average
        average = sum / 10.0; // Use 10.0 to ensure the result is a double

        // Output the average
        System.out.println("Average value: " + average);
	}

}
