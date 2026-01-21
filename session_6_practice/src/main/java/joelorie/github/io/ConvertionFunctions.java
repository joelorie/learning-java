package joelorie.github.io;

public class ConvertionFunctions {
  public static int celciusToFarenheit(java.util.Scanner scanner) {
    System.out.println("Enter temperature in Celcius:");
    int celcius = scanner.nextInt();
    int farenheit = (celcius * 9 / 5) + 32;
    System.out.println(celcius + "°C is " + farenheit + "°F");
    return farenheit;
  }

  public static double celciusToFarenheit(java.util.Scanner scanner, int decimalPlaces) {
    System.out.println("Enter temperature in Celcius:");
    int celcius = scanner.nextInt();
    double farenheit = (celcius * 9.0 / 5.0) + 32;
    System.out.println(celcius + "°C is " + String.format("%." + decimalPlaces + "f", farenheit) + "°F");
    return farenheit;
  }

  public static int farenheitToCelcius(java.util.Scanner scanner) {
    System.out.println("Enter temperature in Fahrenheit:");
    int farenheit = scanner.nextInt();
    int celcius = (farenheit - 32) * 5 / 9;
    System.out.println(farenheit + "°F is " + celcius + "°C");
    return celcius;
  }

  public static double farenheitToCelcius(java.util.Scanner scanner, int decimalPlaces) {
    System.out.println("Enter temperature in Fahrenheit:");
    int farenheit = scanner.nextInt();
    double celcius = (farenheit - 32) * 5.0 / 9.0;
    System.out.println(farenheit + "°F is " + String.format("%." + decimalPlaces + "f", celcius) + "°C");
    return celcius;
  }

  public static void printConversionTable() {
    System.out.println("Celsius to Fahrenheit Conversion Table:");
    System.out.println("Celsius\tFahrenheit");
    for (int c = 0; c <= 100; c += 10) {
      int f = (c * 9 / 5) + 32;
      System.out.println(c + "\t" + f);
    }
    System.out.println("\nFahrenheit to Celsius Conversion Table:");
    System.out.println("Fahrenheit\tCelsius");
    for (int f = 32; f <= 212; f += 10) {
      int c = (f - 32) * 5 / 9;
      System.out.println(f + "\t\t" + c);
    }
  }
}
