import java.lang.*;
import java.util.*;
import java.io.*;
import java.util.Scanner;
class pattern
{
 public static void main(String[] args) 
 {
 System.out.println("JAVA PATTERN PRINTING");
 int rows=5; 
 System.out.println("Here is your pattern....!!!"); 
 for (int i = rows; i >= 1; i--) 
 {
 for (int j = 1; j <= i; j++)
 {
 System.out.print(j+" ");
 } 
 System.out.println();
 }
 }
}