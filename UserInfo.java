import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the user's surname
        System.out.print("Please enter your surname: ");
        String surname = scanner.nextLine();
        
        // Ask for the user's age
        System.out.print("Please enter your current age: ");
        int age = scanner.nextInt();
        
        // Print the number of characters in the surname
        System.out.println("The number of characters in your surname is: " + surname.length());
        
        // Determine if the age is even or odd and print
        if (age % 2 == 0) {
            System.out.println("Your current age is an even number.");
        } else {
            System.out.println("Your current age is an odd number.");
        }
        
        scanner.close();
    }
}
