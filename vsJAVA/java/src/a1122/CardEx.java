package a1122;

public class CardEx {
    public static void main(String[] args) {

        System.out.println("Card W : " + Card.width);
        System.out.println("Card W : " + Card.height);
        System.out.println();

        //static 변수는 클래스 이름으로 바로 사용 가능. 생성자를 안 만들어도 됨.

        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "heart";
        c2.number = 7;

        // c1.width = 50; //c1,2다 바뀌어버림
        Card.width = 50;

        System.out.println("c1은" + c1.kind + "모양이다.");
        System.out.println("c1은" + c1.number + "숫자이다.");
        System.out.println("c1은 넓이 : " + c1.width);
        System.out.println("c1은 높이 : " + c1.height);
        System.out.println();

        System.out.println("c2은" + c2.kind + "모양이다.");
        System.out.println("c2은" + c2.number + "숫자이다.");
        System.out.println("c2은 넓이 : " + c2.width);
        System.out.println("c2은 높이 : " + c2.height);

    }
}
class Card {

    String kind;
    int number;
    static int width = 100; //클래스 변수 (정적멤버)(정적변수)
    static int height = 250;

    public Card(){} // 이걸 안 써도 자동으로 생성된다고 했던가.
    
}
