import java.util.*;

class Employee3 {
    String name;
    int age;
    String gender;
    Scanner ui = new Scanner(System.in);

    void getData() {
        System.out.println("Enter the name:");
        name = ui.next();
        
        System.out.println("Enter the age:");
        age = ui.nextInt();
        
        System.out.println("Enter the gender:");
        gender = ui.next();
    }

    void displayData() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
    }

    // Optionally add a method to close the Scanner
    void closeScanner() {
        ui.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee3 emp = new Employee3();
        emp.getData();
        emp.displayData();
        
        // Close the scanner
        emp.closeScanner();
    }
}

/*


| Component                                  | Description                                                                                             | Key OOP Concept(s)                   |
| :----------------------------------------- | :------------------------------------------------------------------------------------------------------ | :----------------------------------- |
| **`Employee3` Class**                      | The blueprint defining the structure for an employee record.                                            | **Class**, **Encapsulation**         |
| **Data Members** (`name`, `age`, `gender`) | Instance variables that hold the state (data) for each `Employee3` object.                              | **State**, **Data Hiding (Partial)** |
| **`Scanner ui`**                           | An instance of the `Scanner` class, used to read input from the standard input stream (`System.in`).    | **Resource Management**              |
| **`getData()` Method**                     | Prompts the user for input (Name, Age, Gender) via the console and populates the object's data members. | **Input/Output (I/O)**               |
| **`displayData()` Method**                 | Prints the current values stored in the object's data members to the console.                           | **Output**                           |
| **`closeScanner()` Method**                | Explicitly closes the `Scanner` object to release system resources.                                     | **Resource Management**              |
| **`Main` Class**                           | Contains the entry point (`main` method) for the Java application.                                      | **Program Entry Point**              |
| **`Employee3 emp = new Employee3();`**     | Creates a concrete **object** (an instance) named `emp` from the `Employee3` class blueprint.           | **Object Instantiation**             |
| **Method Calls** (`emp.getData()`, etc.)   | Invoking the behavior/actions associated with the specific `emp` object.                                | **Message Passing**                  |

---

### Summary of Concepts

| Concept                               | Explanation in Context                                                                                                                                                         |
| :------------------------------------ | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Object-Oriented Programming (OOP)** | The entire structure revolves around creating a self-contained unit (`Employee3`) that bundles data and the methods to operate on that data.                                   |
| **Encapsulation**                     | Attributes (`name`, `age`, `gender`) and methods (`getData`, `displayData`) are bundled within the `Employee3` class, creating a logical unit.                                 |
| **Resource Management**               | The explicit inclusion of `closeScanner()` highlights the good practice of closing external resources (like the `Scanner`) when they are finished being used to prevent leaks. |
*/
