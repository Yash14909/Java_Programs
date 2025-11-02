import java.lang.*;
abstract class Car
{
 abstract void start();
 abstract void stop();
}
interface SportsCar
{
 void display();
}
interface CommercialCar
{
 void showDetails();
}
class Santro extends Car implements CommercialCar
{
 public void start()
 {
 System.out.println("Santro car start");
 }
 public void stop()
 {
 System.out.println("Santro car stop");
 }
 public void showDetails()
 {
 System.out.println("Commercial Car");
 }
}
class Audi extends Car implements SportsCar
{
 public void start()
 {
 System.out.println("Audi car start");
 }
 public void stop()
 {
 System.out.println("Audi car stop");
 }
 public void display()
 {
 System.out.println("Sports Car");
 }
}
public class Pgm10
{
 public static void main(String []args)
 {
 System.out.println("******* Santro ***********");
 Santro s1 = new Santro();
 s1.start();
 s1.stop();
 s1.showDetails();
 System.out.println("\n--------------------------------\n");
 System.out.println("******* Audi ***********");
 Audi a1 = new Audi();
 a1.start();
 a1.stop();
 a1.display();
 }
}

/*
| **Line / Section** | **Code / Element**                                            | **Description / Function**                                                                                                                                                                                   |
| ------------------ | ------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 1                  | `import java.lang.*;`                                         | Imports the `java.lang` package (automatically imported by default, but included explicitly here).                                                                                                           |
| 2                  | `abstract class Car`                                          | Defines an **abstract class** named `Car` that cannot be instantiated directly and contains abstract methods.                                                                                                |
| 3                  | `abstract void start();`                                      | Abstract method — must be defined by any subclass of `Car` to describe how the car starts.                                                                                                                   |
| 4                  | `abstract void stop();`                                       | Abstract method — must be defined by any subclass to describe how the car stops.                                                                                                                             |
| 6                  | `interface SportsCar`                                         | Defines an **interface** named `SportsCar` for cars with sporty features.                                                                                                                                    |
| 7                  | `void display();`                                             | Abstract method to display details about a sports car.                                                                                                                                                       |
| 9                  | `interface CommercialCar`                                     | Defines another **interface** for commercial-type cars.                                                                                                                                                      |
| 10                 | `void showDetails();`                                         | Abstract method to display details about a commercial car.                                                                                                                                                   |
| 12                 | `class Santro extends Car implements CommercialCar`           | Defines a class `Santro` that **inherits from `Car`** and **implements `CommercialCar`** interface.                                                                                                          |
| 13–15              | `public void start()`                                         | Implementation of `start()` method — prints a message when the Santro starts.                                                                                                                                |
| 16–18              | `public void stop()`                                          | Implementation of `stop()` method — prints a message when the Santro stops.                                                                                                                                  |
| 19–21              | `public void showDetails()`                                   | Implementation of `showDetails()` — identifies the Santro as a commercial car.                                                                                                                               |
| 23                 | `class Audi extends Car implements SportsCar`                 | Defines a class `Audi` that **inherits from `Car`** and **implements `SportsCar`** interface.                                                                                                                |
| 24–26              | `public void start()`                                         | Implementation of `start()` method — prints a message when the Audi starts.                                                                                                                                  |
| 27–29              | `public void stop()`                                          | Implementation of `stop()` method — prints a message when the Audi stops.                                                                                                                                    |
| 30–32              | `public void display()`                                       | Implementation of `display()` — identifies the Audi as a sports car.                                                                                                                                         |
| 34                 | `public class Pgm10`                                          | Main public class containing the `main()` method to execute the program.                                                                                                                                     |
| 35                 | `public static void main(String []args)`                      | Entry point of the program.                                                                                                                                                                                  |
| 36                 | `System.out.println("******* Santro ***********");`           | Prints a heading for Santro details.                                                                                                                                                                         |
| 37                 | `Santro s1 = new Santro();`                                   | Creates an object `s1` of class `Santro`.                                                                                                                                                                    |
| 38                 | `s1.start();`                                                 | Calls the `start()` method of `Santro`.                                                                                                                                                                      |
| 39                 | `s1.stop();`                                                  | Calls the `stop()` method of `Santro`.                                                                                                                                                                       |
| 40                 | `s1.showDetails();`                                           | Calls the `showDetails()` method from the `CommercialCar` interface implementation.                                                                                                                          |
| 41                 | `System.out.println("\n--------------------------------\n");` | Prints a separator line between outputs.                                                                                                                                                                     |
| 42                 | `System.out.println("******* Audi ***********");`             | Prints a heading for Audi details.                                                                                                                                                                           |
| 43                 | `Audi a1 = new Audi();`                                       | Creates an object `a1` of class `Audi`.                                                                                                                                                                      |
| 44                 | `a1.start();`                                                 | Calls the `start()` method of `Audi`.                                                                                                                                                                        |
| 45                 | `a1.stop();`                                                  | Calls the `stop()` method of `Audi`.                                                                                                                                                                         |
| 46                 | `a1.display();`                                               | Calls the `display()` method from the `SportsCar` interface implementation.                                                                                                                                  |

*/

