import java.lang.*;
import java.util.*;

class MathDemo {
    void square(int x) {
        System.out.println("Square is " + (x * x));
    }
    
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }
}

public class c3 {
    public static void main(String[] args) {
        MathDemo md = new MathDemo();
        
        // Call square with an integer argument
        md.square(5);
        
        // Call add with two integer arguments
        md.add(10, 20);
    }
}
