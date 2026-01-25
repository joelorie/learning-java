package joelorie.github.io;

public class Manager extends Employee {
  private String department;

  private String getDepartment() {
    return department;
  }
  private void setDepartment(String department) {
    if (department == null || department.isEmpty()) {
      throw new IllegalArgumentException("Department cannot be null or empty");
    }
    this.department = department;
  }

  public Manager(String name, String id, double salary, String department) {
    super(name, id, salary);
    setDepartment(department);
  }
  public Manager() {
    super();
    this.department = "General";
  }

  @Override
  public double calculateBonus() {
    return getSalary() * 0.15;
  }

  public static void main(String[] args) {
    Manager manager = new Manager("Alice Johnson", "M123", 90000, "Sales");
    manager.displayEmployeeInfo();
    System.out.println("Manager Department: " + manager.getDepartment());
    System.out.println("Manager Bonus: $" + manager.calculateBonus());
  }
}
