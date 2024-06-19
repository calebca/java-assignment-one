import java.util.Scanner;

// This class represents a simple calculator that can perform basic operations.
public class BasicCalculator {
    // Main method where the program starts execution.
    public static void main(String[] args) {
        // Scanner object to read input from the user.
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user and read the first number.
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        
        // Prompt user and read the operation to perform.
        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        // Prompt user and read the second number.
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        
        double result; // Variable to store the result of the operation.
        
        // Switch statement to handle different operations.
        switch (operation) {
            case '+': // Addition
                result = firstNumber + secondNumber;
                break;
            case '-': // Subtraction
                result = firstNumber - secondNumber;
                break;
            case '*': // Multiplication
                result = firstNumber * secondNumber;
                break;
            case '/': // Division
                if (secondNumber != 0) { // Check for division by zero.
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return; // Exit if division by zero is attempted.
                }
                break;
            default: // Invalid operation
                System.out.println("Error: Invalid operation.");
                return; // Exit if an invalid operation is entered.
        }
        
        // Display the result of the operation.
        System.out.println("Result: " + result);
    }
}
