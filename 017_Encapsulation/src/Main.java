/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Printer printer = new Printer(0, true);
    printer.printPage(3);
    printer.fillToner(10);
    printer.printPage(3);
    System.out.println(printer.getPagesPrinted());
  }
}