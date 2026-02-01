package joelorie.github.io.problem_2;

public class Main {
  public static void main(String[] args) {
    try {
      BankAccount account1 = new BankAccount("ACC001", "Alice", 20000.0);
      BankAccount account2 = new BankAccount("ACC002", "Bob", 40000.0);
      BankAccount testaccount = null;

      account1.deposit(100);
      System.out.println(account1);
      account1.withdraw(3000);
      System.out.println(account1);
      account1.transfer(testaccount, 100);
      System.out.println(account1);
      System.out.println(account2);
    } catch (InsufficientFundsException e) {
      System.out.println("Funds error: " + e.getMessage());
    } catch (AccountNotFoundException e) {
      System.out.println("Account error: " + e.getMessage());
    } catch (InvalidTransactionException e) {
      System.out.println("Transaction error: " + e.getMessage());
    } finally {
      System.out.println("Transaction processing completed.");
    }

  }
}
