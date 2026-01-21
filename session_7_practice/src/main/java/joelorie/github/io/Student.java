package joelorie.github.io;

public class Student {
  public String name;
  public String id;
  public int[] grades;
  public double gpa;

  public Student() {
    this.name = "Unknown";
    this.id = "0000";
    this.grades = new int[0];
    this.gpa = 0.0;
  }

  public Student(String name, String id, int[] grades) {
    this.name = name;
    this.id = id;
    this.grades = grades;
    this.gpa = calculateGPA();
  }

  public Student(String name, String id) {
    this.name = name;
    this.id = id;
    this.grades = new int[0];
    this.gpa = 0.0;
  }

  public double calculateGPA() {
    if (grades.length == 0) {
      return 0.0;
    }
    int total = 0;
    for (int grade : grades) {
      total += grade;
    }
    return (double) total / grades.length / 20;
  }

  public void displayInfo() {
    System.out.printf("Name: %s%nID: %s%nGPA: %.2f%n", name, id, gpa);
  }

  public void addGrade(int grade) {
    int[] newGrades = new int[this.grades.length + 1];
    System.arraycopy(this.grades, 0, newGrades, 0, this.grades.length);
    newGrades[this.grades.length] = grade;
    this.grades = newGrades;
    this.gpa = calculateGPA();
  }
}
