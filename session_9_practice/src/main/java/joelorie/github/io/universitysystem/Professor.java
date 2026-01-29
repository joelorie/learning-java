package joelorie.github.io.universitysystem;

import javax.naming.directory.InvalidAttributeValueException;

public class Professor extends UniversityPerson {
  private String department;
  private double salary;

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) throws InvalidAttributeValueException {
    if (department.length() < 2 || department.isEmpty()) {
      throw new InvalidAttributeValueException("The department must be at least two characters.");
    }
    this.department = department;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) throws InvalidAttributeValueException {
    if (salary < 0.0) {
      throw new InvalidAttributeValueException("The salary must be above 0.0");
    }
    this.salary = salary;
  }

  public Professor(String id, String name, String email, String department, double salary)
      throws javax.management.InvalidAttributeValueException, InvalidAttributeValueException {
    super(id, name, email);
    setDepartment(department);
    setSalary(salary);
  }

  @Override
  public String toString() {
    return super.toString() +
        "\nDepartment: " + this.department +
        "\nSalary: " + this.salary + "/=";
  }

  public static void main(String[] args) throws javax.management.InvalidAttributeValueException, InvalidAttributeValueException {
    Professor professor = new Professor("abcdefg", "Prof Joe", "joeprof@gmail.com", "Chemistry", 900000.0);
    System.out.println(professor);
  }
}
