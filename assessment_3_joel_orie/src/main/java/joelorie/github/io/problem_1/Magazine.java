package joelorie.github.io.problem_1;

import java.time.LocalDate;

import javax.management.InvalidAttributeValueException;

public class Magazine extends LibraryItem {
  private int issueNumber;
  private LocalDate publicationDate;

  public int getIssueNumber() {
    return this.issueNumber;
  }

  public void setIssueNumber(int issueNumber) throws InvalidAttributeValueException {
    if (issueNumber <= 0) {
      throw new InvalidAttributeValueException("The issue number must be greater than zero.");
    }
    this.issueNumber = issueNumber;
  }

  public LocalDate getPublicationDate() {
    return this.publicationDate;
  }

  public void setPublicationDate(String date) {
    try {
      LocalDate parsedDate = LocalDate.parse(date);
      this.publicationDate = parsedDate;
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  @Override
  public void checkout() {
    System.out.println("Attempting to checkout a Magazine...");
    super.checkout();
  }

  @Override
  public void returnItem() {
    System.out.println("Attempting to return a Magazine...");
    super.returnItem();
  }

  @Override
  public void displayDetails() {
    System.out.println("=== Magazine Details ===");
    super.displayDetails();
    System.out.println("IssueNumber: " + this.issueNumber);
    System.out.println("Publication Date; " + this.publicationDate);
  }

  public Magazine(String itemId, String title, String author, int issueNumber, String publicationDate)
      throws InvalidAttributeValueException, javax.naming.directory.InvalidAttributeValueException {
    super(itemId, title, author);
    setIssueNumber(issueNumber);
    setPublicationDate(publicationDate);
  }
}
