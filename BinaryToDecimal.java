// Muhammad Ali
// SBU ID: 115921494

package homework3;
import java.util.Scanner;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = input.nextLine();
        
        System.out.println("Decimal equivalent: " + bin2Dec(binaryString));
        
        input.close();  // Close scanner
    }
    
    // Method to convert binary string to decimal
    public static int bin2Dec(String binaryString) {
        int decimal = 0;
        int power = 0;
        
        // Convert each character in the binary string to its decimal equivalent
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            if (binaryString.charAt(i) == '1') {
                decimal += Math.pow(2, power);  // Add 2^power for each '1' in the binary string
            }
            power++;
        }
        
        return decimal;
    }
}



