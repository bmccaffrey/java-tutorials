/**
 * Monitor
 */
public class Monitor {
  // Fields
  private String model;
  private String manufacturer;
  private int size;
  private Resolution nativeResolution;

  // Constructors
  public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
    this.model = model;
    this.manufacturer = manufacturer;
    this.size = size;
    this.nativeResolution = nativeResolution;
  }

  // Methods
  public void drawPixelAt(int x, int y, String color) {
    System.out.println("Drawing pixel at " + x + "," + y + " in " + color + ".");
  }

  public String getModel() {
    return this.model;
  }

  public String getManufacturer() {
    return this.manufacturer;
  }

  public int getSize() {
    return this.size;
  }

  public Resolution getNativeResolution() {
    return this.nativeResolution;
  }

}