package joelorie.github.io;

import java.util.Random;
import java.util.Scanner;

public class BankApplication {
  public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException {
    Scanner scanner = new Scanner(System.in);
    Bank bank = new Bank();
    while (true) {
      System.out.println("=== Bank Account System ===");
      System.out.println("1. Create Savings Account");
      System.out.println("2. Create Checking Account");
      System.out.println("3. Deposit");
      System.out.println("4. Withdraw");
      System.out.println("5. Check Balance");
      System.out.println("6. Apply Interest");
      System.out.println("7. Display All Accounts");
      System.out.println("8. Exit");
      System.out.println("Enter choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine();

      switch (choice) {
        case 1 -> {
          System.out.println("Enter your name: ");
          String name = scanner.nextLine();
          System.out.println("Enter amount to deposit initially: ");
          int initialBalance = scanner.nextInt();
          scanner.nextLine();
          double interestRate = 0.1;
          String accountNumber = String.valueOf(generateAccountNumber());
          BankAccount account = new SavingsAccount(accountNumber, name, initialBalance, interestRate);
          bank.addAccount(account);
        }
        case 2 -> {
          System.out.println("Enter your name: ");
          String name = scanner.nextLine();
          System.out.println("Enter amount to deposit initially: ");
          int initialBalance = scanner.nextInt();
          scanner.nextLine();
          int overdraftLimit = 500;
          String accountNumber = String.valueOf(generateAccountNumber());
          BankAccount account = new CheckingAccount(accountNumber, name, initialBalance, overdraftLimit);
          bank.addAccount(account);
        }
        case 3 -> {
          System.out.println("Enter account number: ");
          String accountNumber = scanner.nextLine();
          BankAccount account = bank.findAccount(accountNumber);
          System.out.println("Enter amount to be deposited: ");
          double depositAmount = scanner.nextDouble();
          scanner.nextLine();
          account.deposit(depositAmount);
        }
        case 4 -> {
          System.out.println("Enter account number: ");
          String accountNumber = scanner.nextLine();
          BankAccount account = bank.findAccount(accountNumber);
          System.out.println("Enter amount to be withdrawn: ");
          double withdrawalAmount = scanner.nextDouble();
          scanner.nextLine();
          account.withdraw(withdrawalAmount);
        }
        case 5 -> {
          System.out.println("Enter account number: ");
          String accountNumber = scanner.nextLine();
          BankAccount account = bank.findAccount(accountNumber);
          account.getBalance();
        }
        case 6 -> {
          System.out.println("Enter account number: ");
          // String accountNumber = scanner.nextLine();
          // BankAccount account = bank.findAccount(accountNumber);
          // account.applyInterest();
        }
        case 7 -> {
          System.out.println(bank);
        }
        case 8 -> {
          System.out.println("=== Thank you for using Banking System ===");
          break;
        }
        default -> System.out.println("=== Invalid choice. Please try again.");

      }

      scanner.close();
    }
  }

  public static int generateAccountNumber() {
    Random random = new Random();
    int number = 1_000_000 + random.nextInt(9_000_000);
    return number;
  }
}
