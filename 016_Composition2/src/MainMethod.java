/**
 * MainMethod
 */
public class MainMethod extends Method {
  public MainMethod(Statement statements) {
    super("public", true, "void", "main", new Parameter("String[]", "args"), statements);
  }
}