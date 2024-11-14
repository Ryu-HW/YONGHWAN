package a1114;

public class Compare {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        boolean resul1 = (num1 == num2);
        boolean resul2 = (num1 != num2);
        boolean resul3 = (num1 <= num2);
        System.out.println("result1 :" + resul1); //t
        System.out.println("result2 :" + resul2); //f
        System.out.println("result3 :" + resul3); //t

        char char1 = 'A';
        char char2 = 'B';
        boolean resul4 = (char1 < char2); //65 < 66
        System.out.println("result4 :" + resul4); //t

        int num3 = 1;
        double num4 = 1.0;
        boolean resul5 = (num3 == num4); 
        System.out.println("result5 :" + resul5); //t

        float num5 = 0.1f;
        double num6 = 0.1;
        boolean resul6 = (num5 == num6); 
        boolean resul7 = (num5 == (float)num6); 
        System.out.println("result6 :" + resul6); //t 이걸 틀림, 이게 false라고? 이유가 뭘까
        // 내 생각엔 0.1은 2진수에서 무한히 반복되기 때문에 비트수가 달라서 다른듯 <-맞음
        System.out.println("result7 :" + resul7); //t

        String str1 = "자바";
        String str2 = "Java";
        boolean resul8 = (str1.equals(str2)); //f
        boolean resul9 = (! str1.equals(str2)); //t
        System.out.println("result8 :" + resul8);
        System.out.println("result9 :" + resul9);

        

    }
}
