package joelorie.github.io;

public class Bank {
  private final String accountNumber;
  private String accountHolder;
  private double balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountHolder(String accountHolder) {
    if (accountHolder == null || accountHolder.isEmpty()) {
      throw new IllegalArgumentException("Account holder name cannot be null or empty.");
    }
    this.accountHolder = accountHolder;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void deposit(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Deposit amount must be positive.");
    }
    balance += amount;
  }

  public void withdraw(double amount) {
    if (amount <= 0) {
      throw new IllegalArgumentException("Withdrawal amount must be positive.");
    }
    if (amount > balance) {
      throw new IllegalArgumentException("Insufficient funds for withdrawal.");
    }
    balance -= amount;
  }

  public Bank(String accountNumber, String accountHolder, double initialBalance) {
    if (accountNumber == null || accountNumber.isEmpty()) {
      throw new IllegalArgumentException("Account number cannot be null or empty.");
    }
    if (accountHolder == null || accountHolder.isEmpty()) {
      throw new IllegalArgumentException("Account holder name cannot be null or empty.");
    }
    if (initialBalance < 0) {
      throw new IllegalArgumentException("Initial balance cannot be negative.");
    }
    this.accountNumber = accountNumber;
    this.accountHolder = accountHolder;
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  public void displayAccountInfo() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder: " + accountHolder);
    System.out.println("Balance: $" + String.format("%.2f", balance));
  }

  public static void main(String[] args) {
    Bank myAccount = new Bank("123456789", "John Doe", 1000.00);
    myAccount.displayAccountInfo();
    myAccount.deposit(500.00);
    System.out.println("After deposit:");
    myAccount.displayAccountInfo();
    myAccount.withdraw(200.00);
    System.out.println("After withdrawal:");
    myAccount.displayAccountInfo(); 
  }
}
