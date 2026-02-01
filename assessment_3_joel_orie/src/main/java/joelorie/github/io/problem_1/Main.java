package joelorie.github.io.problem_1;

import javax.management.InvalidAttributeValueException;

public class Main {
  public static void main(String[] args) throws InvalidAttributeValueException, InvalidAttributeValueException,
      javax.naming.directory.InvalidAttributeValueException {
    LibraryItem[] items = {
        new Book("B001", "NewBook", "Frank Doe", "1234567891009", "Fiction"),
        new DVD("D001", "Movie", "Movie Maker", 3.5, 5.0),
        new Magazine("M001", "New Mag", "Mag Writer", 1, "2024-01-01")
    };

    for(LibraryItem item : items) {
      item.displayDetails();
      item.checkout();
    }
  }
}
