package a1112;

public class Scope {
    public static void main(String[] args) {
        int v1 = 15;
        int v2 = 0;
        int v3 = 0;
        if(v1>10){
            v2 = v1 - 10;
        }
        
        v3 =  v3 + v1 + v2; //연산안에 선언하면서 본변수를 넣을 수 없음 그전에 값을 넣어줘야함
    }
}
