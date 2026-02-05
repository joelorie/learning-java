package joelorie.github.io.animalhierarchy;

import javax.management.InvalidAttributeValueException;

public class Mammal extends Animal {
  public Mammal(String name) throws InvalidAttributeValueException {
    super(name);
  }

  public void breathe() {
    System.out.println(super.getName() + " is breathing air.");
  }
}
