package joelorie.github.io;

public class Student {
  private String id;
  private String name;
  private int age;
  private double gpa;

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    if (id != null && id.length() == 6) {
      this.id = id;
    } else {
      throw new IllegalArgumentException("ID must be exactly 6 characters long.");
    }
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    if (name != null && !name.trim().isEmpty() && name.length() >= 2) {
      this.name = name;
    } else {
      throw new IllegalArgumentException("Name cannot be null or empty. Must be at least 2 characters long.");
    }
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    if (age >= 16 && age <= 100) {
      this.age = age;
    } else {
      throw new IllegalArgumentException("Age must be between 16 and 100.");
    }
  }

  public double getGpa() {
    return this.gpa;
  }

  public void setGpa(double gpa) {
    if (gpa >= 0.0 && gpa <= 4.0) {
      this.gpa = gpa;
    } else {
      throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
    }
  }

  public Student() {
    this.id = "000000";
    this.name = "Unnamed";
    this.age = 16;
    this.gpa = 0.0;
  }

  public Student(String id, String name, int age, double gpa) {
    setId(id);
    setName(name);
    setAge(age);
    setGpa(gpa);
  }

  public void displayInfo() {
    System.out.println("Student ID: " + getId());
    System.out.println("Name: " + getName());
    System.out.println("Age: " + getAge());
    System.out.println("GPA: " + getGpa());
  }

  public static void main(String[] args) {
    Student student = new Student("A12345", "John Doe", 20, 3.5);
    student.displayInfo();
  }
}
