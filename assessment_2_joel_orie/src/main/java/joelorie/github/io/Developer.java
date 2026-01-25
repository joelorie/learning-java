package joelorie.github.io;

public class Developer extends Employee {
  private String programmingLanguage;

  private String getProgrammingLanguage() {
    return programmingLanguage;
  }

  private void setProgrammingLanguage(String programmingLanguage) {
    if (programmingLanguage == null || programmingLanguage.isEmpty()) {
      throw new IllegalArgumentException("Programming Language cannot be null or empty");
    }
    this.programmingLanguage = programmingLanguage;
  }

  public Developer(String name, String id, double salary, String programmingLanguage) {
    super(name, id, salary);
    setProgrammingLanguage(programmingLanguage);
  }

  public Developer() {
    super();
    this.programmingLanguage = "Java";
  }

  @Override
  public double calculateBonus() {
    return getSalary() * 0.10;
  }

  public static void main(String[] args) {
    Developer developer = new Developer("Bob Smith", "D456", 80000, "Python");
    developer.displayEmployeeInfo();
    System.out.println("Developer Programming Language: " + developer.getProgrammingLanguage());
    System.out.println("Developer Bonus: $" + developer.calculateBonus());
  }
}
