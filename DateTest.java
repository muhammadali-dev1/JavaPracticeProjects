package lab20;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        // Array of elapsed times
        long[] elapsedTimes = {10000, 100000, 1000000, 10000000, 100000000, 
                               1000000000, 10000000000L, 100000000000L};

        // Loop through each elapsed time
        for (long elapsedTime : elapsedTimes) {
            // Create a Date object and set its time
            Date date = new Date();
            date.setTime(elapsedTime);

            // Display the date and time
            System.out.println("Elapsed time: " + elapsedTime + " - Date and Time: " + date.toString());
        }
    }
}
