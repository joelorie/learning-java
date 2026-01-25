package joelorie.github.io;

public class Employee {
  private String name;
  private String id;
  private double salary;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    if (name == null || name.isEmpty()) {
      throw new IllegalArgumentException("Name cannot be null or empty");
    }
    this.name = name;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    if (id == null || id.isEmpty()) {
      throw new IllegalArgumentException("ID cannot be null or empty");
    }
    this.id = id;
  }

  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    if (salary < 0) {
      throw new IllegalArgumentException("Salary cannot be negative");
    }
    this.salary = salary;
  }

  public Employee(String name, String id, double salary) {
    setName(name);
    setId(id);
    setSalary(salary);
  }

  public Employee() {
    this.name = "Unknown";
    this.id = "0000";
    this.salary = 0.0;
  }

  public double calculateBonus() {
    return this.salary * 0.05;
  }

  public void displayEmployeeInfo() {
    System.out.println("Employee Name: " + getName());
    System.out.println("Employee ID: " + getId());
    System.out.println("Employee Salary: $" + getSalary());
  }

  public static void main(String[] args) {
    Employee emp = new Employee("John Doe", "1234", 50000);
    emp.displayEmployeeInfo();
    System.out.println("Employee Bonus: $" + emp.calculateBonus());
  }

}
