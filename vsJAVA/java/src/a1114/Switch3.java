package a1114;

public class Switch3 {
    public static void main(String[] args) {
        char grade = 'B';
        switch(grade){
            case 'A':
            case 'a':
                System.out.println("우수");
                break;
            case 'B':
            case 'b':
                System.out.println("일반");
                break;

            default:
                System.out.println("손님"); 
                break;

                
        }
    }
}
