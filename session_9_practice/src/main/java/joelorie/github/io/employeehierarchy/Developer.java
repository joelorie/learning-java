package joelorie.github.io.employeehierarchy;

import javax.naming.directory.InvalidAttributeValueException;

public class Developer extends Employee {
  private double salary;
  private String language;

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) throws InvalidAttributeValueException {
    if (salary < 0.0) {
      throw new InvalidAttributeValueException("The salary must be greater than zero.");
    }
    this.salary = salary;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) throws InvalidAttributeValueException {
    if (language.isBlank() || language.isEmpty() || language.length() < 2) {
      throw new InvalidAttributeValueException("The progamming language must be at least two characters long.");
    }
    this.language = language;
  }

  public Developer(String name, String employeeId, double salary, String language)
      throws InvalidAttributeValueException {
    super(name, employeeId);
    setLanguage(language);
    setSalary(salary);
  }

  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Progamming Language: " + this.language);
    System.out.println("Salary: " + this.salary);
  }
}
