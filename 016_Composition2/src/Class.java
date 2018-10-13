/**
 * ClassFile
 */
public class Class {
  // Fields
  private String accessModifier;
  private String name;

  // Constructors
  public Class(String accessModifier, String name) {
    this.accessModifier = accessModifier;
    this.name = name;
  }

  // Getters
  public String getAccessModifier() {
    return this.accessModifier;
  }

  public String getName() {
    return this.name;
  }
}