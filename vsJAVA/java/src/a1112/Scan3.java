package a1112;

import java.util.Scanner; //  <- alt + shift + O

public class Scan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 시스템인에 써 넣은 것을 뉴스캔해서 scan에 넣는다 스캐너 선택자?
        System.out.print("이름입력 : ");
        String name = scan.nextLine(); //문자열 입력
        System.out.print("나이입력 :");
        int age = scan.nextInt(); //나이
        
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
        
    }
}
