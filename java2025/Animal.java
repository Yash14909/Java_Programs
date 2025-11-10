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


| **Line / Section**                       | **Code / Concept**       | **Description / Explanation**                                                                    |
| ---------------------------------------- | ------------------------ | ------------------------------------------------------------------------------------------------ |
| `public class Animal {`                  | Class Declaration        | Defines the main class named **Animal** which contains the main method (entry point of program). |
| `public static void main(String[] args)` | Main Method              | The starting point of Java program execution.                                                    |
| `Dog dog = new Dog();`                   | Object Creation          | Creates a new object **dog** of class **Dog** using the `new` keyword.                           |
| `dog.bark();`                            | Method Call              | Calls the **bark()** method of the **Dog** class, which prints “Dog barks”.                      |
| `dog.eat();`                             | Method Call              | Calls the **eat()** method of the **Dog** class, which prints “Dog eats”.                        |
| `}`                                      | End of Class             | Closes the **Animal** class.                                                                     |
| `class Dog {`                            | Second Class Declaration | Defines another class named **Dog** with two behaviors (methods).                                |
| `public void bark()`                     | Method Definition        | Declares a method **bark()** that prints “Dog barks” when called.                                |
| `System.out.println("Dog barks");`       | Output Statement         | Prints message to console.                                                                       |
| `public void eat()`                      | Method Definition        | Declares another method **eat()** that prints “Dog eats”.                                        |
| `System.out.println("Dog eats");`        | Output Statement         | Prints message to console.                                                                       |
| `}`                                      | End of Class             | Closes the **Dog** class.                                                                        |



