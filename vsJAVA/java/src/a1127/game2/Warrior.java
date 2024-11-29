package a1127.game2;

public class Warrior extends Hero{

    public Warrior(String name){
        super(name); //부모의 이름을 불러와라.
    }
    

    public void groundCutting() {
        System.out.println("영웅의 일격 !");
    }
    
}
