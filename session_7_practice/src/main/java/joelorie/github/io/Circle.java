package joelorie.github.io;

public class Circle {
  public double radius;

  public Circle() {
    this.radius = 1.0;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public static double computeArea(double radius) {
    return Math.PI * radius * radius;
  }

  public static double computeCircumference(double radius) {
    return 2 * Math.PI * radius;
  }
}
