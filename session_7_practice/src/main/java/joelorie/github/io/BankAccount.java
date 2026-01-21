package joelorie.github.io;

public class BankAccount {
  private String accountNumber;
  private String accountHolder;
  private double balance;

  public BankAccount() {
    this.accountNumber = "Unknown";
    this.accountHolder = "Unknown";
    this.balance = 0.0;
  }

  public BankAccount(String accountNumber, String accountHolder) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = 0.0;
  }

  public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  public void withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
    } else {
      System.out.println("Insufficient funds or invalid withdrawal amount.");
    }
  }

  public void displayBalance() {
    System.out.printf("Account Holder: %s%nAccount Number: %s%nBalance: $%.2f%n", accountHolder, accountNumber,
        balance);
  }

}
