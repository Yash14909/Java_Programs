import com.shapes.Circle;
import com.shapes.Square;         //javac com/shapes/Circle.java com/shapes/Square.java P11P2.java

public class P11P2 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.display();

        Square s1 = new Square();
        s1.display();
    }

}

/*
| **Concept / Element**        | **Code Reference**                                               | **Description / Explanation**                                                                                                                              |
| ---------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Package Import**           | `import com.shapes.Circle;`<br>`import com.shapes.Square;`       | These statements import the `Circle` and `Square` classes from the package `com.shapes`. Packages group related classes and help in modular programming.   |
| **Package Structure**        | `com/shapes`                                                     | This is the directory structure where the `Circle.java` and `Square.java` files are stored. (`com` → folder, inside it → `shapes` folder).                 |
| **Compilation Command**      | `javac com/shapes/Circle.java com/shapes/Square.java P11P2.java` | This compiles all three Java files together — the two package classes and the main program. The class files will be generated in their respective folders. |
| **Public Class**             | `public class P11P2`                                             | Declares the main class `P11P2`, which contains the `main()` method. It’s public so the JVM can access it when running the program.                        |
| **Main Method**              | `public static void main(String[] args)`                         | Entry point of any Java application. The JVM starts program execution from here.                                                                           |
| **Object Creation (Circle)** | `Circle c1 = new Circle();`                                      | Creates an instance (object) of the `Circle` class from the `com.shapes` package. `new` allocates memory for the object.                                   |
| **Method Call (Circle)**     | `c1.display();`                                                  | Calls the `display()` method from the `Circle` class to perform its defined action (e.g., printing details about the circle).                              |
| **Object Creation (Square)** | `Square s1 = new Square();`                                      | Creates an object of the `Square` class from the `com.shapes` package.                                                                                     |
| **Method Call (Square)**     | `s1.display();`                                                  | Invokes the `display()` method of the `Square` class to show its details or output.                                                                        |
| **Class Relationship**       | `P11P2` ↔ `Circle`, `Square`                                     | `P11P2` depends on the other two classes (uses their methods). This is an example of **composition** (using objects of other classes).                     |
| **Encapsulation**            | Through Classes                                                  | Each class (Circle, Square) encapsulates its properties and methods. `display()` is the interface (method) to access internal behavior.                    |
| **Namespace Management**     | via `com.shapes` package                                         | Helps avoid name conflicts between classes having the same name but in different packages.                                                                 |
| **Execution Command**        | `java P11P2`                                                     | Runs the compiled `P11P2.class` file. Ensure you’re in the correct directory (root of `com/`) when executing.                                              |
*/
