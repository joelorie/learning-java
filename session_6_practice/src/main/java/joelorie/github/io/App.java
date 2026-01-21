package joelorie.github.io;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option:");
        System.out.println("1. Convert Celcius to Fahrenheit (C to F) no decimal places");
        System.out.println("2. Convert Celcius to Fahrenheit (C to F) with decimal places");
        System.out.println("3. Convert Fahrenheit to Celcius (F to C) with no decimal places");
        System.out.println("4. Convert Fahrenheit to Celcius (F to C) with decimal places");
        System.out.println("5. Print temperature conversion table");
        System.out.println("6. Student Grade Calculator");
        System.out.println("7. Exit");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1 -> ConvertionFunctions.celciusToFarenheit(scanner);
            case 2 -> {
                System.out.println("Enter number of decimal places:");
                int decimalPlaces = getNumber(scanner);
                ConvertionFunctions.celciusToFarenheit(scanner, decimalPlaces);
            }
            case 3 -> ConvertionFunctions.farenheitToCelcius(scanner);
            case 4 -> {
                System.out.println("Enter number of decimal places:");
                int decimalPlaces = getNumber(scanner);
                ConvertionFunctions.farenheitToCelcius(scanner, decimalPlaces);
            }
            case 5 -> ConvertionFunctions.printConversionTable();
            case 6 -> StudentGradeCalculator.main(scanner);
            case 7 -> {
                System.out.println("Exiting the program. Goodbye!");
                scanner.close();
                return;
            }
            default -> System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
        }
    }

    public static int getNumber(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next(); // Clear the invalid input
            return getNumber(scanner);
        }
    }
}
