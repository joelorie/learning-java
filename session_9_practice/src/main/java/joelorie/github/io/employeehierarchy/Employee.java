package joelorie.github.io.employeehierarchy;

import javax.naming.directory.InvalidAttributeValueException;

public class Employee {
  private String name;
  private final String employeeId;

  public String getName() {
    return this.name;
  }

  public void setName(String name) throws InvalidAttributeValueException {
    if (name.isBlank() || name.isEmpty() || name.length() < 2) {
      throw new InvalidAttributeValueException("The name must be at least two characters long.");
    }
    this.name = name;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public Employee(String name, String employeeId) throws InvalidAttributeValueException {
    if (employeeId.isBlank() || employeeId.isEmpty() || employeeId.length() < 2) {
      throw new InvalidAttributeValueException("The employee Id must be at least two characters long.");
    }
    this.employeeId = employeeId;
    setName(name);
  }

  public void displayDetails() {
    System.out.println("=== Employee Details ===");
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee Id: " + this.employeeId);
  }

}
