import java.lang.*;
abstract class Car
{
 abstract void start();
 abstract void stop();
}
interface SportsCar
{
 void display();
}
interface CommercialCar
{
 void showDetails();
}
class Santro extends Car implements CommercialCar
{
 public void start()
 {
 System.out.println("Santro car start");
 }
 public void stop()
 {
 System.out.println("Santro car stop");
 }
 public void showDetails()
 {
 System.out.println("Commercial Car");
 }
}
class Audi extends Car implements SportsCar
{
 public void start()
 {
 System.out.println("Audi car start");
 }
 public void stop()
 {
 System.out.println("Audi car stop");
 }
 public void display()
 {
 System.out.println("Sports Car");
 }
}
public class Program10
{
 public static void main(String []args)
 {
 System.out.println("******* Santro ***********");
 Santro s1 = new Santro();
 s1.start();
 s1.stop();
 s1.showDetails();
 System.out.println("\n--------------------------------\n");
 System.out.println("******* Audi ***********");
 Audi a1 = new Audi();
 a1.start();
 a1.stop();
 a1.display();
 }
}
