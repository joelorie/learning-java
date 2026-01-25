package joelorie.github.io;

public class BankAccount {
  private final String accountNumber;
  private String accountHolder;
  private double balance;

  public String getAccountNumber() {
    return accountNumber;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public void setAccountHolder(String accountHolder) {
    if (accountHolder == null || accountHolder.isEmpty()) {
      throw new IllegalArgumentException("Account holder name cannot be null or empty.");
    }
    this.accountHolder = accountHolder;
  }

  public double getBalance() {
    return balance;
  }

  public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
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
    setAccountHolder(accountHolder);
    this.balance = initialBalance;
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

  public static void main(String[] args) {
    BankAccount account = new BankAccount("12345", "John Doe", 1000.0);
    System.out.println("Initial balance: " + account.getBalance());
    account.deposit(500.0);
    System.out.println("Balance after deposit: " + account.getBalance());
    account.withdraw(200.0);
    System.out.println("Balance after withdrawal: " + account.getBalance());
  }

}
