package joelorie.github.io.problem_1;

import javax.naming.directory.InvalidAttributeValueException;

public class LibraryItem {
  private final String itemId;
  private String title;
  private String author;
  private boolean isAvailable;

  public String getItemId() {
    return this.itemId;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) throws InvalidAttributeValueException {
    if (title.length() < 2 || title.isEmpty()) {
      throw new InvalidAttributeValueException("The title must be at least two characters long!");
    }
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) throws InvalidAttributeValueException {
    if (author.length() < 2 || author.isEmpty()) {
      throw new InvalidAttributeValueException("The author must be at least two characters long!");
    }
    this.author = author;
  }

  public boolean isAvailable() {
    return this.isAvailable;
  }

  public LibraryItem(String itemId, String title, String author) throws InvalidAttributeValueException {
    if (itemId.length() < 2 || itemId.isEmpty()) {
      throw new InvalidAttributeValueException("The ItemId must be at least two characters long!");
    }
    this.itemId = itemId;
    setTitle(title);
    setAuthor(author);
    this.isAvailable = true;
  }

  public void checkout() {
    if (this.isAvailable) {
      this.isAvailable = false;
      System.out.println("Checkout of item successful!");
    } else {
      System.out.println("Checkout failed. Item unavailable.");
    }
  }

  public void returnItem() {
    if (!this.isAvailable) {
      this.isAvailable = true;
      System.out.println("Item returned successfully!");
    } else {
      System.out.println("Item was not borrowed hence cannot be returned!");
    }
  }

  public void displayDetails() {
    System.out.println("Item Id: " + this.itemId);
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("This item is " + (isAvailable ? "available." : "unavailable."));
  }
}
