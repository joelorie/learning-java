package joelorie.github.io.vehiclehierarchy;

import javax.management.InvalidAttributeValueException;

public class Car extends Vehicle {
  private int doors;

  public int getDoors() {
    return this.doors;
  }

  public void setDoors(int doors) throws InvalidAttributeValueException {
    if (doors <= 0) {
      throw new InvalidAttributeValueException("The value of doors must be greater than 0");
    }
    this.doors = doors;
  }

  public Car (int doors, String make, String model, int year) throws javax.naming.directory.InvalidAttributeValueException, InvalidAttributeValueException {
    super(make, model, year);
    setDoors(doors);
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println("Number of doors: " + this.doors);
  }

  public static void main(String[] args) throws InvalidAttributeValueException, javax.naming.directory.InvalidAttributeValueException {
    Car car = new Car(7, "Toyota", "Vits", 2003);
    car.getInfo();
  }
}
