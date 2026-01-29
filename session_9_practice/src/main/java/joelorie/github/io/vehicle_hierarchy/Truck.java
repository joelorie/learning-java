package joelorie.github.io.vehicle_hierarchy;

import javax.management.InvalidAttributeValueException;

public class Truck extends Vehicle {
  private double loadCapacity;

  public double getLoadCapacity() {
    return loadCapacity;
  }

  public void setLoadCapacity(double loadCapacity) throws InvalidAttributeValueException {
    if (loadCapacity < 0.0) {
      throw new InvalidAttributeValueException("The load capacity must be greater than zero.");
    }
    this.loadCapacity = loadCapacity;
  }

  public Truck(String make, String model, int year, double loadCapacity)
      throws javax.naming.directory.InvalidAttributeValueException, InvalidAttributeValueException {
    super(make, model, year);
    setLoadCapacity(loadCapacity);
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println("Load capacity: " + this.loadCapacity + "kg");
  }

  public static void main(String[] args) throws InvalidAttributeValueException, javax.naming.directory.InvalidAttributeValueException {
    Truck truck = new Truck("Iveco", "Power001", 2020, 7000.0);
    truck.getInfo();
  }
}
