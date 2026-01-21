package joelorie.github.io;

public class Rectangle {
  public double length;
  public double width;

  public Rectangle() {
    this.length = 1.0;
    this.width = 1.0;
  }

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  public Rectangle(double sideLength) {
    this.length = sideLength;
    this.width = sideLength;
  }

  public double calculateArea() {
    return this.length * this.width;
  }

  public double calculatePerimeter() {
    return 2 * (this.length + this.width);
  }

  public boolean isSquare() {
    return this.length == this.width;
  }

  public void displayProperties() {
    System.out.printf("Length: %.2f%nWidth: %.2f%nArea: %.2f%nPerimeter: %.2f%nIs Square: %b%n",
        this.length, this.width, calculateArea(), calculatePerimeter(), isSquare());
  }

  
}
