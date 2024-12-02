package a1201.file1;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try{
            File file = new File("newfile.txt");
            if(file.createNewFile()){ //파일을 만들었으면 ~
                System.out.println("파일생성 : " + file.getName());
            }else{
                System.out.println("파일이미존재");
            }
        }catch(IOException e){ //input output Exception
            System.out.println("예외 발생 : " + e.getMessage());
        }
    }
}
