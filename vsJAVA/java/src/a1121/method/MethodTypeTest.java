package a1121.method;

public class MethodTypeTest {
    public static void main(String[] args) {
        MethodType metho = new MethodType();

        String methoName = metho.primeName("홍길동"); //홍길동
        
        metho.primeNumber(); //10을 반환
        double result1 = metho.multiply(2,4.5); //곱연산

        System.out.println(methoName);
        System.out.println(result1);

    }
}
