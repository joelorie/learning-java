package joelorie.github.io.vehicle_hierarchy;

import javax.naming.directory.InvalidAttributeValueException;

import java.time.Year;

public class Vehicle {
  private String make;
  private String model;
  private int year;

  public String getMake() {
    return this.make;
  }

  public void setMake(String make) throws InvalidAttributeValueException {
    if (make.length() <= 2) {
      throw new InvalidAttributeValueException("The make must be at least two characters long");
    }
    this.make = make;
  }

  public String getModel() {
    return this.model;
  }

  public void setModel(String model) throws InvalidAttributeValueException {
    if (model.length() <= 2) {
      throw new InvalidAttributeValueException("The model must be at least two characters long");
    }
    this.model = model;
  }

  public int getYear() {
    return this.year;
  }

  public void setYear(int year) throws InvalidAttributeValueException {
    if (year < 1800 || year > Year.now().getValue()) {
      throw new InvalidAttributeValueException("The year must be between 1800 and " + Year.now().getValue());
    }
    this.year = year;
  }

  public Vehicle(String make, String model, int year) throws InvalidAttributeValueException {
    setMake(make);
    setModel(model);
    setYear(year);
  }

  public void start() {
    System.out.println("Vehicle is powered on.");
  }

  public void stop() {
    System.out.println("Vehicle is switched off.");
  }

  public void getInfo() {
    System.out.println("Vehicle Make: " + this.make);
    System.out.println("Vehicle Model: " + this.model);
    System.out.println("Year of Manufacture: " + this.year);
  }
}
