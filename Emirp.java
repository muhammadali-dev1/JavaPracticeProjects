// Muhammad Ali
// SBU ID: 115921494

package homework3;


public class Emirp {
	
	public static void main(String[] args) {
        int count = 0;  // Count to keep track of found emirps
        int number = 2; // Starting number
        
        // Loop to find and print the first 100 emirps
        while (count < 100) {
            if (isEmirp(number)) {
                System.out.print(number + " ");
                count++;
                if (count % 10 == 0) { // New line after every 10 numbers
                    System.out.println();
                }
            }
            number++;
        }
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }
    
    // Method to reverse a number
    public static int reverse(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }
    
    // Method to check if a number is an emirp
    public static boolean isEmirp(int num) {
        return isPrime(num) && !isPalindrome(num) && isPrime(reverse(num));
    }
}


