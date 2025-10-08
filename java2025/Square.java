import java.util.Scanner;

class Square {
    public static void main(String args[]) {
        System.out.println("JAVA IF NUMBER IS EVEN THEN PRINT ITS SQUARE & IF NUMBER IS ODD THEN PRINT ITS CUBE");
        int no;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number");
        no = in.nextInt();

        if (no % 2 == 0) {
            System.out.println("The number is even. Square is " + (no * no));
        } else {
            System.out.println("The number is odd. Cube is " + (no * no * no));
        }
    }
}
