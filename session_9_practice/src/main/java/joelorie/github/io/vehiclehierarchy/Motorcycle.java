package joelorie.github.io.vehiclehierarchy;

import javax.naming.directory.InvalidAttributeValueException;

public class Motorcycle extends Vehicle {
  private boolean hasSideCar;

  public boolean hasSideCar() {
    return this.hasSideCar;
  }

  public Motorcycle(boolean hasSideCar, String make, String model, int year) throws InvalidAttributeValueException {
    super(make, model, year);
    this.hasSideCar = hasSideCar;
  }

  @Override
  public void getInfo() {
    super.getInfo();
    System.out.println("The motorcycle " + (hasSideCar ? "has" : "does not have") + " a side car.");
  }

  public static void main(String[] args) throws InvalidAttributeValueException {
    Motorcycle motorcycle = new Motorcycle(false, "Kawasaki", "Ninja 500", 2026);
    motorcycle.getInfo();
  }
}
