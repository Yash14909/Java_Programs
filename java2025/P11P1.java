import java.lang.*;
import java.util.*;
interface CE
{
 void call();
 void sms();
}
interface ISO
{
 void radiation();
 void sound();
}
class IPhone implements CE, ISO
{
 public void call()
 {
 System.out.println("IPhone call");
 }
 public void sms()
 {
 System.out.println("IPhone sms");
 }
 public void radiation()
 {
 System.out.println("IPhone radiation");
 }
 public void sound()
 {
 System.out.println("IPhone sound");
 }
}
class Galaxy implements CE, ISO
{
 public void call()
 {
 System.out.println("Galaxy call");
 }
 
 public void sms()
 {
 System.out.println("Galaxy sms");
 }
 
 public void radiation()
 {
 System.out.println("Galaxy radiation");
 }
 
 public void sound()
 {
 System.out.println("Galaxy sound");
 }
}
public class P11P1
{
 public static void main(String[] args)
 {
 System.out.println("******* IPhone ***********");
 IPhone i1 = new IPhone();
 i1.call();
 i1.sms();
 i1.radiation();
 i1.sound();
 System.out.println("\n--------------------------------\n");
 System.out.println("******* Galaxy ***********");
 Galaxy g1 = new Galaxy();
 g1.call();
 g1.sms();
 g1.radiation();
 g1.sound();;
 
 }

}

/*
| **Component / Section**                                     | **Description**                                                                                                                              | **Key Concept(s)**                                     |
| :---------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------- |
| **`import java.lang.*;`**                                   | Imports the core Java language package (automatically imported by default).                                                                  | **Package Import**                                     |
| **`import java.util.*;`**                                   | Imports Java utility classes (not specifically used here but often needed).                                                                  | **Package Import**                                     |
| **`interface CE`**                                          | Declares an interface named `CE` that defines common behaviors like `call()` and `sms()` that any communication device should have.          | **Interface Declaration**, **Abstraction**             |
| **Methods in CE (`call()`, `sms()`)**                       | Abstract methods (no implementation) that must be defined by any class implementing `CE`.                                                    | **Abstraction**, **Method Declaration**                |
| **`interface ISO`**                                         | Another interface defining methods related to standards or safety features like `radiation()` and `sound()`.                                 | **Interface Declaration**, **Multiple Inheritance**    |
| **Methods in ISO (`radiation()`, `sound()`)**               | Abstract methods that implementing classes must define.                                                                                      | **Abstraction**, **Interface Contract**                |
| **`class IPhone implements CE, ISO`**                       | Defines a concrete class `IPhone` that implements both `CE` and `ISO` interfaces. This demonstrates **multiple inheritance** via interfaces. | **Multiple Inheritance**, **Interface Implementation** |
| **`public void call()`**                                    | Implements the `call()` method from the `CE` interface — specific to `IPhone`.                                                               | **Method Implementation**, **Polymorphism**            |
| **`public void sms()`**                                     | Implements the `sms()` method from the `CE` interface.                                                                                       | **Abstraction Implementation**                         |
| **`public void radiation()`**                               | Implements `radiation()` from `ISO`, showing `IPhone`’s behavior.                                                                            | **Method Implementation**                              |
| **`public void sound()`**                                   | Implements `sound()` from `ISO`.                                                                                                             | **Interface Implementation**                           |
| **`class Galaxy implements CE, ISO`**                       | Another concrete class that implements both interfaces with its own version of all methods.                                                  | **Multiple Inheritance**, **Polymorphism**             |
| **Methods in Galaxy (`call`, `sms`, `radiation`, `sound`)** | Provides its own unique implementation of each interface method.                                                                             | **Method Overriding**, **Dynamic Behavior**            |
| **`public class P11P1`**                                    | The main class containing the `main()` method — the program’s entry point.                                                                   | **Program Entry Point**, **Encapsulation**             |
| **`IPhone i1 = new IPhone();`**                             | Creates an instance of `IPhone` and stores it in reference variable `i1`.                                                                    | **Object Instantiation**, **Class Implementation**     |
| **`i1.call(); i1.sms(); i1.radiation(); i1.sound();`**      | Invokes all implemented methods to display iPhone-specific outputs.                                                                          | **Method Invocation**, **Dynamic Binding**             |
| **`Galaxy g1 = new Galaxy();`**                             | Creates an instance of `Galaxy` and stores it in reference variable `g1`.                                                                    | **Object Instantiation**, **Interface Implementation** |
| **`g1.call(); g1.sms(); g1.radiation(); g1.sound();`**      | Invokes all implemented methods for `Galaxy`.                                                                                                | **Method Invocation**, **Polymorphism**                |
*/
