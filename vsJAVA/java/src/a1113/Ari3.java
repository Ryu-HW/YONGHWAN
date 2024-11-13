package a1113;

public class Ari3 {
    public static void main(String[] args) {

        int apple =1; //사과 한 개
        double totalPieces = apple*10;
        int number = 7; //조각 중 몇 개
        double result = totalPieces - number;
        System.out.println("사과 1개에서 남은 사과 조각 수 :"+result);
        System.out.println("사과 한 개에서 남은 양 :"+result/10.0);

        //BigDecimal 사용
    }
}
