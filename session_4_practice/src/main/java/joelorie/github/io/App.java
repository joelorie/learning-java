package joelorie.github.io;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Multiplication Table");
        System.out.println("2. Number Statistics");
        System.out.println("3. Prime Number Checker");
        System.out.println("4. Number Guessing Game");
        System.out.println("5. Pattern Printer");
        System.out.println("6. Factorial Calculator");
        System.out.println("7. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1 -> MultiplicationTable(scanner);
            case 2 -> NumberStatistics(scanner);
            case 3 -> PrimeNumberChecker(scanner);
            case 4 -> NumberGuessingGame(scanner);
            case 5 -> PatternPrinter(scanner);
            case 6 -> FactorialCalculator(scanner);
            case 7 -> System.out.println("Exiting the program.");
            default -> System.out.println("Invalid choice. Please select a valid option.");
        }
        scanner.close();
    }

    public static void MultiplicationTable(Scanner scanner) {
        System.out.println("Enter a number to generate its multiplication table: ");
        double number = getNumber(scanner);
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= number; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

    public static void NumberStatistics(Scanner scanner) {
        System.out.println("Enter numbers to compute statistics. Type 0 when done.");
        double sum = 0;
        double average = 0;
        int count = 0;
        while (true) {
            System.out.print("Enter a number (0 to finish): ");
            double number = getNumber(scanner);
            if (number == 0) {
                break;
            } else if (number < 0) {
                System.out.println("Negative numbers are not allowed. Please enter a non-negative number.");
                continue;
            }
            sum += number;
            count++;
        }
        if (count > 0) {
            average = sum / count;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Count: " + count);
    }

    public static void PrimeNumberChecker(Scanner scanner) {
        System.out.println("Enter a number to check if it's prime: ");
        int number = (int) getNumber(scanner);
        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }
        System.out.println(number + " is a prime number.");
    }

    public static void NumberGuessingGame(Scanner scanner) {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int attempts = 10;
        System.out.println("Guess a number between 1 and 100:");
        while (true) {
            System.out.print("Enter your guess: ");
            int guess = (int) getNumber(scanner);
            attempts--;
            if (guess < targetNumber && attempts > 0) {
                System.out.println("Too low! Try again." + " Attempts left: " + attempts);
            } else if (guess > targetNumber && attempts > 0) {
                System.out.println("Too high! Try again." + " Attempts left: " + attempts);
            } else if (attempts == 0) {
                System.out.println("Game over! You've run out of attempts. The number was " + targetNumber);
                break;
            } else {
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " in " + (10 - attempts) + " attempts.");
                break;
            }
        }
    }

    public static void PatternPrinter(Scanner scanner) {
        System.out.println("Enter the number of rows for the pattern: ");
        int rows = (int) getNumber(scanner);
        System.out.println("Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void FactorialCalculator(Scanner scanner) {
        System.out.println("Enter a non-negative integer to calculate its factorial: ");
        int number = (int) getNumber(scanner);
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static double getNumber(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            try {
                double number = Double.parseDouble(input);
                return number;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}
