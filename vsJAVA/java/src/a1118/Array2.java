package a1118;

public class Array2 {
    public static void main(String[] args) {
        //배열 변수 선여과 배열 생성
        String[] season = {"Spring","Summer","Fall","Winter"};
        // String season[] = {"Spring","Summer","Fall","Winter"}; //둘 다 됨



        //인덱스1 항목의 값의 변경
        season[1] = "여름";


        for(int i = 0; i < season.length; i++){
            System.out.println(season[i]);
        }

        int[] scores;

        scores = new int[] {83, 90, 87};

        int sum = 0;

        for(int i = 0; i < scores.length;i++){
            
            sum = sum + scores[i];

        }
        double scoresAvg = (double) sum / scores.length;
        System.out.printf("평균은 : %.2f입니다.\n",scoresAvg);

        //배열을 매개값으로 주고, printItem메소드 호출
        printItem(new int[] {83,90,87});
        
    }
        //메소드 선언
        public static void printItem(int[] scores1) {
            //매개변수가 참조하는 배열의 항목을 출력
            for(int i=0; i<3;i++){
                System.out.println("scores1["+i+"]"+scores1[i]);
            }
        }

}