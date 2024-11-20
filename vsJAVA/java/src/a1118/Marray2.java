package a1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] scores = new int[3][3];
        String[] carteg = {"국어", "영어" ,"수학"};
        for(int i = 0;i < scores.length;i++){ //2번 실행 0 , 1 , 2

            System.out.printf("학생%d의 국어, 영어, 수학 점수를 입력하세요.\n",i+1);

            for(int j = 0; j < scores[i].length;j++){
                System.out.print(carteg[j]+" : ");
                scores[i][j] = scan.nextInt();
            }

        }

        // 각 학생의 총점과 평균 계산
        int allSum = 0;
        for(int i = 0;i < scores.length;i++){ //2번 실행 0 , 1 , 2

            int scoresSum = 0;

            for(int j = 0; j < scores[i].length;j++){
                scoresSum = scoresSum + scores[i][j];
            }
            allSum += scoresSum;
            System.out.println("학생"+(i+1)+"의 국영수 총점 : "+scoresSum);
            System.out.printf("학생 %d 의 국영수 평균 : %.2f\n",(i+1),scoresSum/(double)scores[i].length);


        }
        System.out.println("모든 평균 :"+(allSum/3)/(double)scores.length);


        //모든 학생의 평균 구하기
    }
}
