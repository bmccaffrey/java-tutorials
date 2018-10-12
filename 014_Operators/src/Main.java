/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // Constructors allow you to set the initial paramaters/values of the fields
    // new Class() is calling the constructor
    BankAccount bob = new BankAccount(123412341L, 2000, "Bob", "bob@gmail.com", "405-555-1234");
    System.out.println("Bob's account number: " + bob.getAccountNumber());
    System.out.println(bob.getBalance());
    System.out.println(bob.getCustomerName());
    System.out.println(bob.getEmail());
    System.out.println(bob.getPhoneNumber());

    BankAccount john = new BankAccount();
    System.out.println("John's account number: " + john.getAccountNumber());
    System.out.println(john.getBalance());
    System.out.println(john.getCustomerName());
    System.out.println(john.getEmail());
    System.out.println(john.getPhoneNumber());

    BankAccount tim = new BankAccount("Tim the Toolman Taylor", "tim@tools.com", "1-800-tim-tools");
    System.out.println("Tim's account number: " + tim.getAccountNumber());
    System.out.println(tim.getBalance());
    System.out.println(tim.getCustomerName());
    System.out.println(tim.getEmail());
    System.out.println(tim.getPhoneNumber());

    System.out.println(bob.getBalance());
    bob.deposit(200);
    System.out.println("Bob's current balance is: " + bob.getBalance());
    bob.withdraw(1000);
    System.out.println("Bob's current balance is: " + bob.getBalance());
  }
}