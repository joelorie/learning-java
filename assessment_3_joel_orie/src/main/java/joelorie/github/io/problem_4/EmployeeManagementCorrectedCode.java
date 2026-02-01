package joelorie.github.io.problem_4;

import javax.management.InvalidAttributeValueException;

public class EmployeeManagementCorrectedCode {
  public static String companyName;
  private String employeeName;
  private double salary;

  public String getEmployeeName() {
    return this.employeeName;
  }

  public void setEmployeeName(String name) throws InvalidAttributeValueException {
    if (name.isEmpty() || name.length() < 2) {
      throw new InvalidAttributeValueException("The name should be at least two characters!");
    }
    this.employeeName = name;
  }

  public EmployeeManagementCorrectedCode(String name, double salary) throws InvalidAttributeValueException {
    setEmployeeName(name);
    setSalary(salary);
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) throws InvalidAttributeValueException {
    if (salary <= 0) {
      throw new InvalidAttributeValueException("The salary must be greater than zero!");
    }
    this.salary = salary;
  }

  public double calculateBonus() {
    return this.salary * 0.1;
  }

  public static void main(String[] args) {
    try {
      EmployeeManagementCorrectedCode frank = new EmployeeManagementCorrectedCode("Frank John", 200000.00);
      System.out.println("Employee name: " + frank.getEmployeeName());
      System.out.println("Employee salary: " + frank.getSalary());
      System.out.println("Employee bonus: " + frank.calculateBonus());
    } catch (InvalidAttributeValueException e) {
      System.out.println(e.getMessage());
    }
  }
}
