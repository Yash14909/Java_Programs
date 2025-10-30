class BikeSpeed {
    final int speedlimit = 300;  // Set value once, cannot be reassigned

    void run() {
        // speedlimit = 400;  // ❌ This will cause an error
        System.out.println("Speed limit is " + speedlimit);
    }

    public static void main(String args[]) {
        BikeSpeed obj = new BikeSpeed();
        obj.run();
    }
}

/*
| Concept                        | Description                                        | Example in Code                    |
| ------------------------------ | -------------------------------------------------- | ---------------------------------- |
| **Class**                      | Blueprint of an object                             | `class BikeSpeed`                  |
| **Object**                     | Instance of a class                                | `BikeSpeed obj = new BikeSpeed();` |
| **Method**                     | Action or behavior inside a class                  | `void run()`                       |
| **`final` Keyword**            | Used to make variables constant (can’t be changed) | `final int speedlimit = 300;`      |
| **Access Modifier (`public`)** | Controls visibility                                | `public static void main()`        |
| **Static Method**              | Belongs to the class, not objects                  | `static void main()`               |
| **Encapsulation**              | Grouping data (speedlimit) and behavior (run)      | Inside `BikeSpeed` class           |

| Concept                     | Explanation                                                   |
| --------------------------- | ------------------------------------------------------------- |
| **`main()` method**         | Entry point of the program.                                   |
| **`public`**                | Access modifier — makes method accessible everywhere.         |
| **`static`**                | Allows method to run without creating an object of the class. |
| **Object creation (`new`)** | Creates an instance of a class.                               |
| **Method call**             | Invokes a function using an object.                           |
    
*/
