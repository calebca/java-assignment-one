public class MultiplesInRange {
    // Main method where the program execution begins.
    public static void main(String[] args) {
        // Define the start and end of the range.
        int start = 71;
        int end = 150;

        // Print out a header for clarity.
        System.out.println("Multiples of 2, 3, and 7 between " + start + " and " + end + ":");

        // Loop through each number in the range.
        for (int i = start; i <= end; i++) {
            // Check if the current number is a multiple of 2, 3, or 7.
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                // If it is, print the number.
                System.out.println(i);
            }
        }
    }
}
