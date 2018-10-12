/**
 * Vehicle
 */
public class Vehicle {
  private int wheels;
  private int gears;
  private int speed;
  private String fuelType;
  private String direction;

  public Vehicle(int wheels, int gears, int speed, String fuelType, String direction) {
    this.wheels = wheels;
    this.gears = gears;
    this.speed = speed;
    this.fuelType = fuelType;
    this.direction = direction;
  }

  public Vehicle() {
    this(0, 0, 0, "gas", "straight");
  }

  public void changeSpeed(int speed) {
    this.speed = speed;
    System.out.println("Speed is currently: " + speed);
  }

  // Getters

  public int getWheels() {
    return this.wheels;
  }

  public int getGears() {
    return this.gears;
  }

  public int getSpeed() {
    return this.speed;
  }

  public String getFuelType() {
    return this.fuelType;
  }

  public String getDirection() {
    return this.direction;
  }

}