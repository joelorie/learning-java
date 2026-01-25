package joelorie.github.io;

public class CheckingAccount extends BankAccount {
  private final double overdraftLimit;

  public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) {
    super(accountNumber, accountHolder, initialBalance);
    if (overdraftLimit < 0) {
      throw new IllegalArgumentException("Overdraft limit cannot be negative.");
    }
    this.overdraftLimit = overdraftLimit;
  }

  public CheckingAccount() {
    super("00000", "Default Holder", 0.0);
    this.overdraftLimit = 100.0;
  }

  @Override
  public void withdraw(double amount) {
    if (super.getBalance() - amount < -overdraftLimit) {
      throw new IllegalArgumentException("Cannot withdraw: exceeds overdraft limit.");
    }
    super.withdraw(amount);
  }

  public static void main(String[] args) {
    CheckingAccount checkingAccount = new CheckingAccount("54321", "Alice Smith", 300.0, 200.0);
    System.out.println("Initial balance: " + checkingAccount.getBalance());
    checkingAccount.withdraw(400.0);
    System.out.println("Balance after withdrawal: " + checkingAccount.getBalance());
    try {
      checkingAccount.withdraw(200.0);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }
}