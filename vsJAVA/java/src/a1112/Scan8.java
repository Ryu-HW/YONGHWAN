package a1112;

import java.util.Scanner;

public class Scan8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("시: ");
        String a = scanner.next(); //여기서 띄어써서 입력하면 다음 next 값에 들어가버림 띄어쓰고나서

        System.out.print("분: ");
        String b = scanner.next(); 
        System.out.println();


        System.out.print(a+":"+b);


    }
}
