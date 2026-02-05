package joelorie.github.io.employeehierarchy;

import javax.management.InvalidAttributeValueException;

public class Main {
  public static void main(String[] args)
      throws InvalidAttributeValueException, javax.naming.directory.InvalidAttributeValueException {
    Developer developer = new Developer("John Doe", "E001", 35000, "Java");
    Manager manager = new Manager("Ken", "M001", 70000, "Deployment");

    developer.displayDetails();
    manager.displayDetails();
  }
}
