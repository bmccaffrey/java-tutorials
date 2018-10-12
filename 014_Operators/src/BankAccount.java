public class BankAccount {
  // State
  private long accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

  // Constructor: only has the access modifier; no void or return type; and is
  // followed by Exact name of the class. It's purpose is to initialize the
  // object that you're creating & do w/e else you want to do when the object
  // is created. They are only called once, when the object is created.

  public BankAccount() {
    // Special use of 'this'--calling a constructor w/i a constructor
    // Basically setting default parameters. 'this()'' must be the first
    // statement in the constructor body
    this(9876543214321L, 5000, "John Doe", "example@gmail.com", "555-555-5555");
    System.out.println("Empty constructor called");
  }

  // This is the major constructor: updates all the fields
  // Constructors can be overloaded
  public BankAccount(long accountNumber, double balance, String customerName, String email, String phoneNumber) {
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.customerName = customerName;
    // setPhoneNumber(phoneNumber);
    // ^^ another technique, but not an advised one as there can be conflicts
    // in subclassing & inheritance. Rule of Thumb: Don't call setters or any
    // other methods other than another constructor w/i constructors; better to
    // save the value of the constructor directly to the field.
    System.out.println("Major Constructor with parameters called");
  }

  // Set up 2 default parameters & call major constructor
  public BankAccount(String customerName, String email, String phoneNumber) {
    this(1234567891L, 15500.75D, customerName, email, phoneNumber);
    System.out.println("Constructor w/ 2 Defaults set called.");
  }

  // Behavior
  // Setters
  public void setAccountNumber(long accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void deposit(double amount) {
    this.balance += amount;
  }

  public void withdraw(double amount) {
    if ((this.balance - amount) >= 0) {
      this.balance -= amount;
    } else {
      System.out.println("Insufficient Funds");
    }
  }

  // Getters
  public long getAccountNumber() {
    return this.accountNumber;
  }

  public double getBalance() {
    return this.balance;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public String getEmail() {
    return this.email;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }

}