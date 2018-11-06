import java.util.ArrayList;

public class ObjectList {

    public static void main(String[] args) {
//        The Perils of Polymorphic references of type Object
        ArrayList<Object> animalArrayList = new ArrayList<Object>();
        Dog a = new Dog();
        animalArrayList.add(a);

//        Everything comes out as a reference of type Object, so this won't work
//        Dog b = animalArrayList.get(0);
//        Yet, it is still class Dog
        System.out.println("From the index, it's still a " + animalArrayList.get(0).getClass());
        Object b = animalArrayList.get(0);
        System.out.println("Object reference type, but it's still a " + b.getClass());

//        Casting appears to be a decent workaround
        Dog c = (Dog) animalArrayList.get(0);
        System.out.println(c);
        Dog d = (Dog) b;
        System.out.println(d);
        System.out.println();
    }
}
