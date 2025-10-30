import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n, num = 1, c, d;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of rows of Floyd's triangle you want:");
        n = in.nextInt();

        System.out.println("Floyd's triangle:");

        for (c = 1; c <= n; c++) {
            for (d = 1; d <= c; d++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

/*
| **Component**                                    | **Description**                                                                                                           | **Key Concept(s)**                               |
| :----------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------ | :----------------------------------------------- |
| **`import java.util.Scanner;`**                  | Imports the `Scanner` class from Java’s utility package to allow user input from the console.                             | **Package Import**, **User Input Handling**      |
| **`public class FloydTriangle`**                 | Declares a public class named `FloydTriangle`, which serves as the blueprint for this program.                            | **Class Declaration**, **Encapsulation**         |
| **`public static void main(String[] args)`**     | The entry point of the program — execution starts here.                                                                   | **Main Method**, **Program Entry Point**         |
| **`int n, num = 1, c, d;`**                      | Declares integer variables — `n` for the number of rows, `num` for the next number to print, and loop counters `c` & `d`. | **Variable Declaration**, **Initialization**     |
| **`Scanner in = new Scanner(System.in);`**       | Creates a `Scanner` object named `in` to read input from the keyboard.                                                    | **Object Creation**, **User Input**              |
| **`System.out.println("Enter the number...");`** | Prompts the user to enter how many rows of Floyd’s triangle to display.                                                   | **Console Output**, **User Interaction**         |
| **`n = in.nextInt();`**                          | Reads an integer input from the user and stores it in variable `n`.                                                       | **Input Handling**, **Assignment**               |
| **`System.out.println("Floyd's triangle:");`**   | Displays a message before printing the pattern.                                                                           | **Output Statement**                             |
| **Outer Loop (`for (c = 1; c <= n; c++)`)**      | Controls the number of rows to be printed in Floyd’s Triangle.                                                            | **Looping (Iteration)**                          |
| **Inner Loop (`for (d = 1; d <= c; d++)`)**      | Prints numbers in each row; increases numbers sequentially.                                                               | **Nested Loop**, **Pattern Generation**          |
| **`System.out.print(num + " ");`**               | Prints the current number with a space, staying on the same line.                                                         | **Console Output**, **String Concatenation**     |
| **`num++;`**                                     | Increments the number to print the next integer in sequence.                                                              | **Increment Operator**, **Sequential Numbering** |
| **`System.out.println();`**                      | Moves to the next line after finishing one row of the triangle.                                                           | **Output Formatting**, **Line Break**            |
| **`}` (End of Loops and Class)**                 | Marks the end of the loop blocks and the class definition.                                                                | **Program Structure**, **Syntax Closure**        |
*/

