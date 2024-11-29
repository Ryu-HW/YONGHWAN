package a1127.game2;

public class Main {
    public static void main(String[] args) {
        
        Hero[] heros = new Hero[3]; //배열로 객체 선언

        heros[0] = new Warrior("전사");
        heros[1] = new Archer("사냥꾼");
        heros[2] = new Wizzard("마법사"); //업캐스팅

        for(int i = 0; i < heros.length;i++){

            if(heros[i] instanceof Warrior){
                Warrior warrior = (Warrior) heros[i]; //다운캐스팅
                warrior.groundCutting();
            }else if (heros[i] instanceof Archer archer) { //java17이상에서는 instanceof 에서 업캐스티을 바로 해줄 수 있음
                archer.fireArrow();  
                
            }else if(heros[i] instanceof Wizzard){
                ((Wizzard) heros[i]).freezing();
            }else{
                heros[i].attack();
            }
        }
        Hero warrior = (Warrior) heros[0]; //다운캐스팅 ??
        warrior.attack();
    }
}
