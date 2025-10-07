Here’s a complete and well-formatted **README.md** file for your **Java Model List Demo** 👇

---

# ☕ Java Model List Demo

This is a simple **Java program** that demonstrates the use of:

* A custom **`Model` class** with attributes — `Name`, `Email`, and `Phone`
* **Java ArrayList** to store multiple instances of the `Model` class
* **Overriding `toString()`** for clean and readable object printing

---

## 🧩 **Overview**

The program showcases how to:

1. Create a custom Java class (`Model`)
2. Store its objects in an `ArrayList`
3. Display and manage data dynamically
4. Use the overridden `toString()` method to print objects neatly

---

## 🗂️ **Project Structure**

```
Model.java    → Class representing a person/model with name, email, and phone
Data.java     → Main driver class with ArrayList demonstration
```

---

## 🧱 **Model Class**

```java
class Model {
    private String name;
    private String email;
    private String phone;

    public Model(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + ", " + email + ", " + phone;
    }
}
```

---

## ⚙️ **Main Class (Data.java)**

```java
import java.util.ArrayList;

public class Data {
    public static void main(String[] args) {
        ArrayList<Model> list = new ArrayList<>();

        System.out.println("-Before adding the data to the list ");
        System.out.println("Size of the list = " + list.size());
        System.out.println("List data = " + list);

        System.out.println("\n-After adding data to the list.....");
        list.add(new Model("GitHub", "github_39@gmail.com", "1234567890"));

        System.out.println("Size of list = " + list.size());
        System.out.println("List data = " + list);
    }
}
```

---

## 🚀 **How to Run**

1. **Open a terminal** in the project folder.
2. **Compile and run** using the commands below:

   ```bash
   javac Data.java
   java Data
   ```

---

## 📝 **Expected Output**

```
-Before adding the data to the list 
-Size of the list = 0
-List data = []

-After adding data to the list.....
-Size of list = 1
-List data = [GitHub, github_39@gmail.com, 1234567890]
```

---

## 🧠 **Key Concepts Demonstrated**

* **Encapsulation** – Attributes are wrapped in a custom class.
* **Collections Framework** – Use of `ArrayList` to store and manage objects.
* **Method Overriding** – Customizing `toString()` for formatted output.
* **Dynamic Data Handling** – Adding and viewing data at runtime.

---

Would you like me to generate this as a **downloadable README.md file** so you can add it directly to your Java project folder (for GitHub or local use)?


