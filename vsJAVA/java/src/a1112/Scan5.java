package a1112;

import java.util.Scanner;

public class Scan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x 값 입력: ");
        int x = scanner.nextInt();

        System.out.print("y 값 입력: ");
        int y = scanner.nextInt();

        int result = x + y;
        System.out.println("x+y : " +result);

        while(true){ //false나 breack 아닌이상 계속
            System.out.print("입력 3문자열: ");
            int data = new Scanner(System.in).nextInt();
            if(data==1){
                break;
            }
            System.out.println("출력문자열 :"+data);
            System.out.println();
        }
        System.out.println("종료");
    }
}
