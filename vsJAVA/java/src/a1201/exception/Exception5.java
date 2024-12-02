package a1201.exception;


public class Exception5 {
    public static void main(String[] args) {

        try{
            validate(15);
        }catch(CustomException e){
            System.out.println("사용자 정의 예외" + e.getMessage());
        }

    }

    private static void validate(int age) throws CustomException {

        if(age<18){
            throw new UnsupportedOperationException("나이는 18세 이상이여야 함");
        }

    }
    
}

//자바에서 기본으로 재공하는 Exception 클래스 상속받아서 사용자 정의 예외 클래스를 만듦
//생성자에서 super(message); 를 호출하여 부모 클래스인 Excepton의 생성자 호출
//(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
class CustomException extends Exception { 


    public CustomException(String message){
        super(message);
    }



}
