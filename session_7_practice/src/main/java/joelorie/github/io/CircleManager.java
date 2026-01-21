package joelorie.github.io;

public class CircleManager {
  public static void main(String[] args) {
    Circle c1 = new Circle(5.0);
    Circle c2 = new Circle();

    System.out.printf("Area of circle 1: %.2f%n", Circle.computeArea(c1.radius));
    System.out.printf("Circumference of circle 1: %.2f%n", Circle.computeCircumference(c1.radius));
    System.out.printf("Area of circle 2: %.2f%n", Circle.computeArea(c2.radius));
    System.out.printf("Circumference of circle 2: %.2f%n", Circle.computeCircumference(c2.radius));
  }
}
