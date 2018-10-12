public class BankAccount {
  // State
  private long accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;

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
    // if ((this.getBalance() - amount) >= 0) {
    // this.balance -= amount;
    // } else {
    // System.out.println("Insufficient Funds");
    // }
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