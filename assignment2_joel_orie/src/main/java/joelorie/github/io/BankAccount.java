package joelorie.github.io;

public class BankAccount {
    private final String accountNumber;
    private String accountHolder;
    protected double balance;

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

    public BankAccount(String accountNumber, String accountHolder, double initialBalance)
            throws InvalidAmountException {
        if (accountNumber == null || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Account number cannot be null or empty.");
        }
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be null or empty.");
        }
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        setAccountHolder(accountHolder);
        this.balance = initialBalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }

    public void toStringDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) throws InvalidAmountException, InsufficientFundsException {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);
        account.toStringDetails();

        account.deposit(500.0);
        System.out.println("After depositing $500:");
        account.toStringDetails();

        account.withdraw(200.0);
        System.out.println("After withdrawing $200:");
        account.toStringDetails();
    }
}
