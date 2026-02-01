package joelorie.github.io.problem_3;

public class Books extends Product {
  private String author;
  private String publisher;
  private final String isbn;

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) throws InvalidProductException {
    if (author.isBlank() || author.isEmpty() || author.length() < 2) {
      throw new InvalidProductException("The author period of a book must contain at least two characters.");
    }
    this.author = author;
  }

  public String getPublisher() {
    return this.publisher;
  }

  public void setPublisher(String publisher) throws InvalidProductException {
    if (publisher.isBlank() || publisher.isEmpty() || publisher.length() < 2) {
      throw new InvalidProductException("The publisher of a book must contain at least two characters.");
    }
    this.publisher = publisher;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public Books(String productId, String name, double price, int stockQuantity, String author, String publisher,
      String isbn) throws InvalidProductException {
    super(productId, name, price, stockQuantity);
    if (isbn.isBlank() || isbn.isEmpty() || isbn.length() < 13) {
      throw new InvalidProductException(
          "The isbn number period of a product must contain at least thirteen characters.");
    }
    this.isbn = isbn;
    setAuthor(author);
    setPublisher(publisher);
  }

  @Override
  public void displayProductInfo() {
    super.displayProductInfo();
    System.out.println("Author: " + this.author);
    System.out.println("Publisher: " + this.publisher);
    System.out.println("ISBN: " + this.isbn);
    System.out.println(getProductType());
  }

  public String getProductType() {
    return "This is a book.";
  }

  public double calculateDiscount() {
    return 0.2;
    // 20 percent discount on all books.
  }
}
