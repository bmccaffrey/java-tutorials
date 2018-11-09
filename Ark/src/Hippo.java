public class Hippo extends Animal{
    public Hippo() {
        System.out.println("Animal() is finished executing.");
        System.out.println("Animal()'s stack frame has been popped " +
                "off the stack");
        System.out.println("Hippo() is finished executing.");
        System.out.println("Hippo()'s stack frame has been popped " +
                "off the stack");
    }
    @Override
    public void roam() {
        System.out.print("together, but we're not really friends.");
    }
}
