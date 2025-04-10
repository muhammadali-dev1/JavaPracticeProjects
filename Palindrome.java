// Muhammad Ali
// SBU ID: 115921494
package homework3;
import java.util.Scanner;

public class Palindrome {

	    public static void main(String[] args) {
	        Scanner stdin = new Scanner(System.in);
	        System.out.print("Enter the input string: ");
	        String str = stdin.nextLine();
	        
	        if (isPalindrome(str)) {
	            System.out.println("Input string " + str + " is a palindrome");
	        } else {
	            System.out.println("Input string " + str + " is NOT a palindrome");
	        }
	        
	        stdin.close();  // Close scanner
	    }
	    
	    // Method to check if a string is a palindrome, ignoring spaces and case
	    public static boolean isPalindrome(String str) {
	        str = str.replaceAll("\\s", "").toLowerCase();
	        int left = 0, right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }
	}