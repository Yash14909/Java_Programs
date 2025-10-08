import java.lang.*;
import java.io.*;
class armstrong
{
public static void main(String args[]) throws Exception
{
System.out.println("JAVA Check whether no is Armstrong or not");
int n,d,temp;
double sum=0;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter the Number");
n=Integer.parseInt(in.readLine());
temp=n;
do
{
d=n%10;
sum=sum+Math.pow(d,3);
n=n/10;
}
while (n!=0);
if(sum==temp)
System.out.println(temp+" Is Armstrong");
else
System.out.println(temp+" Is Not Armstrong");
}
}
