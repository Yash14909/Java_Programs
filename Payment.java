// User_Paymt_of_Au-Ag  ==  Non input java code (Abstract class ex)

abstract class User

{
    abstract void pay();
    abstract void receive();
}
class GoldUser extends User
{
public void pay()
{
System.out.println("Gold User pay Method");
}
public void receive()
{
 System.out.println("Gold User receive Method");
}
}
class SilverUser extends User
{
  public void pay()
  {
     System.out.println("Silver User pay Method");
 }
  public void receive()
  {
    System.out.println("Silver User receive Method ");
}
}
public class Payment {

  public static void main(String [] args)
  {
    System.out.println("*************Gold User ****************");
        GoldUser g1=new GoldUser();
        g1.pay();
        g1.receive();
        System.out.println("********Silver User********");
        SilverUser s1=new SilverUser();
        s1.pay();
        s1.receive();
} 

}        

/*
| **Part / Component**                | **Type**          | **Description / Function**                                                                                                                                               |
| ----------------------------------- | ----------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `abstract class User`               | Abstract Class    | A base class that defines a **common structure** for all users. It contains two **abstract methods** (`pay()` and `receive()`) that must be implemented by any subclass. |
| `abstract void pay()`               | Abstract Method   | Declared inside the abstract class `User`. Subclasses must define their own version of this method to specify how the user pays.                                         |
| `abstract void receive()`           | Abstract Method   | Declared inside the abstract class `User`. Subclasses must define how the user receives payment.                                                                         |
| `class GoldUser extends User`       | Concrete Subclass | Inherits from `User` and **implements** the abstract methods `pay()` and `receive()`. Represents a Gold-type user.                                                       |
| `pay()` (in `GoldUser`)             | Method            | Prints `"Gold User pay Method"`. Shows the payment behavior for Gold users.                                                                                              |
| `receive()` (in `GoldUser`)         | Method            | Prints `"Gold User receive Method"`. Shows how Gold users receive payment.                                                                                               |
| `class SilverUser extends User`     | Concrete Subclass | Another subclass of `User`, implementing its abstract methods. Represents a Silver-type user.                                                                            |
| `pay()` (in `SilverUser`)           | Method            | Prints `"Silver User pay Method"`. Defines the payment behavior for Silver users.                                                                                        |
| `receive()` (in `SilverUser`)       | Method            | Prints `"Silver User receive Method"`. Defines how Silver users receive payment.                                                                                         |
| `public class Payment`              | Main Class        | Contains the `main()` method. Used to create objects and execute the program.                                                                                            |
| `main(String[] args)`               | Main Method       | Entry point of the program. Creates objects of `GoldUser` and `SilverUser`, and calls their methods.                                                                     |
| `GoldUser g1 = new GoldUser();`     | Object Creation   | Creates a `GoldUser` object to access its `pay()` and `receive()` methods.                                                                                               |
| `SilverUser s1 = new SilverUser();` | Object Creation   | Creates a `SilverUser` object to access its methods.                                                                                                                     |
| `System.out.println(...)`           | Output Statement  | Used to display messages on the console. Separates Gold and Silver user sections visually.                                                                               |
*/
 
