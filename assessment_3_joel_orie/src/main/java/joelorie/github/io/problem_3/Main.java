package joelorie.github.io.problem_3;

public class Main {
  public static void main(String[] args) {
    try {
      Product laptop = new Electronics("E001", "Laptop", 57999.0, 95, "2 years", "150W");
      laptop.displayProductInfo();
      laptop.reduceStock(90);
      laptop.displayProductInfo();
    } catch (InvalidProductException | OutOfStockException e) {
      System.out.println(e.getMessage());
    }
  }
}
