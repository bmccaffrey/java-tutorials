/**
 * Tesla
 */
public class Tesla extends Car {
  private int safety;
  private double acceleration;

  public Tesla(int speed, String direction, int safety, double acceleration) {
    super(0, speed, "electric", direction, 1);
    this.safety = safety;
    this.acceleration = acceleration;
  }

  public Tesla() {
    this(250, "straight", 10, 2.5);
    // this(0, 250, "electric", "straight", 1, 10, 2.5);
  }
}