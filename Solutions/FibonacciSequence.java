import java.util.Scanner;
//Scanner class is imported for user input

public class FibonacciSequence {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input and validate it
        int userInput = getValidInput(scanner);

        // Generate and print the Fibonacci sequence
        System.out.println("Fibonacci Sequence up to " + userInput + ":");
        for (int i = 0; i < userInput; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Array to store the Fibonacci numbers for memoization
    private static int[] fibArray = new int[100];

    // Recursive method to calculate Fibonacci number at position n
    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (fibArray[n] != 0) {
            return fibArray[n];
        } else {
            fibArray[n] = fibonacci(n - 1) + fibonacci(n - 2);
            return fibArray[n];
        }
    }

    // Validate user input to ensure it is a positive integer
    private static int getValidInput(Scanner scanner) {
        int userInput = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a positive integer: ");
            if (scanner.hasNextInt()) {
                userInput = scanner.nextInt();
                if (userInput >= 0) {
                    isValid = true;
                } else {
                    System.out.println("Input must be a positive integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a positive integer.");
                scanner.next();
            }
        }

        return userInput;
    }
}
