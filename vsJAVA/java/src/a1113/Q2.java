package a1113;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //쉬프트 알트 O
        System.out.print("정수를 입력하세요 : ");
        int f = scan.nextInt();
        if(f % 2 == 0){
            System.out.printf("'%d'은(는) 짝수입니다.\n",f);
        }else{
            System.out.printf("'%d'은(는) 홀수입니다.\n",f);
        }
    }
}
