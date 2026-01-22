package joelorie.github.io;

import java.time.LocalDate;

public class Book {
  private final String isbn;
  private String title;
  private String author;
  private boolean isAvailable;
  private LocalDate dueDate;

  public String getIsbn() {
    return isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    if (title == null || title.isBlank()) {
      throw new IllegalArgumentException("Title cannot be null or blank");
    }
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    if (author == null || author.isBlank()) {
      throw new IllegalArgumentException("Author cannot be null or blank");
    }
    this.author = author;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public LocalDate getDueDate() {
    return dueDate;
  }

  public void borrowBook(LocalDate dueDate) {
    if (!isAvailable) {
      throw new IllegalStateException("Book is already borrowed");
    }
    if (dueDate == null || dueDate.isBefore(LocalDate.now())) {
      throw new IllegalArgumentException("Due date must be a future date");
    }
    this.isAvailable = false;
    this.dueDate = dueDate;
  }

  public void returnBook() {
    if (isAvailable) {
      throw new IllegalStateException("Book is not borrowed");
    }
    this.isAvailable = true;
    this.dueDate = null;
  }

  public boolean isOverdue() {
    if (isAvailable || dueDate == null) {
      return false;
    }
    return LocalDate.now().isAfter(dueDate);
  }

  public Book(String isbn, String title, String author) {
    if (isbn == null || isbn.isBlank() || isbn.length() != 13) {
      throw new IllegalArgumentException("ISBN cannot be null or blank");
    }
    this.isbn = isbn;
    setTitle(title);
    setAuthor(author);
    this.isAvailable = true;
    this.dueDate = null;
  }

  public static void main(String[] args) {
    Book book = new Book("9780134685991", "Effective Java", "Joshua Bloch");
    System.out.println("Book created: " + book.getTitle() + " by " + book.getAuthor());
    book.borrowBook(LocalDate.now().plusDays(14));
    System.out.println("Book borrowed, due on: " + book.getDueDate());
    System.out.println("Is book overdue? " + book.isOverdue());
    book.returnBook();
    System.out.println("Book returned. Is book available? " + book.isAvailable());
  }
}
