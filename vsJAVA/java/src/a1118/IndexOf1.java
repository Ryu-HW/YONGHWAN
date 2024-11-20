package a1118;

public class IndexOf1 {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍"); //해당 문자가 몇 번째부터 시작되는 지. 3 
        System.out.println(location);
        String subString = subject.substring(location); //3
        System.out.println(subString); //3번부터 끝까지 출력 index3=프

        int location1 = subject.indexOf("자바");
        System.out.println(location1); //없으면 -1출력

        if(location1 != 1){
            System.out.println("자바있음");
        }else{
            System.out.println("자바없음");
        }

        boolean result = subject.contains("자바"); //true false 반환

        if(result){
            System.out.println("자바있음");
        }else{
            System.out.println("자바없음");
        }

    }
}
