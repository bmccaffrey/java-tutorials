abstract public class Animal {
    public String picture; // fileName.jpeg
    public String food; // meat || grass
    public int hunger; // when & how much animal eats
    // boundaries should be abstracted out;
    public int[] boundaries = {400, 400}; // h x w of space / enclosure;
    public int[] location = new int[2]; // x & y coordinates

    // add noise to instance variables or override
    public void makeNoise() { System.out.println("Making loud noises"); }

    // behavior when animal encounters preferred food source, meat || grass
    // (foodSource == food && hunger > 0) omnomnom!
    public void eat() { System.out.println("Eating"); }

    // need sleep duration possibly sleep after roaming for so many units?
    public void sleep() { System.out.println("Sleeping"); }

    public void rest() { System.out.print("Resting"); }

    // behavior for when !eating, !sleeping, or !resting;
    // waiting to bump into food source or boundary
    public void roam() { System.out.print("Roaming "); }

    public String getFood() { return food; }

    public int getHunger() { return hunger; }

    public void setHunger(int hunger) { this.hunger = hunger; }

    public int[] getBoundaries() { return boundaries; }

    public int[] getLocation() { return location; }

    public void setLocation(int[] location) { this.location = location; }
}
