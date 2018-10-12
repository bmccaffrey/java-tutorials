/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("Please work.");
    Vehicle vehicle = new Vehicle();
    // System.out.println(vehicle.getFuelType());
    Car car = new Car();
    System.out.println(car.getSteeringWheel());
    Tesla tesla = new Tesla();
    System.out.println(tesla.getSpeed());
    tesla.changeSpeed(100);

  }
}