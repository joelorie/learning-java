package joelorie.github.io;

public class StudentManager {
  public static void main(String[] args) {
    Student s1 = new Student("Alice", "S001");
    Student s2 = new Student("John", "S002");

    s1.addGrade(90);
    s2.addGrade(85);

    s1.displayInfo();
    s2.displayInfo();
  }
}
