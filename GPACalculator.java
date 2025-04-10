package lab12;
import java.util.Scanner;


public class GPACalculator {

    public static double gpaCalculator(String[] grades) {
        if (grades.length == 0) {
            return -1.0;
        }
        
        double totalPoints = 0.0;
        int validGradesCount = 0;

        for (String grade : grades) {
            switch (grade) {
                case "A":
                    totalPoints += 4.0;
                    validGradesCount++;
                    break;
                case "B":
                    totalPoints += 3.0;
                    validGradesCount++;
                    break;
                case "C":
                    totalPoints += 2.0;
                    validGradesCount++;
                    break;
                case "D":
                    totalPoints += 1.0;
                    validGradesCount++;
                    break;
                case "F":
                    totalPoints += 0.0;
                    validGradesCount++;
                    break;
                case "P":
                case "NC":
                    // Ignore P and NC grades
                    break;
                default:
                    // Invalid grade, return -1.0
                    return -1.0;
            }
        }

        if (validGradesCount == 0) {
            return 0.0;
        }

        return totalPoints / validGradesCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of grades:");
        int numberOfGrades = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        String[] grades = new String[numberOfGrades];

        System.out.println("Enter the grades (one at a time):");
        for (int i = 0; i < numberOfGrades; i++) {
            grades[i] = scanner.nextLine().toUpperCase(); // Read grade and convert to uppercase for uniformity
        }

        double gpa = gpaCalculator(grades);
        if (gpa == -1.0) {
            System.out.println(gpa);
        } else {
            System.out.println("The GPA is: " + gpa);
        }

        scanner.close();
    }
}