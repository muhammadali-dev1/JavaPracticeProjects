// Muhammad Ali
// 115921494

package homework5;
import java.util.Scanner;


public class MatrixMultiply {
	
	    public static void main(String[] args) {
	        Scanner stdin = new Scanner(System.in);

	        // Input matrix 1
	        System.out.println("Enter matrix1 (3x3): ");
	        double[][] matrix1 = new double[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matrix1[i][j] = stdin.nextDouble();
	            }
	        }

	        // Input matrix 2
	        System.out.println("Enter matrix2 (3x3): ");
	        double[][] matrix2 = new double[3][3];
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matrix2[i][j] = stdin.nextDouble();
	            }
	        }

	        // Multiply the matrices
	        double[][] result = multiplyMatrix(matrix1, matrix2);

	        // Display the result
	        System.out.println("Multiplication of the matrices is: ");
	        for (int i = 0; i < result.length; i++) {
	            for (int j = 0; j < result[0].length; j++) {
	                System.out.printf("%.1f ", result[i][j]);
	            }
	            System.out.println();
	        }

	        stdin.close();
	    }

	    // Method to multiply two matrices
	    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
	        int rows = a.length;
	        int cols = b[0].length;
	        int n = b.length;

	        double[][] c = new double[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                for (int k = 0; k < n; k++) {
	                    c[i][j] += a[i][k] * b[k][j];
	                }
	            }
	        }

	        return c;
	    }
	}



