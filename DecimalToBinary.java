// Muhammad Ali
// SBU ID: 115921494

package homework3;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        
        System.out.println("Binary equivalent: " + dec2Bin(decimal));
        
        input.close();  // Close scanner
    }
    
    // Method to convert decimal to binary
    public static String dec2Bin(int value) {
        if (value == 0) return "0";
        
        StringBuilder binary = new StringBuilder();
        while (value > 0) {
            binary.insert(0, value % 2);  // Insert remainder at the start of the string
            value /= 2;                   // Divide value by 2
        }
        
        return binary.toString();
    }
}



