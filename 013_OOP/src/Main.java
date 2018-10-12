public class Main {

  public static void main(String[] args) {
    // porche is the keyword
    // now have to initialize it
    // Unlike Data Types, there aren't default values w/ Classes, so you have to
    // initialize them w/ the 'new' keyword
    // ____________________
    // Car porche = new Car();
    // Car holden = new Car();
    // ____________________
    // Trying to get a field b/f setting it will return 'null'. Null is the
    // internal default state for a class and for a string (which is a class).
    // _________________________________________________
    // System.out.println("Model is " + porche.getModel());
    // _________________________________________________
    // cannot directly access object's field, e.g. 'doors', 'wheels', due to
    // Private Accessor Modifier upholding the principle of Encapsulation
    // This necessitates defining getters & setters
    // _____________________________________
    // porche.setModel("Carrera");
    // porche.setModel("911");
    // System.out.println("Model is " + porche.getModel());
    // ___________________________________________________

    // BankAccount bob = new BankAccount();
    // bob.setAccountNumber(1234123412341234L);
    // bob.setBalance(1000.50);

    // bob.setCustomerName("Bob");
    // bob.setEmail("bob@gmail.com");
    // bob.setPhoneNumber("405-555-1234");
    // System.out.println(bob.getAccountNumber());

    // System.out.println(bob.getBalance());
    // bob.deposit(200);
    // System.out.println(bob.getBalance());
    // bob.withdraw(1000);
    // System.out.println(bob.getBalance());

    // System.out.println("Customer's name is " + bob.getCustomerName());
    // System.out.println(bob.getEmail());
    // System.out.println(bob.getPhoneNumber());
  }

}