/**
 * Parameter
 */
public class Parameter {
  // Fields
  private String dataType;
  private String name;

  // Constructors
  public Parameter(String dataType, String name) {
    this.dataType = dataType;
    this.name = name;
  }

  // Methods
  public String composeParams() {
    return "(" + dataType + " " + name + ")";
  }

  // Getters
  public String getDataType() {
    return this.dataType;
  }

  public String getName() {
    return this.name;
  }

}