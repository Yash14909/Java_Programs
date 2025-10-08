
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