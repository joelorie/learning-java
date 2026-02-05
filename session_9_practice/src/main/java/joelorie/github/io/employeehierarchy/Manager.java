package joelorie.github.io.employeehierarchy;

import javax.naming.directory.InvalidAttributeValueException;

public class Manager extends Employee {
  private double salary;
  private String department;

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) throws InvalidAttributeValueException {
    if (salary < 0.0) {
      throw new InvalidAttributeValueException("The salary must be greater than zero.");
    }
    this.salary = salary;
  }

  public String getDepartment() {
    return this.department;
  }

  public void setDepartment(String department) throws InvalidAttributeValueException {
    if (department.isBlank() || department.isEmpty() || department.length() < 2) {
      throw new InvalidAttributeValueException("The employee Id must be at least two characters long.");
    }
    this.department = department;
  }

  public Manager(String name, String employeeId, double salary, String department)
      throws InvalidAttributeValueException {
    super(name, employeeId);
    setDepartment(department);
    setSalary(salary);
  }

  @Override 
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Salary: " + this.salary + " shillings");
    System.out.println("Department: " + this.department);
  }
}
