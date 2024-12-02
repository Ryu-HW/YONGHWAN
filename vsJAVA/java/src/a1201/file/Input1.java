package a1201.file;

import java.io.IOException;
import java.io.InputStream;

public class Input1 {
    public static void main(String[] args) throws IOException { //?
        InputStream in = System.in; //키보드로 입력받는다
        //InputStram read 메서드는 1byte 크기의 사용자 입력을 받아들인다. "한 글자 한글x" 근데 int형 자료료 입력. 아스키코드
        int a;
        a = in.read();
        System.out.println(a);

        //사용자가 입력한 문자인 A에 해당하는 아스키코드 65출력
        //InputStream은 바이트 단위의 데이터를 읽어들이는 내장 클래스
        //1byte만 읽음으로 한 글자만 출력
    }
}
