package joelorie.github.io;

public class SavingsAccount extends BankAccount {
  private final double interestRate;

  public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) {
    super(accountNumber, accountHolder, initialBalance);
    if (interestRate < 0) {
      throw new IllegalArgumentException("Interest rate cannot be negative.");
    }
    this.interestRate = interestRate;
  }

  public SavingsAccount() {
    super("00000", "Default Holder", 0.0);
    this.interestRate = 0.0;
  }

  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SavingsAccount("67890", "Jane Doe", 500.0, 2.5);
    System.out.println("Initial balance: " + savingsAccount.getBalance());
    savingsAccount.applyInterest();
    System.out.println("Balance after applying interest: " + savingsAccount.getBalance());
  }

  @Override
  public void withdraw(double amount) {
    if (super.getBalance() - amount < 100) {
      throw new IllegalArgumentException("Cannot withdraw: balance cannot go below $100 minimum.");
    }
    super.withdraw(amount);
  }

  public void applyInterest() {
    double interest = super.getBalance() * interestRate / 100;
    super.deposit(interest);
  }
}
