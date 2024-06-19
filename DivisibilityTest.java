import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check its divisibility: ");
        int number = scanner.nextInt();

        // Check divisibility from 1 to 9 (0 is excluded as all numbers are divisible by 0)
        for (int i = 1; i < 10; i++) {
            if (number % i == 0) {
                switch (i) {
                    case 2:
                        System.out.println(number + " is divisible by " + i + " because it is even.");
                        break;
                    case 5:
                        System.out.println(number + " is divisible by " + i + " because it ends with a 5 or 0.");
                        break;
                    // Add more cases for other specific divisibility rules
                    default:
                        System.out.println(number + " is divisible by " + i + ".");
                        break;
                }
            }
        }
        
        scanner.close();
    }
}
