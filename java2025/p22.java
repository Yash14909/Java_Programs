// Rectangle class moved to Rectangle.java

public class p22 {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        int area1 = rect1.rectArea();
        System.out.println("Area is=" + area1);

        Rectangle rect2 = new Rectangle();
        int area2 = rect2.rectArea();
        System.out.println("Area is=" + area2);
    }
}