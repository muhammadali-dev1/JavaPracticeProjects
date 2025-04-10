package lab11;
import java.util.Scanner;

public class ReverseArray {
	
	// Method to reverse the array in place
    public static void reverse(double[] array) {
        int start = 0;
        int end = array.length - 1;
        
        while (start < end) {
            // Swap the elements at 'start' and 'end'
            double temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            // Move start forward and end backward
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        double[] numbers = new double[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = stdin.nextDouble();
        }

        // Reverse the array
        reverse(numbers);

        // Display the reversed array
        System.out.print("The reversed array is: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        stdin.close();
    }
}


