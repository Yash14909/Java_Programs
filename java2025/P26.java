import java.util.Scanner;

class Student {
    int rno, phy, chem, maths, tot;

    Student(int r, int p, int c, int m) {
        rno = r;
        phy = p;
        chem = c;
        maths = m;
    }

    void show() {
        tot = phy + chem + maths;
        System.out.println("Total marks obtained by Rollno " + rno + " is " + tot);
    }
}

public class P26 {
    public static void main(String args[]) {
        Student s = new Student(1, 70, 80, 90);
        s.show();
    }
}
