import java.util.*;
class model 
{
 String Name;
 String Email;
 Long phone; 
 public model(String Name, String Email, Long phone)
 {
this.Name = Name;
this.Email = Email;
this.phone = phone;
 } 
 public String toString()
 {
 return this.Name + ", " + this.Email + ", " + this.phone;
 }
}
public class P14P1
{
 public static void main(String[] args)
 {
List<model> list = new ArrayList<model>();
System.out.println("Before adding data to list......");
System.out.println("Size of list = " + list.size());
System.out.println("List data = " + list.toString());
String Name = "Tom";
 String Email = "tom@gmail.com";
 Long phone = Long.valueOf(String.valueOf(9988776655L)); 
 
list.add(new model(Name, Email, phone));
System.out.println("\nAfter adding data to list......");
System.out.println("Size of list = " + list.size());
System.out.println("List data = " + list.get(0).toString());
 }
}
