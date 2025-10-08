import java.lang.*;
class Rectangle
{
  int length,breadth;
void getdata(int x,int y)
  {
     length=x;
     breadth=y;
   }
   int rectarea()
   {
      int area;
      area=length*breadth;
      return(area);
    }
}

public class p17
{
  public static void main(String args[])
   {
      int a1,a2;
      Rectangle r1=new Rectangle();
      Rectangle r2=new Rectangle();
 
      r1.length=10;
      r2.breadth=20;
      a1=r1.length*r1.breadth;
      
      r2.getdata(20,30);
      a2=r2.rectarea();
 
      System.out.println("Area is"+a1);
      System.out.println("Area is"+a2);
      }
}
