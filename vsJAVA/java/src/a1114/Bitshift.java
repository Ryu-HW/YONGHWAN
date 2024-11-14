package a1114;

public class Bitshift {
    public static void main(String[] args) {
        int num1 = 1;
        int result1 = num1 << 3; //좌로 3칸 이동 2의3승이 된다고 함.
        int result2 = num1 * (int) Math.pow(2,3); // 2의 3승 Math.pow 내장함수인듯?
        System.out.println("result2 : "+ result2);
        System.out.println("result1 : "+ result1);
    }
}
