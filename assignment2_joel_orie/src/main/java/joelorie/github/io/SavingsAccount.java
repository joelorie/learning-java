package joelorie.github.io;

public class SavingsAccount extends BankAccount {
  private double interestRate;
  private static final double MIN_BALANCE = 100.0;

  public double getInterestRate() {
    return interestRate;
  }

  public SavingsAccount(String accountNumber, String accountHolder, double initialBalance, double interestRate) throws InvalidAmountException {
    super(accountNumber, accountHolder, initialBalance);
    if (initialBalance < MIN_BALANCE) {
      throw new IllegalArgumentException("Initial balance for SavingsAccount must be at least 100.");
    }
    if (interestRate < 0) {
      throw new IllegalArgumentException("Interest rate cannot be negative.");
    }
    this.interestRate = interestRate;
  }
  
  public void applyInterest() throws InvalidAmountException {
    double interest = getBalance() * interestRate / 100;
    deposit(interest);
  }

  @Override
  public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
    if (amount > getBalance() - MIN_BALANCE) {
      throw new InvalidAmountException("Cannot withdraw beyond the minimum balance of 100.");
    }
    super.withdraw(amount);
  }
}
