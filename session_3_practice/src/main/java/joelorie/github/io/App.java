package joelorie.github.io;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Age Categorizer");
        System.out.println("2. Switched Calculator");
        System.out.println("3. Traffic Light Simulator");
        System.out.print("Enter your choice (1, 2, 3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1 -> AgeCategorizer(scanner);
            case 2 -> SwitchedCalculator(scanner);
            case 3 -> TrafficLightSimulator(scanner);
            default -> System.out.println("Invalid choice. Please restart the program and select either 1, 2, or 3.");
        }
        scanner.close();
    }

    public static void AgeCategorizer(Scanner scanner) {
        int age = getAge(scanner);
        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age <= 2) {
            System.out.println("Infant");
        } else if (age <= 19) {
            System.out.println("Teenager");
        } else if (age <= 64) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }

    public static void SwitchedCalculator(Scanner scanner) {
        double num1, num2, result;
        System.out.print("Enter first number: ");
        num1 = getNumber(scanner);
        System.out.print("Enter second number: ");
        num2 = getNumber(scanner);
        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = scanner.nextLine();
        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
                break;
        }
    }

    public static void TrafficLightSimulator(Scanner scanner) {
        System.out.println("Enter a traffic light color (red, yellow, green, blinking red, blinking yellow): ");
        String color = scanner.nextLine().toLowerCase();
        switch (color) {
            case "red" -> System.out.println("Stop");
            case "yellow" -> System.out.println("Prepare to stop");
            case "green" -> System.out.println("Go");
            case "blinking red" -> System.out.println("Treat as stop sign");
            case "blinking yellow" -> System.out.println("Proceed with caution");
            default -> System.out.println("Invalid color entered.");
        }
    }

    public static int getAge(Scanner scanner) {
        while (true) {
            System.out.print("Please enter your age: ");
            String input = scanner.nextLine();
            try {
                int age = Integer.parseInt(input);
                return age;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
            }
        }
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
