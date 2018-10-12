/**
 * Animal
 */
public class Animal {
  private String name;
  private int brain;
  private int body;
  private int size;
  private int weight;

  public Animal(String name, int brain, int body, int size, int weight) {
    this.name = name;
    this.brain = brain;
    this.body = body;
    this.size = size;
    this.weight = weight;
  }

  // Behavior

  public void eat() {
    System.out.println("Animal.eat() called");
  }

  public void move(int speed) {
    System.out.println("Animal.move() called. Animal is moving at " + speed);
  }

  public void inactive() {
    System.out.println("Animal.inactive() called.");
    move(0);
  }

  // Getters
  public String getName() {
    return this.name;
  }

  public int getBrain() {
    return this.brain;
  }

  public int getBody() {
    return this.body;
  }

  public int getSize() {
    return this.size;
  }

  public int getWeight() {
    return this.weight;
  }

}