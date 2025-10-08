import java.lang.*;
import java.util.*;
class WhileDemo
{
void display(int i)
{
System.out.println("Displaying Numbers from 1 to 15...");
do
{
System.out.println(i);
i++;
}
while(i<15);
}
}
class FibonacciDemo
{
void fibonacci(int f1, int f2, int f3, int i)
{
System.out.println("Displaying Fibonacci Series...");
for(i=1;i<=10;i++)
{
f3=i<3?1:f1+f2;
System.out.println(+f3+"");
f1=f2;
f2=f3;
}
}
}
public class a4
{
public static void main(String args[]) 
{
WhileDemo wd=new WhileDemo();
FibonacciDemo fb=new FibonacciDemo();
wd.display(1);
fb.fibonacci(1,1,0,1);
}
}