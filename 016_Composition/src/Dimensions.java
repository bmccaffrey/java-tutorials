/**
 * Dimensions
 */
public class Dimensions {
  // Fields
  private int width;
  private int height;
  private int depth;

  // Constructor
  public Dimensions(int width, int height, int depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  // Methods
  public int getWidth() {
    return this.width;
  }

  public int getHeight() {
    return this.height;
  }

  public int getDepth() {
    return this.depth;
  }
}