package a1122.static1;

public class CalEx {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi; //반지름 10의 원 넓이 구하기
        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
