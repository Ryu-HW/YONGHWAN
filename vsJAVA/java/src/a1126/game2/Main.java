package a1126.game2;

public class Main extends Object{
    public static void main(String[] args) {

        
        Pikachu pikachu = new Pikachu();
        System.out.println(pikachu.toString() + "]");

        Pikachu pikachu20 = new Pikachu(150,"전기,강철",20);
        System.out.println(pikachu20.toString() + "]");

        Raichu raichu = new Raichu();
        System.out.println(raichu.toString() + "]");


        Raichu raichu40 = new Raichu(400,"슈퍼전기",40);
        System.out.println(raichu40.toString() + "]");


    }

}
