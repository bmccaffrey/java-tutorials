/**
 * Printer
 */
public class Printer {
  // Fields
  private int tonerLevel;
  private double pagesPrinted;
  private boolean duplex;

  // Constructors
  public Printer(int tonerLevel, boolean duplex) {
    if (tonerLevel >= 0 && tonerLevel <= 100) {
      this.tonerLevel = tonerLevel;
    } else {
      this.tonerLevel = 0;
    }
    this.duplex = duplex;
  }

  // Methods
  public void fillToner(int amount) {
    if (amount <= 0) {
      System.out.println("Only positive integers are permitted.");
    } else if ((this.tonerLevel + amount) > 100) {
      System.out.println("You've added too much toner. Please reduce amount.");
    } else {
      this.tonerLevel += amount;
    }
  }

  public double printPage(int number) {
    if (this.tonerLevel <= 0) {
      System.out.println("Insufficient toner level.");
      return -1;
    }
    if (this.duplex) {
      this.pagesPrinted += (number / 2D);
    } else {
      this.pagesPrinted += number;
    }
    return this.pagesPrinted;
  }

  // Getters
  public int getTonerLevel() {
    return this.tonerLevel;
  }

  public double getPagesPrinted() {
    return this.pagesPrinted;
  }

  public boolean getDuplex() {
    return this.duplex;
  }

}