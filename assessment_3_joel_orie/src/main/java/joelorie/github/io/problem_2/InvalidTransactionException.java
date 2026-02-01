package joelorie.github.io.problem_2;

public class InvalidTransactionException extends RuntimeException {
  public InvalidTransactionException(String message) {
    super(message);
  }
}
