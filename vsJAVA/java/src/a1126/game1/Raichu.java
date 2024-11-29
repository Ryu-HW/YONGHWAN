package a1126.game1;

public class Raichu extends Pikachu {


    public Raichu(){
        super(200,"슈퍼전기"); //피카츄에있는 생성자를 가져와서 레벨이 1 로 됨.
    }

    public Raichu(int energy,String type, int level){
        super(energy,type,level);
    }

    public Raichu(int energy,String type){
        super(energy,type, 20);
    }

    @Override
    public String aAttack() {
        return "백만볼트";
    }

    @Override
    public String bAttack() {
        
        return "볼트 체인지";
    }

    public String cAttack(){
        if(level >= 40){
            return "아이언테일";
        }else{
            return "사용불가";
        }
    }
}
