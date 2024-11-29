package a1127.abstract1;

abstract class GameCharacter {
    //템플릿 메서드 - 공통로직을 제공 , 세부구현은 자식
    public void performAction(){
        prepare();
        action();
        finish();
    }

    private void prepare(){
        System.out.println("캐릭터를 준비합니다.");
    };

    //추상 메서드 : 구체적인 행동은 자식에서 구현
    protected abstract void action();
    private void finish(){
        System.out.println("행동을 마무리합니다.");
    };
    
}

class Warrior extends GameCharacter {

    @Override
    protected void action() {
        System.out.println("압도.");
    }

}

class Wizzard extends GameCharacter {

    @Override
    protected void action() {
        System.out.println("냉기 화살.");
    }

}

class Archer extends GameCharacter {

    @Override
    protected void action() {
        System.out.println("독사 쐐기.");
    }

}


public class Main2 {
    public static void main(String[] args) {
        Warrior que = new Warrior();
        Wizzard bubque = new Wizzard();

        System.out.println("- 전사 행동 -");
        que.performAction();

        System.out.println("- 마법사 행동 -");
        bubque.performAction();
    }
}
