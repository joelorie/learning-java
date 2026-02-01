package joelorie.github.io.problem_4;

public class EmployeeManagementCorrectedCod {
  public static String companyName;
  private String employeeName;
  private double salary;

  public EmployeeManagementCorrectedCod(String name) {
    employeeName = name; // this works but the this keyword should be used before employeeName field
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
