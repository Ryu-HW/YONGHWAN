package a1122.aven;

public class AvengerTest {
    public static void main(String[] args) {
        Avenger thor = new Avenger("토르", 150);
        Avenger thanos = new Avenger("타노스", 150);

        thor.punch(thanos);
        thanos.punch(thor);
        thor.punch(thanos);

    }
        
            
}
        
class Avenger{
    String name;
    int hp;

    public Avenger(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void punch(Avenger hero) {
        hero.hp = hero.hp - 10;
        System.out.printf("[%s]의 펀치가 [%d]의 데미지를 입혀 [%s]의 hp가 [%d]가 되었습니다.\n",name,10,hero.name,hero.hp);
        

    }

        
}