package a1112;

import java.util.Scanner; //  <- alt + shift + O

public class Scan2 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in); // 시스템인에 써 넣은 것을 뉴스캔해서 scan에 넣는다 스캐너 선택자?
        //스캐너 객채를 생성해서, System.in(콘솔(키보드,cmd?))에서 입력 받는다
        String str = scaner.nextLine(); //스캔의 nextLine()은 문자. 스트링도 문자
        System.out.println(str);
    }
}
