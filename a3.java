import java.lang.*;
import java.util.*;
class Employee
{
 String name;
 int age;
 String gender;
 Scanner ui = new Scanner(System.in);
 void getData()
 {
 System.out.println("Enter the name");
 name = ui.next();
 System.out.println("Enter the age");
 age= ui.nextInt();
 System.out.println("Enter the gender");
 gender= ui.next();
 }
 void displayData()
 {
 System.out.println("Name :"+name); 
 System.out.println("age :"+age);
 System.out.println("gender :"+gender);
 }
}
public class a3
{
 public static void main(String args[])
 {
 System.out.println("JAVA CLASS AND METHODS");
 Employee e[] = new Employee[3];
 for(int i = 0;i<3;i++)
 e[i] = new Employee();
 for(int i = 0;i<3;i++)
 e[i].getData();
 for(int i = 0;i<3;i++)
 e[i].displayData();
 }

}

/*
| Concept                  | Meaning                                 | Example                               |
| ------------------------ | --------------------------------------- | ------------------------------------- |
| **Class**                | Template defining data and behavior     | `class Employee`                      |
| **Object**               | Instance of a class                     | `new Employee()`                      |
| **Array of Objects**     | Collection of class instances           | `Employee e[] = new Employee[3];`     |
| **Methods**              | Functions defined in a class            | `getData()`, `displayData()`          |
| **Encapsulation**        | Grouping variables and functions        | Inside `Employee` class               |
| **Scanner Class**        | Used to take input from user            | `Scanner ui = new Scanner(System.in)` |
| **for Loop**             | Iteration to process multiple employees | `for(int i = 0; i < 3; i++)`          |
| **System.out.println()** | Display output                          | Used throughout                       |
*/
