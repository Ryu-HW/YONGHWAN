package a1114;

public class MaxValue {
    public static void main(String[] args) {
        // int num1 = 12, num = 9;
        // int s = num1 > num ? num1 : num;
        // System.out.println(s);



        int num1 = 12, num = 9;
        String s = num1 == num ? "두 수가 같습니다" : (num1 > num) ? ""+num1+"" : ""+num+"";
        System.out.println(s);
    }
}
