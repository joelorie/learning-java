package joelorie.github.io;

public class StringProcessor {
  private StringProcessor() {
  }

  public static String lowerCase(String input) {
    return input.toLowerCase();
  }

  public static String upperCase(String input) {
    return input.toUpperCase();
  }

  public static String removeWhiteSpace(String input) {
    return input.trim();
  }

  public static String capitalize(String input) {
    if (input == null || input.isEmpty()) {
      return input;
    }
    return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
  }

  public static String concatenate(String str1, String str2) {
    return str1 + str2;
  }
}
