package a1114;

import java.util.Scanner;

public class Yunyear1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("윤년을 구할 년도를 입력해주세요.");
        int x = scan.nextInt();



        String result = ( x % 4 == 0 && !(x % 100 == 0) || x % 100 == 0) ? "윤년입니다." : "윤년이 아닙니다.";
        System.out.println(x + "년은 " + result);
    }
}
