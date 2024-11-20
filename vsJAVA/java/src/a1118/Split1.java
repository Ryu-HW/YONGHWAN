package a1118;

public class Split1 {
    public static void main(String[] args) {
        String board = "1,자바학습,참조타입 String을 학습합니다.,홍길동";
        //문자열 배열로 분리
        String[] tokens = board.split(",");

        for(int i = 0;i < tokens.length;i++){
            System.out.println("index " + i + " : " + tokens[i] );
        }
    }
}
