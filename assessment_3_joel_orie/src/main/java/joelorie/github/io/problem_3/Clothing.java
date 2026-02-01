package joelorie.github.io.problem_3;

public class Clothing extends Product {
  private String size;
  private String material;
  private String color;

  public String getSize() {
    return this.size;
  }

  public void setSize(String size) throws InvalidProductException {
    if (size.isBlank() || size.isEmpty() || size.length() < 2) {
      throw new InvalidProductException("The size of a product must contain at least two characters.");
    }
    this.size = size;
  }

  public String getMaterial() {
    return this.material;
  }

  public void setMaterial(String material) throws InvalidProductException {
    if (material.isBlank() || material.isEmpty() || material.length() < 2) {
      throw new InvalidProductException("The material period of a product must contain at least two characters.");
    }
    this.material = material;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) throws InvalidProductException {
    if (color.isBlank() || color.isEmpty() || color.length() < 2) {
      throw new InvalidProductException("The color of a product must contain at least two characters.");
    }
    this.color = color;
  }

  public String getProductType() {
    return "This is a clothing item.";
  }

  public double calculateDiscount() {
    return 0.09;
    // 9 percent disccount on all clothing items
  }

  @Override
  public void displayProductInfo() {
    super.displayProductInfo();
    System.out.println("Size: " + this.size);
    System.out.println("Material: " + this.material);
    System.out.println("Color: " + this.color);
    System.out.println(getProductType());
  }

  public Clothing(String productId, String name, double price, int stockQuantity, String size, String material,
      String color) throws InvalidProductException {
    super(productId, name, price, stockQuantity);
    setSize(size);
    setMaterial(material);
    setColor(color);
  }
}
