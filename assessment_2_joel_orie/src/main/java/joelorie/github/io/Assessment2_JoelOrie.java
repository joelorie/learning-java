// Joel Orie
package joelorie.github.io;

public class Assessment2_JoelOrie {
  public static void main(String[] args) {

  }

  // For Question 1 please see Book.java

  // For Question 2 please see Employee.java, Manager.java, Developer.java

  // For Question 3 please see Calculator.java and ScientificCalculator.java

  // For Question 4 please see BankAccount.java, SavingsAccount.java, and
  // CheckingAccount.java

  // Question 5
  // 1. What is the difference between method overloading and method overriding?
  // Method overloading is when you have methods in a class having the same name,
  // but they have different parameters. For example:
  // public void display(int a) { }
  // public void display(String b) { }
  // Method overriding is when a child class of a parent class redefines or
  // modifies how a method in the parent class is implemented. For example:
  // In Parent class:
  // public void show() { System.out.println("Parent show method"); }
  // In Child class:
  // @Override
  // public void show() { System.out.println("Child show method"); }

  // 2. Why should fields be declared private in a class?
  // Fields need to be private in order to maaintain the integrity of the data
  // stored by the class objects. If the data were to be left at public, it could
  // be modified anywhere outside of the class. For example:
  // public class Person {
  // public String name;
  // }
  // In this case, the name field can be modified anywhere in the code, which
  // could lead to problems. Making the field private, we can use getters and
  // setters to control how the name is obtained and modified. We can also add
  // logic to verify the name is correct.
  // public class Person {
  // private String name;
  // public String getName() {
  // return name;
  // }
  // public void setName(String name) {
  // if (name == null || name.isEmpty()) {
  // throw new IllegalArgumentException("Name cannot be null or empty.");
  // }
  // this.name = name;
  // }
  // }

  // 3. When should you use the super keyword?
  // The super keyword should be used when you want to use a method defined in the
  // parent class when you're inside a child class. Also, it can be used to call
  // the constructor in the parent class. For example:
  // public class Parent {
  // public void show() {
  // System.out.println("Parent show method");
  // }
  // }
  // public class Child extends Parent {
  // @Override
  // public void show() {
  // super.show(); // Calls the show method from Parent class
  // System.out.println("Child show method");
  // }
  // }

  // 4. What is the purpose of the @Override annotation?
  // The @Override annotation is used in a child class to show that a method from
  // the parent class is being modified or redefined. It helps you know that the
  // original method is in the parent class. For example:
  // public class Parent {
  // public void display() {
  // System.out.println("Parent display method");
  // }
  // }
  // public class Child extends Parent {
  // @Override
  // public void display() {
  // System.out.println("Child display method");
  // }
  // }

  // 5. How does encapsulation improve code maintainability?
  // Encapsulation controls access to the data and the methods that interact with
  // the data. Controlling access to them ensures that the data is always modified
  // appropriately and in a controlled manner hence avoiding any unexpected
  // behavior. For example:
  // public class BankAccount {
  // private double balance;
  // public double getBalance() {
  // return balance;
  // }
  // public void deposit(double amount) {
  // if (amount <= 0) {
  // throw new IllegalArgumentException("Deposit amount must be positive.");
  // }
  // balance += amount;
  // }
  // public void withdraw(double amount) {
  // if (amount <= 0) {
  // throw new IllegalArgumentException("Withdrawal amount must be positive.");
  // }
  // if (amount > balance) {
  // throw new IllegalArgumentException("Insufficient funds for withdrawal.");
  // }
  // balance -= amount;
  // }
  // }
  // In this example, the balance field is private and can only be modified
  // through the deposit and withdraw methods, which have checks to ensure that
  // the balance is always in a valid state. This improves code maintainability by
  // preventing unintended side effects from direct access to the balance field.

}
