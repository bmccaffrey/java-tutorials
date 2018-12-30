public class TestGenerics1 {

    public static void main(String[] args) {
        new TestGenerics1().go();
    }
    public void go() {
        Animal [] animals = {new Dog(), new Cat(), new Dog()};
        Dog[] dogs = {new Dog(), new Dog(), new Dog()};
    }

    abstract class Animal {
        void eat() { System.out.println("Animal eating."); }
    }
    
    class Dog extends Animal {
        void bark() {}
    }

    class Cat extends Animal {
        void meow() {}
    }
}
