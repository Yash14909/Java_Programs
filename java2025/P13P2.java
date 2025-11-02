
import java.util.Scanner;
public class P13P2
{
 public static void main(String[] args)
 {
String time = "01:23:45 PM";
String timeArray[] = time.split(" ");
String onlyTime = timeArray[0];
String ampm = timeArray[1];
String onlyTimeArray[] = onlyTime.split(":");
int hours = Integer.parseInt(onlyTimeArray[0]);
int minutes = Integer.parseInt(onlyTimeArray[1]);
int seconds = Integer.parseInt(onlyTimeArray[2]);
System.out.println("Time : " + time);
System.out.println("\nhours : " + hours);
System.out.println("minutes : " + minutes);
System.out.println("seconds : " + seconds);
System.out.println("AM or PM : " + ampm);
 }

}

/*
| **Line / Section** | **Code / Element**                                  | **Description / Function**                                                                               |
| ------------------ | --------------------------------------------------- | -------------------------------------------------------------------------------------------------------- |
| 1                  | `import java.util.Scanner;`                         | Imports the `Scanner` class (not used in this program, but generally for user input).                    |
| 2                  | `public class P13P2`                                | Declares a public class named `P13P2`. The class name must match the filename.                           |
| 3                  | `public static void main(String[] args)`            | Main method — entry point of the Java program.                                                           |
| 4                  | `String time = "01:23:45 PM";`                      | Declares and initializes a string variable `time` with a time value in 12-hour format.                   |
| 5                  | `String timeArray[] = time.split(" ");`             | Splits the string into two parts — time (`"01:23:45"`) and AM/PM (`"PM"`), using space as the delimiter. |
| 6                  | `String onlyTime = timeArray[0];`                   | Stores only the `"01:23:45"` part of the time.                                                           |
| 7                  | `String ampm = timeArray[1];`                       | Stores the `"PM"` part of the time separately.                                                           |
| 8                  | `String onlyTimeArray[] = onlyTime.split(":");`     | Splits `"01:23:45"` into three parts — hours, minutes, and seconds — using colon (`:`) as the delimiter. |
| 9                  | `int hours = Integer.parseInt(onlyTimeArray[0]);`   | Converts the hour part (`"01"`) from string to integer.                                                  |
| 10                 | `int minutes = Integer.parseInt(onlyTimeArray[1]);` | Converts the minute part (`"23"`) from string to integer.                                                |
| 11                 | `int seconds = Integer.parseInt(onlyTimeArray[2]);` | Converts the second part (`"45"`) from string to integer.                                                |
| 12                 | `System.out.println("Time : " + time);`             | Displays the original time string.                                                                       |
| 13                 | `System.out.println("\nhours : " + hours);`         | Prints the hour value. The `\n` moves to a new line.                                                     |
| 14                 | `System.out.println("minutes : " + minutes);`       | Prints the minute value.                                                                                 |
| 15                 | `System.out.println("seconds : " + seconds);`       | Prints the second value.                                                                                 |
| 16                 | `System.out.println("AM or PM : " + ampm);`         | Prints whether it is AM or PM.                                                                           |
| —                  | **Output Example:**                                 | Time : 01:23:45 PM<br>hours : 1<br>minutes : 23<br>seconds : 45<br>AM or PM : PM                         |
*/
