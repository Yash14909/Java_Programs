// User_Paymt_of_Au-Ag  ==  Non input java code (Abstract class ex)

abstract class User

{
    abstract void pay();
    abstract void receive();
}
class GoldUser extends User
{
public void pay()
{
System.out.println("Gold User pay Method");
}
public void receive()
{
 System.out.println("Gold User receive Method");
}
}
class SilverUser extends User
{
  public void pay()
  {
     System.out.println("Silver User pay Method");
 }
  public void receive()
  {
    System.out.println("Silver User receive Method ");
}
}
public class Payment {

  public static void main(String [] args)
  {
    System.out.println("*************Gold User ****************");
        GoldUser g1=new GoldUser();
        g1.pay();
        g1.receive();
        System.out.println("********Silver User********");
        SilverUser s1=new SilverUser();
        s1.pay();
        s1.receive();
} 

}        


 
