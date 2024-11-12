package a1112;

import java.util.Scanner;

public class Scan81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("시: ");
        int a = scanner.nextInt(); //여기서 띄어써서 입력하면 다음 next 값에 들어가버림 띄어쓰고나서

        System.out.print("분: ");
        int b = scanner.nextInt(); 
        System.out.println();


        System.out.print(a+":"+b);


    }
}
