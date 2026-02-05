package joelorie.github.io.animalhierarchy;

import javax.management.InvalidAttributeValueException;

public class Main {
  public static void main(String[] args) throws InvalidAttributeValueException {
    Dog dog = new Dog("Bosco");
    dog.breathe();
    dog.bark();
  }
}
