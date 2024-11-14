package a1114;

public class Switch5 {
    public static void main(String[] args) {
        String grade = "A";
        int score1 = switch(grade){
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result; //해당 값을 반환하고 끝냄
            }
            default -> 60;

        };
        System.out.println(score1);

    }
}
