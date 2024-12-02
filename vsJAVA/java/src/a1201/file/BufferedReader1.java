package a1201.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class BufferedReader1 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in); //문자열로 변경
        BufferedReader br = new BufferedReader(reader); // 이 모든 작업이 스캐너
        String a = br.readLine();
        System.out.println(a);
    }
}
