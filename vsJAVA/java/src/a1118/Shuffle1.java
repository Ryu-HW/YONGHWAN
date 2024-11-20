package a1118;

import java.util.Arrays;

public class Shuffle1 {
    public static void main(String[] args) {
        int[] ball = new int[45];
        for(int i = 0; i < ball.length; i++){
            ball[i]=i+1;
        }
        System.out.println(Arrays.toString(ball));
        
        for(int i = 0;i<10000;i++){
            int a = (int)(Math.random()*45);
            int b = (int)(Math.random()*45);
            int room = ball[a];
            ball[a] = ball[b];
            ball[b] = room;
        }
        System.out.println(Arrays.toString(ball));

        int[] ballNum = new int[6];

        for(int i = 0; i < 6; i++){
            
            ballNum[i] = ball[i];
            System.out.printf("ball[%d] = %d\n",i,ball[i]);
        }

        //140pg자바의 정석에서 로또 프로그램 이해하고 오기
        
    }
}
