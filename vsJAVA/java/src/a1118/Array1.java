package a1118;

public class Array1 {
    public static void main(String[] args) {
        //배열 변수 선여과 배열 생성
        String[] season = {"Spring","Summer","Fall","Winter"};
        // String season[] = {"Spring","Summer","Fall","Winter"}; //둘 다 됨


        //인덱스1 항목의 값의 변경
        season[1] = "여름";


        for(int i = 0; i < season.length; i++){
            System.out.println(season[i]);
        }

        int[] scores = {83,90,87};

        int sum = 0;

        for(int i = 0; i < scores.length;i++){
            
            sum = sum + scores[i];

        }
        double scoresAvg = (double) sum / scores.length;
        System.out.printf("평균은 : %.2f입니다.",scoresAvg);
    }
}