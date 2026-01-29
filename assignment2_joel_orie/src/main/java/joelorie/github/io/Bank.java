package joelorie.github.io;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<BankAccount> accounts;

  public Bank() {
    accounts = new ArrayList<>();
  }

  public void addAccount(BankAccount account) {
    for (BankAccount acc : accounts) {
      if (account.getAccountNumber().equals(acc.getAccountNumber())) {
        throw new IllegalArgumentException("Account number must be unique!");
      }
    }
    accounts.add(account);
  }

  public BankAccount findAccount(String accountNumber) {
    for (BankAccount account : accounts) {
      if (account.getAccountNumber().equals(accountNumber)) {
        return account;
      }
    }
    throw new IllegalArgumentException("Accound number not found");
  }

  public void displyAccounts() {
    if (accounts.isEmpty()) {
      System.out.println("No accounts available.");
      return;
    }
    for (BankAccount acc : accounts) {
      acc.toStringDetails();
      System.out.println("===");
    }
  }
}
