import java.lang.*;

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

class OverrideTest3 {
    public static void main(String args[]) {
        B subob = new B(1, 2, 3);
        subob.show();
    }
}

/*
| **Component**                            | **Description**                                                                                                       | **Key Concept(s)**                                           |
| :--------------------------------------- | :-------------------------------------------------------------------------------------------------------------------- | :----------------------------------------------------------- |
| **`import java.lang.*;`**                | Imports Java’s core language package (automatically included by default).                                             | **Package Import**                                           |
| **`class A`**                            | The **base (parent/super) class** that defines two integer variables and methods related to them.                     | **Class Declaration**, **Encapsulation**                     |
| **Data Members (`int i, j`)**            | Variables that store state or data for each object of class `A`.                                                      | **Instance Variables**, **Encapsulation**                    |
| **Constructor `A(int a, int b)`**        | Initializes the variables `i` and `j` when an object of class `A` (or subclass) is created.                           | **Parameterized Constructor**, **Constructor Overloading**   |
| **`void show()` (in Class A)**           | Displays the values of `i` and `j`.                                                                                   | **Method Definition**, **Encapsulation**                     |
| **`class B extends A`**                  | Declares class `B` as a **subclass** of `A`, inheriting all its members (variables and methods).                      | **Inheritance (extends)**                                    |
| **Data Member (`int k`)**                | Adds an extra variable specific to class `B`.                                                                         | **Extension of Class Functionality**                         |
| **Constructor `B(int a, int b, int c)`** | Calls the superclass constructor using `super(a, b)` to initialize `i` and `j`, and initializes its own variable `k`. | **Constructor Chaining**, **super Keyword**, **Inheritance** |
| **`void show()` (in Class B)**           | Overrides the `show()` method from class `A` and adds extra functionality to display `k`.                             | **Method Overriding**, **Polymorphism**                      |
| **`super.show();`**                      | Calls the parent class (`A`) version of the `show()` method.                                                          | **super Keyword**, **Reusability**                           |
| **`class OverrideTest3`**                | The **driver class** containing the `main()` method — where program execution begins.                                 | **Main Class**, **Program Entry Point**                      |
| **`B subob = new B(1, 2, 3);`**          | Creates an object `subob` of subclass `B` and calls its constructor with values `1, 2, 3`.                            | **Object Instantiation**, **Constructor Invocation**         |
| **`subob.show();`**                      | Executes the overridden `show()` method in subclass `B`, which also calls `A`’s `show()` using `super.show()`.        | **Dynamic Method Dispatch**, **Polymorphism**                |
*/

