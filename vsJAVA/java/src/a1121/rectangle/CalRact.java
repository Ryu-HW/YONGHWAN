package a1121.rectangle;

public class CalRact {
    public static void main(String[] args) {
        Ractangle rec1 = new Ractangle();

        rec1.w = 5;
        rec1.h = 5;

        Ractangle rec2 = new Ractangle(4,5);
        Ractangle rec3 = new Ractangle(4);

        // int recArea1 = rec1.recArea(3,5);

        Ractangle rec4 = new Ractangle();
        int c = rec1.recArea();

        System.out.println(c);

        int a = rec4.recArea(4,5);

        int b = rec4.getPerimeter(4,4);
        System.out.println(a);
        System.out.println(b);
    }
}
