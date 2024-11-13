package a1113;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //쉬프트 알트 O
        System.out.print("첫번째 정수를 입력하세요 : ");
        int f = scan.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int s = scan.nextInt();
        // System.out.println(f +" + " + s + " = " + (f+s));
        // System.out.println(f +" - " + s + " = " + (f-s));
        // System.out.println(f +" * " + s + " = " + (f*s));
        // System.out.println(f +" / " + s + " = " + (f/s));
        // System.out.println(f +" % " + s + " = " + (f%s));

        System.out.printf("%d + %d = %d\n",f,s,(f+s));
        System.out.printf("%d - %d = %d\n",f,s,(f-s));
        System.out.printf("%d * %d = %d\n",f,s,(f*s));
        System.out.printf("%d / %d = %d\n",f,s,(f/s));
        System.out.printf("%d %% %d = %d\n",f,s,(f%s)); //%는 printf에서 %%로 써야함 !!

    }
}
