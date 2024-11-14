package a1114;

public class Switch {
    public static void main(String[] args) {
        int num = (int) (Math.random()*4) + 8;

        switch (num) {
            case 8:
                System.out.println("출근");
                break;
            case 9:
                System.out.println("회의");
                break;
            case 10:
                System.out.println("업무");
                break;
            default:
                System.out.println("외근");
                break;
        }
    }
}
