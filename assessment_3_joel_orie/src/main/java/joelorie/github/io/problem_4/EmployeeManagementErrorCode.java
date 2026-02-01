package joelorie.github.io.problem_4;

public class EmployeeManagementErrorCode {
  public static String companyName;
  private String employeeName;
  private double salary;

  // There is no getter and setter for employeeName
  // There is no getter for salary

  public EmployeeManagementErrorCode(String name) {
    employeeName = name; // this works but the this keyword should be used before employeeName field
    // The salary is never set in the constructor hence it defaults to the default value. 
    // No checks are being made to confirm whether a correct name is being entered. 
  }

  public void setSalary(double salary) {
    if (salary < 0) { // The check should be <= 0 since an employee can't have a salary of 0.
      System.out.println("Salary cannot be nagative"); // An error can be thrown here for invalid input.
    }
    salary = salary; // The assignment to the class variable salary does not work since the this keyword is not being used. 
  }

  public void calculateBonus() {
    return salary * 0.1;
    // SYNTAX ERROR: Missing closing parenthesis for calculateBonus method. 
    // This function is declared as void but it returns a double value. 
    // The this keyword should be used for correctness. 
}
