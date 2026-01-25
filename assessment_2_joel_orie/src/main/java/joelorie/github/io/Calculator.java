package joelorie.github.io;

public class Calculator {
  public static void main(String[] args) {
    Calculator calc = new Calculator();
    System.out.println("Integer Addition: " + calc.add(5, 3));
    System.out.println("Double Addition: " + calc.add(5.5, 3.3));
    System.out.println("Three Integer Addition: " + calc.add(1, 2, 3));
    System.out.println("String Concatenation: " + calc.add("Hello, ", "World!"));
  }

  public int add(int a, int b) {
    return a + b;
  }

  public double add(double a, double b) {
    return a + b;
  }

  public int add(int a, int b, int c) {
    return a + b + c;
  }

  public String add(String a, String b) {
    return a + b;
  }
}
