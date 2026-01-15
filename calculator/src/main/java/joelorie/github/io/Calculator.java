package joelorie.github.io;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double result;
    System.out.println("Enter the first number: ");
    double num1 = scanner.nextDouble();
    System.out.println("Enter the second number: ");
    double num2 = scanner.nextDouble();
    System.out.println("Enter an operator (+, -, *, /): ");
    char operator = scanner.next().charAt(0);

    switch (operator) {
        case '+':
            result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
            break;
        case '-':
            result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
            break;
        case '*':
            result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
            break;
        case '/':
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
    }
    scanner.close();
  }
}
