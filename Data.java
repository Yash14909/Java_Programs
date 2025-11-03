//  Obj-List-Example 
   
import java.util.*;
class Model
{
String Name;
String Email;
Long phone;
public Model (String Name,String Email,Long phone)
{
   this.Name=Name;
   this.Email=Email;
   this.phone=phone;
}
@Override
public String toString()
{
    return this.Name + "," + this.Email + "," + this.phone;
    }
}
public class Data
{
   public static void main (String [] args)
     {
        List<Model> list = new ArrayList<>();
        System.out.println("Before adding the data to the list ");
        System.out.println("Size of the list=" +list.size());
        System.out.println("List data=" + list);
        String Name = "GitHub";
        String Email = "github_39@gmail.com";
        Long phone = Long.valueOf (String.valueOf (1234567890));
        list.add(new Model(Name,Email,phone));
        System.out.println("\nAfter adding data to the list.....");
        System.out.println("Size of list=" + list.size());
        System.out.println("List data=" + list.get(0).toString());
  }
}

/*
| **Part / Line** | **Code Snippet**                                            | **Explanation**                                                                   |
| --------------- | ----------------------------------------------------------- | --------------------------------------------------------------------------------- |
| 1               | `import java.util.*;`                                       | Imports all utility classes from `java.util` package (e.g., `List`, `ArrayList`). |
| 2               | `class Model`                                               | Defines a custom class named `Model` to store data (Name, Email, Phone).          |
| 3               | `String Name; String Email; Long phone;`                    | Declares three instance variables for storing model data.                         |
| 4               | `public Model(String Name, String Email, Long phone)`       | Constructor — used to initialize object values when created.                      |
| 5               | `this.Name = Name; this.Email = Email; this.phone = phone;` | `this` keyword assigns constructor parameters to instance variables.              |
| 6               | `@Override public String toString()`                        | Overrides the default `toString()` method to define how the object is printed.    |
| 7               | `return this.Name + "," + this.Email + "," + this.phone;`   | Returns a string combining all the field values for display.                      |
| 8               | `public class Data`                                         | Main class containing the `main()` method to execute the program.                 |
| 9               | `List<Model> list = new ArrayList<>();`                     | Creates an empty `ArrayList` to store `Model` objects.                            |
| 10              | `System.out.println("Before adding the data...");`          | Prints initial information before adding data.                                    |
| 11              | `list.size()`                                               | Returns number of elements in the list (initially `0`).                           |
| 12              | `list`                                                      | Displays the list contents (initially empty `[]`).                                |
| 13              | `String Name = "GitHub";`                                   | Declares and initializes a variable for name.                                     |
| 14              | `String Email = "github_39@gmail.com";`                     | Declares and initializes a variable for email.                                    |
| 15              | `Long phone = Long.valueOf(String.valueOf(1234567890));`    | Converts a numeric value to `Long` type.                                          |
| 16              | `list.add(new Model(Name, Email, phone));`                  | Creates a new `Model` object and adds it to the list.                             |
| 17              | `System.out.println("After adding data...");`               | Prints message after adding object.                                               |
| 18              | `list.size()`                                               | Displays updated list size (now `1`).                                             |
| 19              | `list.get(0).toString()`                                    | Accesses the first object and displays its details using the `toString()` method. |
*/



