package lab24;
import java.util.Random;
import java.util.Scanner;

public class ArrayRandomIntegers {
    public static void main(String[] args) {
        // Step 1: Create an array with 100 random integers in the range of 1 to 100
        int[] randomNumbers = new int[100];
        Random random = new Random();

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100) + 1; // Random number between 1 and 100
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Step 2: Prompt the user to enter an index
                System.out.print("Enter an index of the array (0-99): ");
                int index = scanner.nextInt();

                // Step 3: Display the value at the index
                System.out.println("Value at index " + index + ": " + randomNumbers[index]);
                break; // Exit the loop after a successful input
            } catch (ArrayIndexOutOfBoundsException e) {
                // Step 4: Handle the exception for an out-of-bounds index
                System.out.println("Out of Bounds. Please enter an index between 0 and 99.");
            } catch (Exception e) {
                // Handle any other unexpected input issues
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }

        scanner.close();
    }
}
