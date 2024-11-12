package a1112;

public class Operater {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        int result = a + b; //변수와 연산시에는 byte를 쓸 수 없음

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;  //long타입으로 변환 후 연산 왜냐면 셋 중 하나가 long 이니까.

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;  //int타입으로 변환 후 연산 
        System.out.println("result4 :" + result4); //66 
        System.out.println("result4 :" + (char) result4); //B 66에 해당하는 문자변환
        
        int v8 = 10;
        int result5 = v8 / 4;
        System.out.println("result5 :" + result5); //정수의 연산결과는 정수. 2

        int v9 = 10;
        double result6 = v9 / 4.0; // 4에 소수점 .0을 써줬기에 double 실수값으로 인정해서(안 써주면 int와 같이 정수임 2) 소수점을 쓰면 무조건 실수로 받아야함
        System.out.println("result6 :" + result6); //double값으로 변환 후 연산 2.5

        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11; //double값으로 변환 후 연산 2.5
        double result8 = v10 / v11; //결과의 값은 double이나, 계산을 int끼리 했기에 0이 출력(내림)

        System.out.println("result7 :" + result7); 
        System.out.println("result8 :" + result8); 


        int v12 = 1;
        double v13 = 2;
        double result9 = v12 / v13; // v12와 v13 중 v13이 double 값이라  double result9 = v12 / (double) v13; 와 같음.

        System.out.println("result9 :" + result9); 



    }
}
