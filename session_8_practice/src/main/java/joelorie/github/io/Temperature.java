package joelorie.github.io;

public class Temperature {
  private double celsius;
  
  public double getCelcius() {
    return celsius;
  }

  public void setCelsius(double celsius) {
    if (celsius < -273.15) {
      throw new IllegalArgumentException("Temperature cannot be below absolute zero.");
    }
    this.celsius = celsius;
  }

  public double getFarenheit() {
    return (celsius * 9/5) + 32;
  }

  public double getKelvin() {
    return celsius + 273.15;
  }

  public double toFarenheit(double celsius) {
    return (celsius * 9/5) + 32;
  }

  public double toKelvin(double celsius) {
    return celsius + 273.15;
  }

  public Temperature(double celsius) {
    setCelsius(celsius);
  }

  public static void main(String[] args) {
    Temperature temp = new Temperature(25);
    System.out.println("Celsius: " + temp.getCelcius());
    System.out.println("Farenheit: " + temp.getFarenheit());
    System.out.println("Kelvin: " + temp.getKelvin());
  }
}
