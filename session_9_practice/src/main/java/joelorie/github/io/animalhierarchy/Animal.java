package joelorie.github.io.animalhierarchy;

import javax.management.InvalidAttributeValueException;

public class Animal {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) throws InvalidAttributeValueException {
    if (name.isBlank() || name.isEmpty() || name.length() < 2) {
      throw new InvalidAttributeValueException("The name must be at least two characters!");
    }
    this.name = name;
  }

  public Animal(String name) throws InvalidAttributeValueException {
    setName(name);
  }

}
