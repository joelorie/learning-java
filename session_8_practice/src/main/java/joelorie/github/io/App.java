package joelorie.github.io;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an Option:");
        System.out.println("1. Student Management");
        System.out.println("2. Temperature Conversion");
        System.out.println("3. Book Management");
        System.out.println("4. Car Management");
        System.out.println("5. Bank Account Management");

        int choice = getInt(scanner);
        switch (choice) {
            case 1 -> Student.main(args);
            case 2 -> Temperature.main(args);
            case 3 -> Book.main(args);
            case 4 -> Car.main(args);
            case 5 -> Bank.main(args);
            default -> System.out.println("Invalid option selected.");
        }
    }

    public static int getInt(Scanner scanner) {
        while (true) {
            System.out.print("Please enter an integer: ");
            String input = scanner.nextLine();
            try {
                int value = Integer.parseInt(input);
                System.out.println("You entered: " + value);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }
}
