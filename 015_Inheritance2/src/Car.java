/**
 * Car
 */
public class Car extends Vehicle {
  private int steeringWheel;

  public Car(int gears, int speed, String fuelType, String direction, int steeringWheel) {
    super(4, gears, speed, fuelType, direction);
    this.steeringWheel = steeringWheel;
  }

  public Car() {
    this(0, 0, "gas", "straight", 1);
  }

  public int getSteeringWheel() {
    return this.steeringWheel;
  }

}