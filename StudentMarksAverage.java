import java.util.Scanner;

// This class calculates the average marks of a student.
public class StudentMarksAverage {
    // The main method where the program starts execution.
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        double sum = 0; // Variable to store the sum of all marks.
        int units = 5; // The number of units.

        // Loop to read marks for each unit.
        for (int i = 1; i <= units; i++) {
            System.out.print("Enter the mark for unit " + i + ": "); // Prompt user for input.
            double mark = scanner.nextDouble(); // Read the mark for a unit.
            sum += mark; // Add the mark to the sum.
        }

        double average = sum / units; // Compute the average.
        // Print the average rounded to two decimal places.
        System.out.printf("The average mark is: %.2f", average);
    }
}

