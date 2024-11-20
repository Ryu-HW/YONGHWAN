package a1118;

public class String1 {
    
    public static void main(String[] args) {
        //스트링은 참조 타입
        String a = "Hello";
        String b = "Java";
        String c = "Hello";

        String d = new String("Hello");
        String e = new String("Java");
        String f = new String("Java");



        System.out.println(a == c); //t
        System.out.println(a == d); //f
        System.out.println(a.equals(d)); //t 이건 내용물 비교인 듯?

        System.out.println(e == f); //f
        System.out.println(e.equals(f)); //t
        System.out.println(b.equals(e)); //t 이건 내용물 비교인 듯?

    }
}
