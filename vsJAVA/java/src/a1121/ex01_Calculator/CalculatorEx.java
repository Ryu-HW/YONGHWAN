package a1121.ex01_Calculator;

public class CalculatorEx {
    public static void main(String[] args) {
        //계산기 객체를 생성

        Calculator calculator = new Calculator();
        int a = 10;
        int b = 5;
        double x = 10.25;
        double y = 5.4;
        int arr[] = {1,2,3,4,5};

        int plus = calculator.plus(a,b);
        int minus = calculator.minus(a,b);
        double multiple = calculator.multiple(x,y);
        double divide = calculator.divide(x,y);
        int sum = calculator.sum(arr); //배열명만 보내면 됨
        double avg = calculator.avg(arr);

        System.out.println(plus);
        System.out.println(minus);
        System.out.printf("%5.2f\n",multiple); //5는 5자리에서 우측정렬, -5(음수)는 우측정렬
        System.out.printf("%5.2f\n",divide);

        System.out.println(sum);
        System.out.println(avg);
    }
}
