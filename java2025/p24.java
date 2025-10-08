import java.util.Scanner;

class Employee {
    String name;
    int id;
    int basic;
    Scanner in = new Scanner(System.in);

    void getData() {
        System.out.println("Enter Name:");
        name = in.next();

        System.out.println("Enter ID:");
        id = in.nextInt();

        System.out.println("Enter basic pay:");
        basic = in.nextInt();
    }

    void display() {
        System.out.println("Name                :" + name);
        System.out.println("Id                  :" + id);
        System.out.println("Basic Pay           :" + basic);
    }
}

public class p24 {
    public static void main(String[] args) {
        Employee[] e = new Employee[3];
        int i;

        for (i = 0; i < 3; i++) {
            e[i] = new Employee();
        }

        for (i = 0; i < 3; i++) {
            e[i].getData();
        }

        for (i = 0; i < 3; i++) {
            e[i].display();
        }
    }
}
