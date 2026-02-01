package joelorie.github.io.problem_2;

public class BankAccount {
  private final String accountNumber;
  private String accountHolder;
  private double balance;

  public String getAccountNumber() {
    return this.accountNumber;
  }

  public String getAccountHolder() {
    return this.accountHolder;
  }

  public void setAccountHolder(String accountHolder) throws InvalidTransactionException {
    if (accountHolder.isEmpty() || accountHolder.length() < 2) {
      throw new InvalidTransactionException("The account holder's name must at least contain 2 characters!");
    }
    this.accountHolder = accountHolder;
  }

  public double getBalance() {
    return this.balance;
  }

  public void setBalance(double balance) throws InvalidTransactionException {
    if (balance < 0.0) {
      throw new InvalidTransactionException("The balance must be greater than zero!");
    }
    this.balance = balance;
  }

  public void deposit(double depositAmount) throws InvalidTransactionException {
    if (depositAmount < 0.0) {
      throw new InvalidTransactionException("The deposit amount must be greater than zero!");
    }
    setBalance(this.balance + depositAmount);
  }

  public void withdraw(double withdrawalAmount) throws InsufficientFundsException {
    if (withdrawalAmount > this.balance) {
      throw new InsufficientFundsException("The withdrawal amount cannot be greater than your balance!");
    }
    setBalance(this.balance - withdrawalAmount);
  }

  public void transfer(BankAccount account, double transferAmount)
      throws InvalidTransactionException, InsufficientFundsException, AccountNotFoundException {
    if (account == null) {
      throw new AccountNotFoundException("The account is not found!");
    }
    if (transferAmount <= 0) {
      throw new InvalidTransactionException("Transfer amount must be greater than zero.");
    }
    this.withdraw(transferAmount);
    account.deposit(transferAmount);
  }

  @Override
  public String toString() {
    return this.accountHolder + "'s balance is " + this.balance;
  }

  public BankAccount(String accountNumber, String accountHolder, double balance) throws InvalidTransactionException {
    if (accountNumber.isEmpty() || accountNumber.length() < 5) {
      throw new InvalidTransactionException("The account number must at least 5 characters long!");
    }
    this.accountNumber = accountNumber;
    setAccountHolder(accountHolder);
    setBalance(balance);
  }
}
