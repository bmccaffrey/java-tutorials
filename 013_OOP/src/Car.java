/**
 * Car
 */

// Access Modifier
public class Car {
  // Class is the concept of a user-defined data type, a super-data type, if you
  // will

  // create class or member variables aka fields
  // require spedification of access modifier
  // generally go with private here
  // encapsulation: used to hide access to the fields & methods from public access
  // the inner workings of the object isn't publically visible
  // STATE
  private int door;
  private int wheels;
  private String model;
  private String engine;
  private String color;
  // Now, we need to create an Object from this Class

  // BEHAVIOR
  // Creating a method to update the model
  public void setModel(String model) {
    // Can set Rules for Validity in the Class, and then they will be inherited
    // by all of the instances thereof
    String validModel = model.toLowerCase();
    if (validModel.equals("carrera") || validModel.equals("commodore")) {
      this.model = model;
    } else {
      this.model = "Unknown";
    }
  }

  public String getModel() {
    return this.model;
  }
  // Point of Encapsulation: By disallowing direct access to the field, we are
  // able to ensure that the data w/i the object is validated / correct.
}