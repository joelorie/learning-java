package joelorie.github.io;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Select an option:");
        System.out.println("1. Simple Calculator");
        System.out.println("2. Student Information");
        System.out.println("3. BMI Calculator");
        System.out.println("4. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                SimpleCalculator();
                break;
            case 2:
                StudentInformation();
                break;
            case 3:
                BmiCalculator();
                break;
            case 4:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }

    public static void SimpleCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        } else {
            System.out.println("Division and modulus by zero is not allowed.");
        }
        scanner.close();
    }

    public static void StudentInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter student grade: ");
        char grade = scanner.nextLine().charAt(0);
        System.out.println("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
        scanner.close();
    }

    public static void BmiCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }
        scanner.close();
    }
}
