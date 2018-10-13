/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Statement stuff = new Statement("return number + 2;");
    Parameter params = new Parameter("int", "number");
    Method method = new Method("private", false, "int", "add", params, stuff);

    System.out.println(method.composeMethod());
  }
}