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


/*
| Concept              | Explanation                                            |
| -------------------- | ------------------------------------------------------ |
| **Class**            | Blueprint that defines data and methods.               |
| **Object**           | Instance of a class (created using `new`).             |
| **Method**           | Function defined inside a class to perform an action.  |
| **Encapsulation**    | The `Dog` class encapsulates its behavior (bark, eat). |
| **Main Method**      | The starting point of the program.                     |
| **Dot Operator (.)** | Used to access class members (methods/variables).      |
*/

