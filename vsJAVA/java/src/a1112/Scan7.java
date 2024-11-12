package a1112;

import java.util.Scanner;

public class Scan7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("x 값 입력: ");
        String a = scanner.next();

        System.out.print("y 값 입력: ");
        String b = scanner.next(); //이건 씌어쓰기 이후는 안 먹음 ( 문장은 못 받아옴 )
        System.out.println();


        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
        System.out.println(b);
        System.out.println(b);

    }
}
