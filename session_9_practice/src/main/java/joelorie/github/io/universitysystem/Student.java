package joelorie.github.io.universitysystem;

import javax.naming.directory.InvalidAttributeValueException;

public class Student extends UniversityPerson {
  private String major;
  private double gpa;

  public String getMajor() {
    return this.major;
  }

  public void setMajor(String major) throws InvalidAttributeValueException {
    if (major.length() < 2 || major.isEmpty()) {
      throw new InvalidAttributeValueException("The major must be at least two characters.");
    }
    this.major = major;
  }

  public double getGpa() {
    return this.gpa;
  }

  public void setGpa(double gpa) throws InvalidAttributeValueException {
    if (gpa < 0.0 || gpa > 4.0) {
      throw new InvalidAttributeValueException("The gpa must be between 0.0 and 4.0");
    }
    this.gpa = gpa;
  }

  public Student(String id, String name, String email, String major, double gpa)
      throws javax.management.InvalidAttributeValueException, InvalidAttributeValueException {
    super(id, name, email);
    setMajor(major);
    setGpa(gpa);
  }

  @Override
  public String toString() {
    return super.toString() +
        "\nMajor: " + this.major +
        "\nGPA: " + this.gpa;
  }

  public static void main(String[] args) throws javax.management.InvalidAttributeValueException, InvalidAttributeValueException {
    Student student = new Student("adard8324", "John Doe", "johndoe@gmail.com", "Computer Science", 4.0);
    System.out.println(student);
  }
}
