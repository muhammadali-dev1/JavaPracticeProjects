package lab9;

public class ComputeSummation {
	
	// Method to compute the summation m(i)
    public static double computeSummation(int i) {
        double sum = 0;  // Start with a sum of 0

        // Loop through each term from 1 to i
        for (int j = 1; j <= i; j++) {
            sum += (double) j / (j + 1);  // Add each term to the sum
        }

        return sum;  // Return the final summation
    }

    public static void main(String[] args) {
        // Print the header of the table
        System.out.println("i    m(i)");

        // Loop through the values of i from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Compute the summation for i
            double result = computeSummation(i);

            // Print the result (i and m(i)) formatted to 4 decimal places
            System.out.println(i + "    " + String.format("%.4f", result));
        }
    }
}

