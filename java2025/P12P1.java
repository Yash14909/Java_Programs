import java.util.Scanner;
class AgeException extends Exception 
{
 public AgeException(String str) 
 {
 System.out.println(str);
 }
}
public class P12P1 
{
 public static void main(String[] args) 
 {
 Scanner s = new Scanner(System.in);
 System.out.print("Enter ur age : ");
 int age = s.nextInt();
 try 
 {
 if(age < 18) 
 throw new AgeException("Invalid age");
 else
 System.out.println("Valid age");
 }
 catch (AgeException a) 
 {
 System.out.println(a);
 }
 }
}

/*
| **Concept / Element**                                  | **Code Reference**                        | **Description / Explanation**                                                                                                                                                            |
| ------------------------------------------------------ | ----------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Package Import**                                     | `import java.util.Scanner;`               | Imports the `Scanner` class from the `java.util` package, used to take input from the user (keyboard).                                                                                   |
| **Custom Exception Class**                             | `class AgeException extends Exception`    | Defines a **user-defined exception** by extending the built-in `Exception` class. This allows creation of a specific exception type (`AgeException`).                                    |
| **Constructor in Exception Class**                     | `public AgeException(String str)`         | A constructor that accepts a message string (`str`) and prints it when the exception object is created.                                                                                  |
| **Superclass Constructor Call (Optional Alternative)** | `super(str);` *(not used here)*           | Normally, we use `super(str)` to pass the message to the base `Exception` class instead of printing directly. (Printing in constructor works but is less ideal practice.)                |
| **Main Class**                                         | `public class P12P1`                      | Declares the main class containing the `main()` method — the program entry point.                                                                                                        |
| **Scanner Object Creation**                            | `Scanner s = new Scanner(System.in);`     | Creates a `Scanner` object `s` to read input from the standard input stream (`System.in`).                                                                                               |
| **Prompt for Input**                                   | `System.out.print("Enter ur age : ");`    | Displays a message asking the user to enter their age.                                                                                                                                   |
| **Input Reading**                                      | `int age = s.nextInt();`                  | Reads an integer value from user input and stores it in variable `age`.                                                                                                                  |
| **Try Block**                                          | `try { ... }`                             | Contains code that may throw an exception. Any exception thrown here will be caught in the `catch` block.                                                                                |
| **Throw Statement**                                    | `throw new AgeException("Invalid age");`  | Manually throws a new `AgeException` object when the condition `age < 18` is true.                                                                                                       |
| **Conditional Check**                                  | `if(age < 18)`                            | Checks if the entered age is less than 18. If so, it’s considered invalid.                                                                                                               |
| **Valid Case Output**                                  | `System.out.println("Valid age");`        | Prints this message if age is 18 or older.                                                                                                                                               |
| **Catch Block**                                        | `catch (AgeException a)`                  | Catches the `AgeException` object thrown in the try block. Prevents the program from crashing.                                                                                           |
| **Printing Exception**                                 | `System.out.println(a);`                  | Prints the exception object — by default, it displays the class name + message (if provided using `super(str)`). In this code, since we printed inside the constructor, it prints twice. |
| **Program Flow**                                       | Input → Validation → Exception or Success | The user enters age → program checks it → throws exception if invalid, else prints “Valid age.”                                                                                          |
*/

