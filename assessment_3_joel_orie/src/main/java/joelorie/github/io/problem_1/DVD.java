package joelorie.github.io.problem_1;

import javax.naming.directory.InvalidAttributeValueException;

public class DVD extends LibraryItem {
  private double duration; // in hours
  private double rating;

  public double getDuration() {
    return this.duration;
  }

  public void setDuration(double duration) throws InvalidAttributeValueException {
    if (duration < 0.1) {
      throw new InvalidAttributeValueException("The duration must be at least 6 minutes long!");
    }
    this.duration = duration;
  }

  public double getRating() {
    return this.rating;
  }

  public void setRating(double rating) throws InvalidAttributeValueException {
    if (rating < 1.0 || rating > 5.0) {
      throw new InvalidAttributeValueException("The rating must be between 1 and 5 minutes long!");
    }
    this.rating = rating;
  }

  @Override
  public void checkout() {
    System.out.println("Attempting to checkout a DVD...");
    super.checkout();
  }

  @Override
  public void returnItem() {
    System.out.println("Attempting to return a DVD...");
    super.returnItem();
  }

  @Override
  public void displayDetails() {
    System.out.println("=== DVD Details ===");
    super.displayDetails();
    System.out.println("Duration: " + this.duration);
    System.out.println("Rating; " + this.rating + " stars");
  }

  public DVD(String itemId, String title, String author, double duration, double rating)
      throws InvalidAttributeValueException {
    super(itemId, title, author);
    setDuration(duration);
    setRating(rating);
  }
}
