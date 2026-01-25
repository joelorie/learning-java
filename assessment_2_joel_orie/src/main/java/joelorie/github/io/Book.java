package joelorie.github.io;

public class Book {
  private String title;
  private String author;
  private String isbn;
  private double price;
  private boolean isAvailable;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    if (title != null && !title.isEmpty()) {
      this.title = title;
    } else {
      throw new IllegalArgumentException("Title cannot be null or empty");
    }
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    if (author != null && !author.isEmpty()) {
      this.author = author;
    } else {
      throw new IllegalArgumentException("Author cannot be null or empty");
    }
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    if (isbn != null && !isbn.isEmpty() && isbn.length() == 13) {
      this.isbn = isbn;
    } else {
      throw new IllegalArgumentException("ISBN cannot be null or empty");
    }
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    if (price >= 0) {
      this.price = price;
    } else {
      throw new IllegalArgumentException("Price cannot be negative");
    }
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public Book() {
    this.title = "Unknown";
    this.author = "Unknown";
    this.isbn = "0000000000000";
    this.price = 0.0;
    this.isAvailable = true;
  }

  public Book(String title, String author, String isbn, double price, boolean isAvailable) {
    setTitle(title);
    setAuthor(author);
    setIsbn(isbn);
    setPrice(price);
    this.isAvailable = isAvailable;
  }

  public String toString() {
    return "Title: " + getTitle() + "\n" +
        "Author: " + getAuthor() + "\n" +
        "ISBN: " + getIsbn() + "\n" +
        "Price: $" + getPrice() + "\n" +
        "Available: " + (isAvailable() ? "Yes" : "No");
  }

  public void borrowBook() {
    if (isAvailable) {
      isAvailable = false;
    } else {
      throw new IllegalStateException("Book is already borrowed");
    }
  }

  public void returnBook() {
    isAvailable = true;
  }

  public static void main(String[] args) {
    Book book = new Book("1984", "George Orwell", "1234567890123", 9.99, true);
    System.out.println(book.toString());
    book.borrowBook();
    System.out.println("After borrowing the book:");
    System.out.println(book.toString());
    book.returnBook();
    System.out.println("After returning the book:");
    System.out.println(book.toString());
  }

}
