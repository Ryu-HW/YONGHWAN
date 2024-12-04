package a1204.ramda;

interface Calculator {

    int sum(int a, int b);
    // int mul(int a, int b); 안 됨.
    //Calculator 인터페이스의 메서드가 1개이상이면 람다함수 사용 못 함
}


    

public class Function2 {
    public static void main(String[] args) {
        Calculator mc = (int a, int b) -> a + b; //람다를 적용한 함수
        //괄호 사이의 int a, int b는 Calculator 인터페이스 sum함수의 입력항목이 배당이 됩니다.
        //뒤에 a + b 가 리턴값으로 해당이 됨
        //이런 람다함수는 MyCalculator없어도 Calculator와 같은 기능의 객체를 생성
        //훨씬 간단
        int result = mc.sum(3,4);
        System.out.println(result);
    }
}
