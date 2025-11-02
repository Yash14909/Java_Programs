import java.util.Scanner;

class Square {
    public static void main(String args[]) {
        System.out.println("JAVA IF NUMBER IS EVEN THEN PRINT ITS SQUARE & IF NUMBER IS ODD THEN PRINT ITS CUBE");
        int no;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number");
        no = in.nextInt();

        if (no % 2 == 0) {
            System.out.println("The number is even. Square is " + (no * no));
        } else {
            System.out.println("The number is odd. Cube is " + (no * no * no));
        }
    }
}

/*
| **Line / Section** | **Code / Element**                                                                                           | **Description / Function**                                                                |
| ------------------ | ------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------------------------------------------- |
| 1                  | `import java.util.Scanner;`                                                                                  | Imports the `Scanner` class from the `java.util` package to take user input.              |
| 2                  | `class Square`                                                                                               | Declares a public class named `Square`.                                                   |
| 3                  | `public static void main(String args[])`                                                                     | The main method — entry point of the program.                                             |
| 4                  | `System.out.println("JAVA IF NUMBER IS EVEN THEN PRINT ITS SQUARE & IF NUMBER IS ODD THEN PRINT ITS CUBE");` | Displays a message explaining what the program does.                                      |
| 5                  | `int no;`                                                                                                    | Declares an integer variable `no` to store the user input.                                |
| 6                  | `Scanner in = new Scanner(System.in);`                                                                       | Creates a `Scanner` object `in` to read input from the user (keyboard).                   |
| 7                  | `System.out.println("Enter the Number");`                                                                    | Prompts the user to enter a number.                                                       |
| 8                  | `no = in.nextInt();`                                                                                         | Reads an integer input from the user and stores it in the variable `no`.                  |
| 9–13               | `if (no % 2 == 0) { ... } else { ... }`                                                                      | Conditional structure to check whether the number is even or odd.                         |
| 10                 | `if (no % 2 == 0)`                                                                                           | Checks if the remainder when dividing `no` by 2 is zero — meaning the number is **even**. |
| 11                 | `System.out.println("The number is even. Square is " + (no * no));`                                          | If the number is even, prints its **square**.                                             |
| 12                 | `else`                                                                                                       | Executes the next block if the number is **odd**.                                         |
| 13                 | `System.out.println("The number is odd. Cube is " + (no * no * no));`                                        | If the number is odd, prints its **cube**.                                                |
*/

