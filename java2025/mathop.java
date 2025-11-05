public class mathop {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + subtract(a, b));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return x / y;
    }

}

/*
| **Line / Part**                                                      | **Explanation**                                                                  |
| -------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| `public class mathop {`                                              | Declares a public class named `mathop`. All code is defined inside this class.   |
| `public static void main(String[] args) {`                           | The main method — starting point of program execution.                           |
| `int a = 10;`                                                        | Declares an integer variable `a` and assigns it the value 10.                    |
| `int b = 5;`                                                         | Declares an integer variable `b` and assigns it the value 5.                     |
| `System.out.println("Addition: " + add(a, b));`                      | Prints the result of the `add` method (adds `a` and `b`).                        |
| `System.out.println("Subtraction: " + subtract(a, b));`              | Prints the result of the `subtract` method (subtracts `b` from `a`).             |
| `System.out.println("Multiplication: " + multiply(a, b));`           | Prints the result of the `multiply` method (multiplies `a` and `b`).             |
| `System.out.println("Division: " + divide(a, b));`                   | Prints the result of the `divide` method (divides `a` by `b`).                   |
| `public static int add(int x, int y)`                                | Declares a static method `add` that returns the sum of two integers.             |
| `return x + y;`                                                      | Returns the result of addition.                                                  |
| `public static int subtract(int x, int y)`                           | Declares a static method `subtract` that returns the difference of two integers. |
| `return x - y;`                                                      | Returns the result of subtraction.                                               |
| `public static int multiply(int x, int y)`                           | Declares a static method `multiply` that returns the product of two integers.    |
| `return x * y;`                                                      | Returns the result of multiplication.                                            |
| `public static int divide(int x, int y)`                             | Declares a static method `divide` that returns the quotient of two integers.     |
| `if (y == 0)`                                                        | Checks if the divisor `y` is zero to prevent division by zero.                   |
| `throw new ArithmeticException("Division by zero is not allowed.");` | Throws an exception if the divisor is zero.                                      |
| `return x / y;`                                                      | Returns the result of division.                                                  |
| `}`                                                                  | Closes the methods and the class.                                                |
*/
