package joelorie.github.io.problem_3;

public abstract class Product {
  protected final String productId;
  protected String name;
  protected double price;
  protected int stockQuantity;

  public String getProductId() {
    return this.productId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) throws InvalidProductException {
    if (name.isBlank() || name.isEmpty() || name.length() < 2) {
      throw new InvalidProductException("The name of a product must contain at least two characters.");
    }
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) throws InvalidProductException {
    if (price <= 0.0) {
      throw new InvalidProductException("The product price must be greater than zero.");
    }
    this.price = price;
  }

  public int getStockQuantity() {
    return this.stockQuantity;
  }

  public void setStockQuantity(int stockAmount) throws InvalidProductException {
    if (stockAmount <= 0) {
      throw new InvalidProductException("You must add at least one item of stock.");
    }
    this.stockQuantity = stockAmount;
  }

  public Product(String productId, String name, double price, int stockQuantity) throws InvalidProductException {
    if (productId.isBlank() || productId.isEmpty() || productId.length() < 2) {
      throw new InvalidProductException("The product Id of a product must contain at least two characters.");
    }
    this.productId = productId;
    setName(name);
    setPrice(price);
    setStockQuantity(stockQuantity);
  }

  public abstract double calculateDiscount();

  public abstract String getProductType();

  public void displayProductInfo() {
    System.out.println("========================================");
    System.out.println("ProductId: " + this.productId);
    System.out.println("Product name: " + this.name);
    System.out.println("Price: " + this.price);
    System.out.println("Price after tax: " + this.applyTax());
    System.out.println("Stock Quantity: " + this.stockQuantity);
  }

  public double applyTax() {
    return this.price + (this.price * 0.16);
    // Assuming a VAT of 16 percent
  }

  public void reduceStock(int quantity) throws OutOfStockException, InvalidProductException {
    if (quantity < 0) {
      throw new InvalidProductException("You must reduce stock by at least one item.");
    }
    if (quantity > stockQuantity) {
      throw new OutOfStockException("Stock not enough!");
    }
    this.stockQuantity -= quantity;
    System.out.println("Reducing stock.........................");
    System.out.println("Remaining stock: " + this.stockQuantity);
  }
}
