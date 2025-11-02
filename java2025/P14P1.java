import java.util.*;
class model 
{
 String Name;
 String Email;
 Long phone; 
 public model(String Name, String Email, Long phone)
 {
this.Name = Name;
this.Email = Email;
this.phone = phone;
 } 
 public String toString()
 {
 return this.Name + ", " + this.Email + ", " + this.phone;
 }
}
public class P14P1
{
 public static void main(String[] args)
 {
List<model> list = new ArrayList<model>();
System.out.println("Before adding data to list......");
System.out.println("Size of list = " + list.size());
System.out.println("List data = " + list.toString());
String Name = "Tom";
 String Email = "tom@gmail.com";
 Long phone = Long.valueOf(String.valueOf(9988776655L)); 
 
list.add(new model(Name, Email, phone));
System.out.println("\nAfter adding data to list......");
System.out.println("Size of list = " + list.size());
System.out.println("List data = " + list.get(0).toString());
 }
}

/*
| **Line / Section** | **Code / Element**                                             | **Description / Function**                                                                                                                                                                              |
| ------------------ | -------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1                  | `import java.util.*;`                                          | Imports all classes from the `java.util` package (used here for `List` and `ArrayList`).                                                                                                                |
| 2                  | `class model`                                                  | Defines a custom class named `model` to represent an object with `Name`, `Email`, and `phone` fields.                                                                                                   |
| 3                  | `String Name;`                                                 | Declares an instance variable to store the person's name.                                                                                                                                               |
| 4                  | `String Email;`                                                | Declares an instance variable to store the person's email address.                                                                                                                                      |
| 5                  | `Long phone;`                                                  | Declares an instance variable to store the phone number as a `Long`.                                                                                                                                    |
| 6–10               | `public model(String Name, String Email, Long phone)`          | **Constructor:** Initializes the `model` object with the given name, email, and phone number.                                                                                                           |
| 11–14              | `public String toString()`                                     | **Method override:** Returns a string representation of the object (used when printing the object).                                                                                                     |
| 16                 | `public class P14P1`                                           | Declares the main public class `P14P1`, which contains the `main` method.                                                                                                                               |
| 17                 | `public static void main(String[] args)`                       | The program’s entry point — execution starts here.                                                                                                                                                      |
| 18                 | `List<model> list = new ArrayList<model>();`                   | Creates an empty `ArrayList` that will hold `model` objects.                                                                                                                                            |
| 19                 | `System.out.println("Before adding data to list......");`      | Prints a message before adding data.                                                                                                                                                                    |
| 20                 | `System.out.println("Size of list = " + list.size());`         | Displays the current size of the list (initially `0`).                                                                                                                                                  |
| 21                 | `System.out.println("List data = " + list.toString());`        | Displays the contents of the list (initially empty).                                                                                                                                                    |
| 22                 | `String Name = "Tom";`                                         | Declares and assigns a string variable for name.                                                                                                                                                        |
| 23                 | `String Email = "tom@gmail.com";`                              | Declares and assigns a string variable for email.                                                                                                                                                       |
| 24                 | `Long phone = Long.valueOf(String.valueOf(9988776655L));`      | Creates a `Long` value for the phone number.                                                                                                                                                            |
| 26                 | `list.add(new model(Name, Email, phone));`                     | Creates a new `model` object and adds it to the list.                                                                                                                                                   |
| 27                 | `System.out.println("\nAfter adding data to list......");`     | Prints a message after adding data.                                                                                                                                                                     |
| 28                 | `System.out.println("Size of list = " + list.size());`         | Displays the list size after adding one object (now `1`).                                                                                                                                               |
| 29                 | `System.out.println("List data = " + list.get(0).toString());` | Retrieves and prints the data of the first object using its `toString()` method.                                                                                                                        |
| —                  | **Output Example:**                                            | Before adding data to list......<br>Size of list = 0<br>List data = []<br><br>After adding data to list......<br>Size of list = 1<br>List data = Tom, [tom@gmail.com](mailto:tom@gmail.com), 9988776655 |
*/
