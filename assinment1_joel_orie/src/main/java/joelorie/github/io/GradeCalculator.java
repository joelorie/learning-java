package joelorie.github.io;

public class GradeCalculator {
  public static void calculateGrade(java.util.Scanner scanner) {
    System.out.println("Enter the score (0-100): ");
    double score = getNumber(scanner);
    if (score > 100 || score < 0) {
      System.out.println("Score must be between 0 and 100.");
    }else if (score >= 90) {
      System.out.println("Grade: A");
    } else if (score >= 80) {
      System.out.println("Grade: B");
    } else if (score >= 70) {
      System.out.println("Grade: C");
    } else if (score >= 60) {
      System.out.println("Grade: D");
    } else {
      System.out.println("Grade: F");
    }
  }

  public static double getNumber(java.util.Scanner scanner) {
    while (true) {
      try {
        return Double.parseDouble(scanner.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid number:");
      }
    }
  }
}
