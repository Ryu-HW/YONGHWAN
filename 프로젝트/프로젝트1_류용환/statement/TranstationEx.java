package a1204.statement;

import java.io.IOException;

public class TranstationEx{
    public static void main(String[] args) {
        try{
            //Statement 클래스 객체 생성 후 runWriteStatement() 매소드 실행
            Statement statement = new Statement();
            statement.runWriteStatement();

        //BufferedWriter를 쓰려면 IOException을 써야한다고 한다, 예외에 대해 좀 더 공부해볼 것.
        }catch(IOException e){
            System.out.println("파일 처리 중 오류가 발생했습니다: " + e.getMessage());
        }
        
    }
}
