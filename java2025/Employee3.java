import java.util.*;

class Employee3 {
    String name;
    int age;
    String gender;
    Scanner ui = new Scanner(System.in);

    void getData() {
        System.out.println("Enter the name:");
        name = ui.next();
        
        System.out.println("Enter the age:");
        age = ui.nextInt();
        
        System.out.println("Enter the gender:");
        gender = ui.next();
    }

    void displayData() {
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
    }

    // Optionally add a method to close the Scanner
    void closeScanner() {
        ui.close();
    }
}

public class Main {
    public static void main(String[] args) {
        Employee3 emp = new Employee3();
        emp.getData();
        emp.displayData();
        
        // Close the scanner
        emp.closeScanner();
    }
}
