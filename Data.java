//  Obj-List-Example 
   
import java.util.*;
class Model
{
String Name;
String Email;
Long phone;
public Model (String Name,String Email,Long phone)
{
   this.Name=Name;
   this.Email=Email;
   this.phone=phone;
}
@Override
public String toString()
{
    return this.Name + "," + this.Email + "," + this.phone;
    }
}
public class Data
{
   public static void main (String [] args)
     {
        List<Model> list = new ArrayList<>();
        System.out.println("Before adding the data to the list ");
        System.out.println("Size of the list=" +list.size());
        System.out.println("List data=" + list);
        String Name = "GitHub";
        String Email = "github_39@gmail.com";
        Long phone = Long.valueOf (String.valueOf (1234567890));
        list.add(new Model(Name,Email,phone));
        System.out.println("\nAfter adding data to the list.....");
        System.out.println("Size of list=" + list.size());
        System.out.println("List data=" + list.get(0).toString());
  }
}




