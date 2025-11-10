//Write a java class to print Fibonacci series till 100
import java.lang.*;
import java.util.*;

class fibonacci
{
public static void main(String args[]) throws Exception
{
System.out.println("JAVA Fibonacci Series");
int f1=0,f2=1,f3,n,i;
Scanner in = new Scanner(System.in);

/*System.out.print("Enter the Number of Terms");
n=in.nextInt();*/
for(i=1;i<=10;i++)
{

/* if(i==1)
      f3=0;
 else
   if(i==2)
       f3=1;
   else
       f3=f1+f2;
*/
//f3=i<3?1:f1+f2;  old
  f3=i<3?(i==1?0:1):(f1+f2);
System.out.print(+f3+" ");
    f1=f2;
    f2=f3;
       }
    }

 }

