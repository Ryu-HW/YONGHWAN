package a1114;

import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1번 정수를 입력하세요.");
        int x = scan.nextInt();
        System.out.print("2번 정수를 입력하세요.");
        int y = scan.nextInt();
        System.out.print("3번 정수를 입력하세요.");
        int z = scan.nextInt();




        int result = (x >= y) ? ((x >= z) ? x : z) : ((y >= z) ? y : z);
        System.out.println("가장 큰 수는 " + result + "입니다");
    }
}
