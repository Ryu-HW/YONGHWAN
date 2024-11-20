package a1118;

public class Marray1 {
    public static void main(String[] args) {
        //각반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
        int[][] mathScores = new int[2][3]; //각 배열의 개수.

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;
        
        for(int i = 0; i < mathScores.length;i++){  // i < 2
            
            for(int j = 0; j < mathScores[i].length;j++){

                System.out.println((i+1)+"반 "+(j+1)+"번 수학 점수 : "+mathScores[i][j]);

            }
            System.out.println();
            //배열의 항목 값 변경

        }


        int totalMathSum = 0;
        int studentNum = 0;
        int[] mathClass = new int[2]; //각 배열의 개수.



        for(int i = 0; i < mathScores.length;i++){  // i < 2
            int classMathSum = 0;
            studentNum = studentNum + mathScores[i].length;
            for(int j = 0; j < mathScores[i].length;j++){

                totalMathSum += mathScores[i][j];
                classMathSum += mathScores[i][j];
            }
            //배열의 항목 값 변경
            mathClass[i] = classMathSum;
            System.out.println((i+1)+"반 점수의 합 : "+mathClass[i]);

        }
        
        System.out.println("모든 학생 점수 합 : "+totalMathSum);
        System.out.println("모든 학생들의 점수 평균 : "+totalMathSum/studentNum);

    }
}
