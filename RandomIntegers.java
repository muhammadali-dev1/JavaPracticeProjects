package lab20;
import java.util.Random;


public class RandomIntegers {
    public static void main(String[] args) {
        // Create a Random object with seed 1000
        Random random = new Random(1000);

        // Display the first 50 random integers between 1 and 100
        for (int i = 0; i < 50; i++) {
            // Generate a random integer between 1 and 100
            int randomNumber = 1 + random.nextInt(100);
            System.out.print(randomNumber + " ");
        }
    }
}
