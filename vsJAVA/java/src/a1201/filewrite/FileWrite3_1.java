package a1201.filewrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite3_1 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:/abc/out1.txt");
        for(int i=1; i<11 ; i++){
            String data = i + " 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
        FileWriter fw2 = new FileWriter("c:/abc/out1.txt", true); //트루는 추가모드
        for(int i=11; i<21 ; i++){
            String data = i + " 번째 줄입니다.\r\n";
            fw2.write(data);
        }
        fw2.close();

    }
}
//FileWriter 를 이용해서 byte 배열 대신 문자열을 사용


