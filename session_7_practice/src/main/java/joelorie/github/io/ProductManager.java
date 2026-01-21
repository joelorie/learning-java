package joelorie.github.io;

public class ProductManager {
  public static void main(String[] args) {
    Product product1 = new Product("Laptop", "P001", 999.99, 10);
    Product product2 = new Product("Smartphone", "P002");
    product2.setPrice(499.99);
    product2.addStock(20);

    product1.displayProductInfo();
    System.out.println();
    product2.displayProductInfo();

    System.out.println("\nSelling 5 units of Laptop...");
    product1.sellStock(5);
    product1.displayProductInfo();
  }
}
