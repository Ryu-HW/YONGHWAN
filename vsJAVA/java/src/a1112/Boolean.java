package a1112;

public class Boolean {
    public static void main(String[] args) {
        boolean stop = true;
        if(stop){
            System.out.println("중지합니다.");
        }else{
            System.out.println("시작합니다.");
        }
        int x = 10;
        boolean result1 = (x == 20); //변수값이 참 거짓이냐에 따라 result값이 변경
        boolean result2 = (x != 20);
        System.out.println("result1: "+ result1);
        System.out.println("result2: " + result2);

    }
}
