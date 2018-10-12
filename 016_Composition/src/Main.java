/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case theCase = new Case("220B", "Dell", "240", dimensions);

    Monitor theMonitor = new Monitor("123C", "BenQ", 27, new Resolution(2540, 1440));
    Motherboard theMotherboard = new Motherboard("B24-C", "MSI", 2, 2, "v3.16");

    PC myPC = new PC(theCase, theMonitor, theMotherboard);

    myPC.getMonitor().drawPixelAt(1500, 1200, "red");
    myPC.getMotherboard().loadProgram("Fedora");
    myPC.getTheCase().pressPowerButton();
  }
}