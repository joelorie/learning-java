package joelorie.github.io.shape_hierarchy;

public class Shape {
    private String color;
    private boolean filled;

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void toStringDetails() {
        System.out.println("Shape Color: " + this.color);
        System.out.println("Shape Area: " + getArea());
        System.out.println("Shape Perimeer: " + getPerimeter());
        System.out.println("The shape is " + (this.filled ? "filled" : "not filled"));
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
