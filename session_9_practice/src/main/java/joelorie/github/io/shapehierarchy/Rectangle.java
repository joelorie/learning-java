package joelorie.github.io.shapehierarchy;

public class Rectangle extends Shape {
  private double length;
  private double width;

  public void setParameters(double length, double width) {
    if (length > 0.0 && width > 0.0) {
      this.length = length;
      this.width = width;
    } else {
      throw new IllegalArgumentException("he length and width must be greater than zero.");
    }
  }

  public Rectangle(double length, double width, String color, boolean isFilled) {
    super(color, isFilled);
    setParameters(length, width);
  }

  @Override
  public double getArea() {
    return this.length * this.width;
  }

  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }

  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(5.0, 2.0, "Blue", true);
    rect1.getArea();
    rect1.getPerimeter();
    rect1.toStringDetails();
  }
}
