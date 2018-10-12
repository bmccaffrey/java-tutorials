/**
 * VIPCustomer
 */
public class VIPCustomer {

  // State
  private String name;
  private int limit;
  private String email;

  // Constructors
  public VIPCustomer() {
    this("John/Jane Doe", 0, "doe@gmail.com");
  }

  public VIPCustomer(String name, int limit) {
    this(name, limit, "unknown@gmail.com");
  }

  public VIPCustomer(String name, int limit, String email) {
    this.name = name;
    this.limit = limit;
    this.email = email;
  }

  // Behavior
  public String getName() {
    return this.name;
  }

  public int getLimit() {
    return this.limit;
  }

  public String getEmail() {
    return this.email;
  }
}