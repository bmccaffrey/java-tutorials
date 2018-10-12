/**
 * Main
 */
public class Main {

  public static void main(String[] args) {

    VIPCustomer bob = new VIPCustomer();
    System.out.println("VIP Customoer: Bob:");
    System.out.println("Name: " + bob.getName());
    System.out.println("Limit: " + bob.getLimit());
    System.out.println("Email: " + bob.getEmail());
    System.out.println("");

    VIPCustomer tim = new VIPCustomer("Tim the Toolman Taylor", 9000, "tim@tools.com");
    System.out.println("VIP Customoer: Tim:");
    System.out.println("Name: " + tim.getName());
    System.out.println("Limit: " + tim.getLimit());
    System.out.println("Email: " + tim.getEmail());
    System.out.println("");

    VIPCustomer john = new VIPCustomer("The Beloved Apostle", 12);
    System.out.println("VIP Customoer: John:");
    System.out.println("Name: " + john.getName());
    System.out.println("Limit: " + john.getLimit());
    System.out.println("Email: " + john.getEmail());
  }
}