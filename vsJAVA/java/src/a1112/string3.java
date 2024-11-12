package a1112;

public class string3 {
    public static void main(String[] args) {

        String str1 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";

        String str3 = "" +
		"{\n" +
		"\t\"id\":\"winter\",\n" +
		"\t\"name\":\"눈송이\"\n" +
		"}";


        String str2 = """
        {
                "id":"winter",
                "name":"눈송이"
        }
        """;
        System.out.println(str1);
        System.out.println("--------------------");
        System.out.println(str2);
        System.out.println("--------------------");

        boolean var1 = str1 == str2;
        boolean var2 = str1 == str3;
        System.out.println(var1); //결과물은 같지만 완전히 같은 곳에 저장되진 않음
        System.out.println(var2); //완전히 똑같이 쓰면 같은곳에 저장됨

        String str = """
        나는 자바를 \
        학습합니다.
        나는 자바 고수가 될 겁니다.
                """;

        System.out.println(str); //""" """ 안에서 역슬래쉬 하면 앞 뒤를 붙인다


    }
}
