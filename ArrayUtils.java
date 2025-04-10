// Muhammad Ali
// 115921494


package homework4;
import java.util.Random;


public class ArrayUtils {
	// a. Method to create an array with random numbers within a range
    public static int[] randomArray(int size, int upperLimit) {
        int[] array = new int[size];
        Random random = new Random();
        
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(upperLimit);
        }
        
        return array;
    }

    // b. Method to print the elements of an integer array
    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? " " : ""));
        }
        System.out.println("]");
    }

    // c. Method to sum all elements of an integer array
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // d. Method to find the index of the first occurrence of a number in the array
    public static int contains(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // e. Method to count multiples of a given number in an array
    public static int countMultiplesOf(int[] array, int divisor) {
        int count = 0;
        for (int value : array) {
            if (isMultipleOf(value, divisor)) {
                count++;
            }
        }
        return count;
    }

    // Helper method to check if a number is a multiple of another number
    private static boolean isMultipleOf(int value, int divisor) {
        return divisor != 0 && value % divisor == 0;
    }

    public static void main(String[] args) {
        // Test the randomArray method
        int[] randomArray = randomArray(100, 21);
        
        // Test the print method
        print(randomArray); // Comment out this line in the final version

        // Test the arraySum and compute average
        int sum = arraySum(randomArray);
        double average = sum / (double) randomArray.length;
        System.out.println("The average of the array is: " + average);

        // Test the contains method
        int index = contains(randomArray, 12);
        System.out.println("The index of the first occurrence of 12 is: " + index);

        // Test the countMultiplesOf method
        int multiplesOfSeven = countMultiplesOf(randomArray, 7);
        System.out.println("The count of numbers that are multiples of 7 is: " + multiplesOfSeven);
    }
}


