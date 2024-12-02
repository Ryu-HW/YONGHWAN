package a1201.exception;

public class Exception6 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Park", "Choi"};
        try{
            System.out.printf("0번 인덱스 요소:%s\n",names[0]);
            System.out.printf("4번 인덱스 요소:%s\n",names[4]);
            System.out.printf("3번 인덱스 요소:%s\n",names[3]);
        }catch(ArrayIndexOutOfBoundsException ex){ //각각의 코드를 실행하면서 검수하는 코드같음, 검수된 후에는 실행 종료
            System.out.println("인덱스 접근이 잘못되었습니다.");
        }finally{
            System.out.println("파이널문은 예외발생과 상관없이 항상 수행됨");
        }
    }
}
