package a1201.exception;

public class Exception2 {
    public static void main(String[] args) {
        String str = null;

        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("널 참조가 발생" + e.getMessage());
        }
    }
}
