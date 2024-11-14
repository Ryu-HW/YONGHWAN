package a1114;

import java.util.Scanner;

public class Switch7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하시오 : ");
        double num1 = scan.nextDouble();
        System.out.print("연산자를 입력하시오(+,-,*,/) : ");
        char x = scan.next().charAt(0); //인덱스번호 0번 문자만 갖고오겠다.
        System.out.print("두 번째 숫자를 입력하시오 : ");
        double num2 = scan.nextDouble();

        switch(x){
            case '+' -> {
                System.out.println("결과: " + (num1 + num2));
            }
            case '-' -> {
                System.out.println("결과: " + (num1 - num2));
            }
            case '*' -> {
                System.out.println("결과: " + (num1 * num2));
            }
            case '/' -> {
                if(num2 !=0){
                    System.out.println("결과: " + (num1 / num2));
                }else{
                    System.out.println("0으로 나눌 수 없습니다.");
                }
            }
            default -> System.out.println("연산자 입력이 틀렸습니다.");
        }
    }
}
