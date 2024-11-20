package a1120;

import java.util.Arrays;
import java.util.Scanner;

public class HakEx09R {
    public static void main(String[] args) {
        boolean run = true;

        int studentNum = 0;
        int scores[] = null;
        //널을 해줘야 정의되긴하는듯?

        Scanner scan = new Scanner(System.in);
        while (run) {
            System.out.println("-------------------------------------------------------------------");
            System.out.println("1. 학생 수 |  2. 점수 입력 |  3. 점수리스트 |  4. 점수 분석 |  5. 종료");
            System.out.println("-------------------------------------------------------------------");

            System.out.print("선택(1~5) : ");
            // try{
                int Choose = scan.nextInt();

                switch (Choose) {
                    case 1 -> {

                        System.out.print("학생 수 : ");
                        studentNum = scan.nextInt();
                        scores = new int[studentNum];

                    }
                    case 2 -> {
                        if(scores == null){
                            System.out.println("학생 수가 입력되지 않았습니다.");

                        }else{
                            for(int i = 0; i < scores.length; i++){
                                System.out.print((i+1)+"번 점수 : ");
                                scores[i] = scan.nextInt();

                            }
                            System.out.println(Arrays.toString(scores));
                        }
                    }
                    case 3 -> {
                        if(scores == null){
                            System.out.println("학생 수가 입력되지 않았습니다.");

                        }else{
                            
                            for(int i = 0; i < scores.length; i++){

                                System.out.println((i+1)+"번 점수 : " + scores[i]);

                            }
                        }
                        

                    }

                    case 4 -> {
                        if(scores == null){
                            System.out.println("학생 수가 입력되지 않았습니다.");

                        }else{
                            int highScore = scores[0];
                            int sum = 0;
                            int div = 0;
                            for(int i = 0; i < scores.length-1; i++){
                                if(scores[i] < scores[i+1]){
                                    highScore = scores[i+1];
                                }
                            }
                            for(int i = 0; i < scores.length; i++){
                                sum += scores[i];
                                div++;
                            }
                            if(sum == 0){
                                System.out.println("학생의 점수가 입력되지 않았습니다.");
                            }else{
                                System.out.println("최고 점수 : "+ highScore);
                                System.out.printf("점수 평균 : %.2f", (double)sum/div);
                            }
                            
                        }
                    }
                    case 5 -> { run = false; } //run이 false로 바뀌면서 while문이 나가짐
                    default -> { break ;}
                }
            // }
            // catch(inputMismatchException e){
            //     System.out.println("숫자를 입력하세요.");
            // } 이건 왜 안 돼
        }
    }
}
