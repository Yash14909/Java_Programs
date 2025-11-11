import java.lang.*;
import java.io.*;
class armstrong
{
public static void main(String args[]) throws Exception
{
System.out.println("JAVA Check whether no is Armstrong or not");
int n,d,temp;
double sum=0;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the Number");
n=Integer.parseInt(in.readLine());
temp=n;
do
{
d=n%10;
sum=sum+Math.pow(d,3);
n=n/10;
}
while (n!=0);
if(sum==temp)
System.out.println(temp+" Is Armstrong");
else
System.out.println(temp+" Is Not Armstrong");
}
}  

/*
| **Line / Section** | **Code / Concept**                                                 | **Description**                                                                                         |
| ------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------- |
| 1                  | `import java.lang.*;`                                              | Imports the Java core language package (automatically imported by default).                             |
| 2                  | `import java.io.*;`                                                | Imports Java’s input/output classes — here used for `DataInputStream`.                                  |
| 3                  | `class armstrong`                                                  | Declares a class named `armstrong`. Java programs start execution from a class containing `main()`.     |
| 4                  | `public static void main(String args[]) throws Exception`          | Main method — entry point of the program. `throws Exception` allows handling input/output exceptions.   |
| 5                  | `System.out.println("JAVA Check whether no is Armstrong or not");` | Prints a message indicating the purpose of the program.                                                 |
| 6                  | `int n, d, temp;`                                                  | Declares integer variables — `n` for input number, `d` for digit, and `temp` for storing a copy of `n`. |
| 7                  | `double sum = 0;`                                                  | Initializes `sum` to store the sum of cubes of digits.                                                  |
| 8                  | `DataInputStream in = new DataInputStream(System.in);`             | Creates a stream object to take user input from the keyboard.                                           |
| 9                  | `System.out.println("Enter the Number");`                          | Prompts the user to enter a number.                                                                     |
| 10                 | `n = Integer.parseInt(in.readLine());`                             | Reads the input as a string and converts it to an integer.                                              |
| 11                 | `temp = n;`                                                        | Stores the original value of `n` in `temp` for later comparison.                                        |
| 12–16              | `do { ... } while (n != 0);`                                       | A loop that extracts each digit and computes the cube of each digit until the number becomes 0.         |
| 13                 | `d = n % 10;`                                                      | Gets the last digit of the number.                                                                      |
| 14                 | `sum = sum + Math.pow(d, 3);`                                      | Adds the cube of the digit to `sum`.                                                                    |
| 15                 | `n = n / 10;`                                                      | Removes the last digit from the number.                                                                 |
| 17–20              | `if (sum == temp) ... else ...`                                    | Compares `sum` (sum of cubes of digits) with the original number `temp`.                                |
| 18                 | `System.out.println(temp + " Is Armstrong");`                      | Prints that the number **is an Armstrong number** if the condition is true.                             |
| 20                 | `System.out.println(temp + " Is Not Armstrong");`                  | Prints that the number **is not an Armstrong number** if the condition is false.                        |
*/
