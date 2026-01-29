package joelorie.github.io.universitysystem;

import javax.naming.directory.InvalidAttributeValueException;

public class Staff extends UniversityPerson {
  private String position;
  private double workHours;

  public String getPosition() {
    return this.position;
  }

  public void setPosition(String position) throws InvalidAttributeValueException {
    if (position.length() < 2 || position.isEmpty()) {
      throw new InvalidAttributeValueException("The position must be at least two characters.");
    }
    this.position = position;
  }

  public double getWorkHours() {
    return this.workHours;
  }

  public void setWorkHours(double workHours) throws InvalidAttributeValueException {
    if (workHours < 1.0) {
      throw new InvalidAttributeValueException("The work hours must be above 1.0");
    }
    this.workHours = workHours;
  }

  public Staff(String id, String name, String email, String position, double workHours)
      throws javax.management.InvalidAttributeValueException, InvalidAttributeValueException {
    super(id, name, email);
    setWorkHours(workHours);
    setPosition(position);
  }

  @Override
  public String toString() {
    return super.toString() +
        "\nPosition: " + this.position +
        "\nWork Hours: " + this.workHours + " Hours";
  }

  public static void main(String[] args) throws javax.management.InvalidAttributeValueException, InvalidAttributeValueException {
    Staff staff = new Staff("bcdefg", "Staff Joe", "joestaff@gmail.com", "Driver", 45.0);
    System.out.println(staff);
  }
}
