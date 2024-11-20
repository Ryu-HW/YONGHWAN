package a1118;

public class Char1 {
    public static void main(String[] args) {
        String ssn = "1111111156651";
        char a = ssn.charAt(6);
        int len = ssn.length();
        
        switch (a) {
            case '1', '3':
                System.out.println("남자");
                break;
            case '2', '4':
                System.out.println("남자");
                break;
            default:
                System.out.println("오류");
                break;
        }
    }
}
