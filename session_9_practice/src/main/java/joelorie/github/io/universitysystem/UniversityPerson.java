package joelorie.github.io.universitysystem;

import javax.management.InvalidAttributeValueException;

public class UniversityPerson {
  private String id;
  private String name;
  private String email;

  public String getId() {
    return this.id;
  }

  public void setId(String id) throws InvalidAttributeValueException {
    if (id.isEmpty() || id.length() < 2) {
      throw new InvalidAttributeValueException("The id must be at least two characters long.");
    }
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) throws InvalidAttributeValueException {
    if (name.isEmpty() || name.length() < 2) {
      throw new InvalidAttributeValueException("The name must be at least two characters long.");
    }
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) throws InvalidAttributeValueException {
    if (!email.contains("@") || email.length() < 2) {
      throw new InvalidAttributeValueException(
          "The email should be at least two characters long and should contain an @ symbol.");
    }
    this.email = email;
  }

  public UniversityPerson(String id, String name, String email) throws InvalidAttributeValueException {
    setEmail(email);
    setName(name);
    setId(id);
  }

  @Override
  public String toString() {
    return "Id: " + this.id +
        "\nName: " + this.name +
        "\nEmail: " + this.email;
  }
}
