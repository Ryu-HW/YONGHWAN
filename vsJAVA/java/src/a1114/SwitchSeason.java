package a1114;

import java.util.Scanner;

public class SwitchSeason {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 월인지 입력하세요 :");
        int nowYear = scan.nextInt();

        // switch (nowYear) {
        //     case 12,1,2:
        //         System.out.println("봄입니다.");
        //         break;
        //     case 3,4,5:
        //         System.out.println("여름입니다.");
        //         break;
        //     case 6,7,8:
        //         System.out.println("가을입니다.");
        //         break;
        //     case 9,10,11:
        //         System.out.println("겨울입니다.");
        //         break;
        
        //     default:
        //         System.out.println("해당 달은 없습니다.");
        //         break;
        // }

        switch (nowYear) {
            case 12,1,2 -> {System.out.println("봄입니다.");}
                
            case 3,4,5 -> {System.out.println("여름입니다.");}
                
            case 6,7,8 -> {System.out.println("가을입니다.");}
                
            case 9,10,11 -> {System.out.println("겨울입니다.");}
                
            default  -> {System.out.println("해당 달은 없습니다.");}
                
        }
    }
}
