package a1201.file1;

import java.io.File;

public class DirectoryEx {
    public static void main(String[] args) {
        File directory = new File("testDir"); //폴더

        if(directory.mkdir()){
            System.out.println("디렉토리 생성 완료 : "+ directory.getName());
        }else{
            System.out.println("디렉토리 생성 실패");
        }

        //디렉토리 내에 파일 및 폴더 목록 출력
        File dir = new File("."); //현재 위치의 파일정보를 다 가져옴
        String[] list = dir.list(); //현 위치 파일의 파일이름을 문자열 배열에 반환
        if(list != null){
            System.out.println("디렉토리 목록");
            for(String fileName : list){
                System.out.println(fileName);
            }
            // System.out.println(list[5]);
        }
    }
}
