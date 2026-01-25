package joelorie.github.io;

public class ScientificCalculator extends Calculator {
  public static void main(String[] args) {
    ScientificCalculator sciCalc = new ScientificCalculator();
    System.out.println("Scientific Integer Addition: " + sciCalc.add(10, 20));
    System.out.println("Power: " + sciCalc.power(2, 3));
    System.out.println("Square Root: " + sciCalc.squareRoot(16.0));
  }
  @Override
  public int add(int a, int b) {
    System.out.println("Performing scientific addition for integers.");
    return super.add(a, b);
  }

  public int power(int base, int exponent) {
    return (int) Math.pow(base, exponent);
  }

  public double squareRoot(double num) {
    return Math.sqrt(num);
  }
}
