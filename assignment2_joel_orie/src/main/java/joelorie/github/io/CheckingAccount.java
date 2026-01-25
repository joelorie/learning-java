package joelorie.github.io;

public class CheckingAccount extends BankAccount {
  private double overdraftLimit;

  public CheckingAccount(String accountNumber, String accountHolder, double initialBalance, double overdraftLimit) throws InvalidAmountException {
    super(accountNumber, accountHolder, initialBalance);
    if (overdraftLimit < 0) {
      throw new IllegalArgumentException("Overdraft limit cannot be negative.");
    }
    this.overdraftLimit = overdraftLimit;
  }

  @Override
  public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
    if (amount > getBalance() + overdraftLimit) {
      throw new InsufficientFundsException("Withdrawal exceeds overdraft limit.");
    }
    super.withdraw(amount);
  }

  @Override
  public void toStringDetails() {
    super.toStringDetails();
    System.out.println("Overdraft Limit: " + overdraftLimit);
  }
}