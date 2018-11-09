public class Main {
    public static void main(String[] args) {
        System.out.println("How to create a NullPointerException.");
        System.out.println("Step 1: Forget that a wrapper object is treated " +
                "as an object.");
        System.out.println("Step 2: Forget that the default value set for " +
                        "uninitialized objects is \"null.\"");
        System.out.println("Step 3: Try to assign null to an int.");
        System.out.println("Step 4: Profit.");

        AutoBoxer otter = new AutoBoxer();

        otter.oops(); // iWrap = int;

        otter.implicitConversion(); // int = iWrap; => 0;
    }
}
