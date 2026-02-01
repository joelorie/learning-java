package joelorie.github.io.problem_1;

import javax.naming.directory.InvalidAttributeValueException;

public class Book extends LibraryItem {
  private final String isbn;
  private String genre;

  public String getIsbn() {
    return this.isbn;
  }

  public String getGenre() {
    return this.genre;
  }

  public void setGenre(String genre) throws InvalidAttributeValueException {
    if (genre.length() < 2 || genre.isEmpty()) {
      throw new InvalidAttributeValueException("The genre must be at least two characters long!");
    }
    this.genre = genre;
  }

  @Override
  public void checkout() {
    System.out.println("Attempting to checkout a book...");
    super.checkout();
  }

  @Override
  public void returnItem() {
    System.out.println("Attempting to return a book...");
    super.returnItem();
  }

  @Override
  public void displayDetails() {
    System.out.println("=== Book Details ===");
    super.displayDetails();
    System.out.println("ISBN: " + this.isbn);
    System.out.println("Genre; " + this.genre);
  }

  public Book(String itemId, String title, String author, String isbn, String genre) throws InvalidAttributeValueException {
    super(itemId, title, author);
        if (isbn.length() < 13 || genre.isEmpty()) {
      throw new InvalidAttributeValueException("The genre must be at least two characters long!");
    }
    this.isbn = isbn;
    setGenre(genre);
  }
}
