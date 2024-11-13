package a1113;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요.");
        int f = scan.nextInt();
        System.out.print("두 번째 정수를 입력해주세요.");
        int s = scan.nextInt();
        System.out.print("세 번째 정수를 입력해주세요.");
        int t = scan.nextInt();
        
        int sum = f+s+t;
        float av = sum/3f;

        System.out.print("합은 "+sum);
        System.out.printf(" 평균은 약: %.1f입니다.",av);
        
    }
}
