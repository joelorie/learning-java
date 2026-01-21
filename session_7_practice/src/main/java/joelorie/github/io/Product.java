package joelorie.github.io;

public class Product {
  public String name;
  public String id;
  public double price;
  public int quantity;

  public Product(String name, String id, double price, int quantity) {
    this.name = name;
    this.id = id;
    this.price = price;
    this.quantity = quantity;
  }

  public Product() {
    this.name = "";
    this.id = "";
    this.price = 0.0;
    this.quantity = 0;
  }

  public Product(String name, String id) {
    this.name = name;
    this.id = id;
    this.price = 0.0;
    this.quantity = 0;
  }

  public double getInventoryValue() {
    return this.price * this.quantity;
  }

  public int addStock(int amount) {
    this.quantity += amount;
    return this.quantity;
  }

  public int sellStock(int amount) {
    if (amount > this.quantity) {
      amount = this.quantity;
    }
    this.quantity -= amount;
    return this.quantity;
  }

  public void displayProductInfo() {
    System.out.println("Product Name: " + this.name);
    System.out.println("Product ID: " + this.id);
    System.out.println("Price: $" + this.price);
    System.out.println("Quantity in Stock: " + this.quantity);
    System.out.println("Total Inventory Value: $" + getInventoryValue());
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
