package a1113;

public class Ari1 {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        int v3 = 5;
        long v4 = 4l;

        int result1 = v1 + v2; //14
        System.out.println("result1 :" + result1);

        long result2 = v1 + v2 - v4; //10
        System.out.println("result2 :" + result2);

        double result3 = (double) v1 / v2; // 2.5
        System.out.println("result3 :" + result3);
        System.out.println("v1 :" + v1); //앞에 (double)을 붙였다고 해서 v1이라는 변수자체가 실수형이 되진 않음
        System.out.println("v1 :" + (double)v1); //앞에 (double)을 붙이면 실수형이 됨

        int result4 = v1 % v2; //2
        System.out.println("result4 :" + result4);


    }
}
