import java.util.Scanner;

class SwapCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input two characters
        System.out.print("Enter the first character: ");
        char ch1 = in.next().charAt(0); // Reads the first character

        System.out.print("Enter the second character: ");
        char ch2 = in.next().charAt(0); // Reads the second character

        // Display before swapping
        System.out.println("\nBefore Swapping:");
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);

        // Swap using a temporary variable
        char temp = ch1;
        ch1 = ch2;
        ch2 = temp;

        // Display after swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
    }
}

/*
| **Line / Section** | **Code / Element**                                  | **Description / Function**                                                                            |
| ------------------ | --------------------------------------------------- | ----------------------------------------------------------------------------------------------------- |
| 1                  | `import java.util.Scanner;`                         | Imports the `Scanner` class from the `java.util` package for taking user input.                       |
| 2                  | `class SwapCharacters`                              | Declares a class named `SwapCharacters`.                                                              |
| 3                  | `public static void main(String[] args)`            | Main method — the entry point of the Java program.                                                    |
| 4                  | `Scanner in = new Scanner(System.in);`              | Creates a `Scanner` object `in` to read input from the keyboard.                                      |
| 6                  | `System.out.print("Enter the first character: ");`  | Prompts the user to enter the first character.                                                        |
| 7                  | `char ch1 = in.next().charAt(0);`                   | Reads the first input token (word) from the user and takes its first character using `charAt(0)`.     |
| 9                  | `System.out.print("Enter the second character: ");` | Prompts the user to enter the second character.                                                       |
| 10                 | `char ch2 = in.next().charAt(0);`                   | Reads the second input token and takes its first character.                                           |
| 12                 | `System.out.println("\nBefore Swapping:");`         | Prints a heading before showing the original character values.                                        |
| 13                 | `System.out.println("ch1 = " + ch1);`               | Displays the value of the first character before swapping.                                            |
| 14                 | `System.out.println("ch2 = " + ch2);`               | Displays the value of the second character before swapping.                                           |
| 17                 | `char temp = ch1;`                                  | Declares a temporary variable `temp` and assigns the value of `ch1` to it — used to help in swapping. |
| 18                 | `ch1 = ch2;`                                        | Assigns the value of `ch2` to `ch1`.                                                                  |
| 19                 | `ch2 = temp;`                                       | Assigns the value stored in `temp` (original `ch1`) to `ch2`, completing the swap.                    |
| 22                 | `System.out.println("\nAfter Swapping:");`          | Prints a heading for swapped values.                                                                  |
| 23                 | `System.out.println("ch1 = " + ch1);`               | Displays the new value of `ch1` after swapping.                                                       |
| 24                 | `System.out.println("ch2 = " + ch2);`               | Displays the new value of `ch2` after swapping.                                                       |
*/
