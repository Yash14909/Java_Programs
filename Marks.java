import java.util.Scanner;

class Student {
    int rno, phy, chem, maths, tot;

    Student(int r, int p, int c, int m) {
        rno = r;
        phy = p;
        chem = c;
        maths = m;
    }

    void show() {
        tot = phy + chem + maths;
        System.out.println("Total marks obtained by Rollno " + rno + " is " + tot);
    }
}

public class Marks {
    public static void main(String args[]) {
        Student s = new Student(1, 70, 80, 90);
        s.show();
    }
}

/*
| **Line / Section**                                                            | **Code / Concept**     | **Description / Explanation**                                                                                        |
| ----------------------------------------------------------------------------- | ---------------------- | -------------------------------------------------------------------------------------------------------------------- |
| `import java.util.Scanner;`                                                   | Import Statement       | Imports the **Scanner** class (not used here, but can be used for user input).                                       |
| `class Student {`                                                             | Class Declaration      | Defines a class named **Student** that stores and processes student data.                                            |
| `int rno, phy, chem, maths, tot;`                                             | Variable Declarations  | Declares integer variables for **roll number**, **marks in physics**, **chemistry**, **maths**, and **total marks**. |
| `Student(int r, int p, int c, int m)`                                         | Constructor            | Initializes a **Student** object with given values for roll number and marks.                                        |
| `rno = r;`                                                                    | Assignment             | Stores the passed roll number in the class variable **rno**.                                                         |
| `phy = p; chem = c; maths = m;`                                               | Assignments            | Stores marks in physics, chemistry, and maths.                                                                       |
| `void show()`                                                                 | Method Definition      | Defines a method **show()** to calculate and display the total marks.                                                |
| `tot = phy + chem + maths;`                                                   | Calculation            | Adds the marks of three subjects to find the total.                                                                  |
| `System.out.println("Total marks obtained by Rollno " + rno + " is " + tot);` | Output Statement       | Displays the student’s roll number and total marks on the console.                                                   |
| `}`                                                                           | End of Student Class   | Ends the definition of the **Student** class.                                                                        |
| `public class Marks {`                                                          | Main Class Declaration | Defines the **main** class containing the program’s entry point.                                                     |
| `public static void main(String args[])`                                      | Main Method            | Starting point of the Java program.                                                                                  |
| `Student s = new Student(1, 70, 80, 90);`                                     | Object Creation        | Creates a **Student** object with roll number 1 and marks in three subjects.                                         |
| `s.show();`                                                                   | Method Call            | Calls the **show()** method to display total marks.                                                                  |
| `}`                                                                           | End of Main Class      | Closes the **P26** class.                                                                                            |
*/
