package joelorie.github.io.problem_3;

public class Electronics extends Product {
  private String warrantyPeriod;
  private String powerConsumption;

  public String getWarrantyPeriod() {
    return this.warrantyPeriod;
  }

  public void setWarrantyPeriod(String warrantyPeriod) throws InvalidProductException {
    if (warrantyPeriod.isBlank() || warrantyPeriod.isEmpty() || warrantyPeriod.length() < 2) {
      throw new InvalidProductException("The warranty period of a product must contain at least two characters.");
    }
    this.warrantyPeriod = warrantyPeriod;
  }

  public String getPowerConsumption() {
    return this.powerConsumption;
  }

  public void setPowerConsumption(String powerConsumption) throws InvalidProductException {
    if (powerConsumption.isBlank() || powerConsumption.isEmpty() || powerConsumption.length() < 2) {
      throw new InvalidProductException(
          "The power consumption of an electronic gadget must contain at least two characters.");
    }
    this.powerConsumption = powerConsumption;
  }

  public String getProductType() {
    return "Electronic Gadget";
  }

  public double calculateDiscount() {
    return 0.10;
    // 10 perecent discount on electronics
  }

  @Override
  public void displayProductInfo() {
    super.displayProductInfo();
    System.out.println("Warranty Period: " + this.warrantyPeriod);
    System.out.println("Power Consumption: " + this.powerConsumption);
    System.out.println(getProductType());
  }

  public Electronics(String productId, String name, double price, int stockQuantity, String warrantyPeriod,
      String powerConsumption) throws InvalidProductException {
    super(productId, name, price, stockQuantity);
    setWarrantyPeriod(warrantyPeriod);
    setPowerConsumption(powerConsumption);
  }
}
