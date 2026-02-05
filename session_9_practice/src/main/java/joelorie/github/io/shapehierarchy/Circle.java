package joelorie.github.io.shapehierarchy;

public class Circle extends Shape {
  private double radius;

  public void setRadius(double radius) {
    if (radius > 0.0) {
      this.radius = radius;
    } else {
      throw new IllegalArgumentException("he radius must be greater than zero.");
    }
  }

  public Circle(double radius, String color, boolean isFilled) {
    super(color, isFilled);
    setRadius(radius);
  }

  @Override
  public double getArea() {
    return Math.PI * this.radius * this.radius;
  }

  @Override
  public double getPerimeter() {
    return Math.PI * (this.radius * 2);
  }

  public static void main(String[] args) {
    Circle circle1 = new Circle(3.5, "White", false);
    circle1.getArea();
    circle1.getPerimeter();
    circle1.toStringDetails();
  }
}
