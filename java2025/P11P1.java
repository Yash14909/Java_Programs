import java.lang.*;
import java.util.*;
interface CE
{
 void call();
 void sms();
}
interface ISO
{
 void radiation();
 void sound();
}
class IPhone implements CE, ISO
{
 public void call()
 {
 System.out.println("IPhone call");
 }
 public void sms()
 {
 System.out.println("IPhone sms");
 }
 public void radiation()
 {
 System.out.println("IPhone radiation");
 }
 public void sound()
 {
 System.out.println("IPhone sound");
 }
}
class Galaxy implements CE, ISO
{
 public void call()
 {
 System.out.println("Galaxy call");
 }
 
 public void sms()
 {
 System.out.println("Galaxy sms");
 }
 
 public void radiation()
 {
 System.out.println("Galaxy radiation");
 }
 
 public void sound()
 {
 System.out.println("Galaxy sound");
 }
}
public class P11P1
{
 public static void main(String[] args)
 {
 System.out.println("******* IPhone ***********");
 IPhone i1 = new IPhone();
 i1.call();
 i1.sms();
 i1.radiation();
 i1.sound();
 System.out.println("\n--------------------------------\n");
 System.out.println("******* Galaxy ***********");
 Galaxy g1 = new Galaxy();
 g1.call();
 g1.sms();
 g1.radiation();
 g1.sound();;
 
 }
}