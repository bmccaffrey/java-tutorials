/**
 * Methods
 */
public class Method {
  // Fields
  private String accessModifier;
  private boolean isStatic;
  private String returnType;
  private String name;
  private Parameter params;
  private Statement statements;

  // Constructors
  public Method(String accessModifier, boolean isStatic, String returnType, String name, Parameter params,
      Statement statements) {
    this.accessModifier = accessModifier;
    this.isStatic = isStatic;
    this.returnType = returnType;
    this.name = name;
    this.params = params;
    this.statements = statements;
  }

  // Methods
  public String composeMethod() {
    return accessModifier + isStatic() + " " + returnType + " " + name + params.composeParams() + " { "
        + statements.getStatement() + " }";
  }

  public String isStatic() {
    return isStatic ? " static" : "";
  }

  // Getters
  public String getAccessModifier() {
    return this.accessModifier;
  }

  public boolean getIsStatic() {
    return this.isStatic;
  }

  public String getReturnType() {
    return this.returnType;
  }

  public String getName() {
    return this.name;
  }

  public Parameter getParams() {
    return this.params;
  }

  public Statement getStatements() {
    return this.statements;
  }

}