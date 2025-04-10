package lab11;
import java.util.Scanner;

public class StatisticsCalculator {
	
	// Method to compute the mean of an array of double values
    public static double mean(double[] x) {
        double sum = 0;
        for (double num : x) {
            sum += num;
        }
        return sum / x.length;
    }

    // Method to compute the standard deviation of double values
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;
        for (double num : x) {
            sum += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sum / (x.length - 1));
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = stdin.nextDouble();
        }

        double mean = mean(numbers);
        double standardDeviation = deviation(numbers);

        System.out.printf("The mean is %.2f\n", mean);
        System.out.printf("The standard deviation is %.5f\n", standardDeviation);
        
        stdin.close();
}
}