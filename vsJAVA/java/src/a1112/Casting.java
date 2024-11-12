package a1112;

public class Casting {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte) var1; //더 작은 단위로 바꿀 땐 이렇게 써줘야함
        System.out.println(var2);

        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6); //65에 해당하는 유니코드 출력

        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8); //3으로 정수출력

        // int var5 = 65;
        // String var6 = (String) var5;
        // System.out.println(var6); 
        // 스트링인 안 됨

        int var9 = 65;
        String var10 = String.valueOf(var9);  // or Integer.toString(var9);
        System.out.println(var10);
        // boolean x = (var9 == var10); //스트링과 비교 안 됨
    }
}
