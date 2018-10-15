/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Statement stuff = new Statement("return number + 2;");
    Parameter params = new Parameter("int", "number");
    Method method = new Method("private", false, "int", "add", params, stuff);
    MainMethod mainmethod = new MainMethod(stuff);
    System.out.println(mainmethod.composeMethod());
    // System.out.println(method.composeMethod());
  }
}