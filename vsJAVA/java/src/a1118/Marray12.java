package a1118;

public class Marray12 {
    public static void main(String[] args) {
        //각반의 학생수가 3명으로 동일할 경우 점수 저장을 위한 2차원배열 생성
        int[][] mathScores = new int[2][3]; 
        for(int i=0; i < mathScores.length; i++ ){ //반의 수만큼 반복
            for(int k = 0; k < mathScores[i].length;k++){ // 해당 반의 학생수 만큼 반복
                System.out.println("mathScores["+i+"][" + k +"]: " + mathScores[i][k] );
            }
        }
        System.out.println();
        // 배열의 항복 값 변경
        mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
        for(int i=0; i < mathScores.length; i++ ){ //반의 수만큼 반복
            for(int k = 0; k < mathScores[i].length;k++){ // 해당 반의 학생수 만큼 반복
                System.out.println("mathScores["+i+"][" + k +"]: " + mathScores[i][k] );
            }
        }

        

    }
}
