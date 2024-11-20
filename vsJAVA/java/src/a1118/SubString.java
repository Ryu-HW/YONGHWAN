package a1118;

public class SubString {
    public static void main(String[] args) {
        String ssn = "880815-1234576";
        String firstNum = ssn.substring(0,6); //0인덱스부터 인덱스6(전)까지 새로 저장
        System.out.println(firstNum);
        String secondNum = ssn.substring(7); //7인덱스부터 끝까지
        System.out.println(secondNum);
    }
}
