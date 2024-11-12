package a1112;

import java.util.Scanner; //  <- alt + shift + O

public class Scan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 시스템인에 써 넣은 것을 뉴스캔해서 scan에 넣는다 스캐너 선택자?
        //스캐너 객채를 생성해서, System.in(콘솔(키보드,cmd?))에서 입력 받는다
        int num = scan.nextInt(); //스캔의 nextInt()? 를 받는다 함수같은 건 듯?
        System.out.println(num);
    }
}
