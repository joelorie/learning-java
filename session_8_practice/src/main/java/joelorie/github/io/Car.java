package joelorie.github.io;

public class Car {
  private String make;
  private String model;
  private int year;

  public Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void displayInfo() {
    System.out.println("Car Make: " + make);
    System.out.println("Car Model: " + model);
    System.out.println("Car Year: " + year);
  }

  public static void main(String[] args) {
    Car myCar = new Car("Toyota", "Camry", 2020);
    myCar.displayInfo();

    myCar.setYear(2021);
    System.out.println("Updated Car Year: " + myCar.getYear());
  }
}