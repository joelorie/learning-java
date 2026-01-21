package joelorie.github.io;

public class StudentGradeCalculator {
  public static void main(java.util.Scanner scanner) {
    System.out.println("Welcome to the Student Grade Calculator!");
    System.out.println("Enter the number of grades to process:");
    int numberOfGrades = App.getNumber(scanner);
    int[] grades = new int[numberOfGrades];
    System.out.println("Enter grades:");
    for (int i = 0; i < numberOfGrades; i++) {
      grades[i] = App.getNumber(scanner);
    }

    System.out.println("Select an option: ");
    System.out.println("1. Calculate Average Grade");
    System.out.println("2. Find Highest Grade");
    System.out.println("3. Find Lowest Grade");
    System.out.println("4. Get Grade Letter Score");
    System.out.println("5. Print Grade Report");
    int choice = scanner.nextInt();
    scanner.nextLine();
    switch (choice) {
      case 1 -> calculateAverageGrade(scanner, grades);
      case 2 -> findHighestGrade(scanner, grades);
      case 3 -> findLowestGrade(scanner, grades);
      case 4 -> getGradeLetterScore(scanner, grades);
      case 5 -> printGradeReport(scanner, grades);
      default -> System.out.println("Invalid choice. Please select a valid option.");
    }
  }

  public static void calculateAverageGrade(java.util.Scanner scanner, int[] grades) {
    double sum = 0;
    for (int grade : grades) {
      sum += grade;
    }
    double average = sum / grades.length;
    System.out.println("Average Grade: " + average);
  }

  public static void findHighestGrade(java.util.Scanner scanner, int[] grades) {
    int highest = grades[0];
    for (int grade : grades) {
      if (grade > highest) {
        highest = grade;
      }
    }
    System.out.println("Highest Grade: " + highest);
  }

  public static void findLowestGrade(java.util.Scanner scanner, int[] grades) {
    int lowest = grades[0];
    for (int grade : grades) {
      if (grade < lowest) {
        lowest = grade;
      }
    }
    System.out.println("Lowest Grade: " + lowest);
  }

  public static void getGradeLetterScore(java.util.Scanner scanner, int[] grades) {
    System.out.println("Grade Letter Scores:");
    for (int grade : grades) {
      String letter;
      if (grade >= 90) {
        letter = "A";
      } else if (grade >= 80) {
        letter = "B";
      } else if (grade >= 70) {
        letter = "C";
      } else if (grade >= 60) {
        letter = "D";
      } else {
        letter = "F";
      }
      System.out.println("Grade: " + grade + " - Letter: " + letter);
    }
  }

  public static void printGradeReport(java.util.Scanner scanner, int[] grades) {
    System.out.println("Enter student name: ");
    String studentName = scanner.nextLine();
    System.out.println("Grade Report:");
    System.out.println("Student Name: " + studentName);
    System.out.println("Grades:");
    for (int grade : grades) {
      System.out.println("Grade: " + grade);
    }
    calculateAverageGrade(scanner, grades);
    findHighestGrade(scanner, grades);
    findLowestGrade(scanner, grades);
  }

}
