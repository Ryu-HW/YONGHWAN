package a1120;

public class Hak1 {
    public static void main(String[] args) {
        int[][] array = {
            {95,86},
            {83,92,96},
            {78,83,93,87,88}
        };

        int sum = 0;
        double avg = 0.00;
        int count = 0;

        for(int i = 0; i < array.length;i++){
            
            for(int j = 0;j<array[i].length;j++){
                
                sum = sum + array[i][j];
                count++;
            }

        }

        avg = (double)sum / count;
        System.out.println("전체 합 :"+sum);
        System.out.println("전체 평균 :"+avg);

    }
}
