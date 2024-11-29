package a1126.game2;

public class Pikachu {

    // 멤버 : 변수 , 메소드

    private int energy; //멤버 변수 , 인스턴스 변수 , 필드
    private String type;
    private int level;

    public int getLevel() {
        return level;
    }


    //생성자(메소드) 오버로딩 - "메소드의 중복 정의"
    public Pikachu() {
        this(100,"전기",1); //생성자를 부르는 것
    }

    public Pikachu(int energy, String type, int level) {
        this.energy = energy;
        this.type = type;
        this.level = level;
    }

    public Pikachu(int energy, String type) {
        this(energy,type,1); //생성자를 부르는 것

    }

    //메소드
    //접근지정자 반환타입 메소드 명(매개변수){}
    public String aAttack(){
        return "십만볼트";
    }
    public String bAttack(){
        return "전광석화";
    }

    @Override
    public String toString() {
        return "[energy=" + energy + ", type=" + type + ", level=" + level + ", aAttack()=" + aAttack()
                + ", bAttack()=" + bAttack();
    }

    
}
