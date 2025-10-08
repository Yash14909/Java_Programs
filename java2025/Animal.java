public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}

class Dog {
    public void bark() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats");
    }
}

