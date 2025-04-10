// Muhammad Ali
// 115921494

package homework5;
import java.util.Scanner;

public class MatrixSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input a 3x3 matrix
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] matrix = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        // Sort the rows of the matrix
        double[][] sortedMatrix = sortRows(matrix);

        // Display the sorted matrix
        System.out.println("The row-sorted array is: ");
        for (int i = 0; i < sortedMatrix.length; i++) {
            for (int j = 0; j < sortedMatrix[i].length; j++) {
                System.out.printf("%.3f ", sortedMatrix[i][j]);
            }
            System.out.println();
        }

        input.close();
    }

    // Method to sort rows of the matrix using Bubble Sort
    public static double[][] sortRows(double[][] m) {
        // Create a new array to store the sorted rows
        double[][] sorted = new double[m.length][m[0].length];

        // Copy the input matrix to the new array
        for (int i = 0; i < m.length; i++) {
            System.arraycopy(m[i], 0, sorted[i], 0, m[i].length);
        }

        // Sort each row using Bubble Sort
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted[i].length - 1; j++) {
                for (int k = 0; k < sorted[i].length - j - 1; k++) {
                    if (sorted[i][k] > sorted[i][k + 1]) {
                        // Swap elements
                        double temp = sorted[i][k];
                        sorted[i][k] = sorted[i][k + 1];
                        sorted[i][k + 1] = temp;
                    }
                }
            }
        }

        return sorted;
    }
}
