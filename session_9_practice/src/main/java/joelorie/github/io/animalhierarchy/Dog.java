package joelorie.github.io.animalhierarchy;

import javax.management.InvalidAttributeValueException;

public class Dog extends Mammal {
  public Dog(String name) throws InvalidAttributeValueException {
    super(name);
  }

  public void bark() {
    System.out.println(super.getName() + " is barking");
  }
}
