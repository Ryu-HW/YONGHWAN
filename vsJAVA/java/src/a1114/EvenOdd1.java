package a1114;

import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("정수를 입력하세요.");
        int x = scan.nextInt();

        String result = (x==0) ? "0입니다" : (x % 2 == 0) ? (( x > 0) ?  "양수이며, 짝수 입니다." : "음수이며, 짝수입니다.") : ((x > 0) ? "양수이며 홀수입니다." : "음수이며 홀수입니다.");
        System.out.println(result);
    }
}
