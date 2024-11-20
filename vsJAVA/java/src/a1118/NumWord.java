package a1118;

import java.util.Arrays;
import java.util.Scanner;

public class NumWord {
    public static void main(String[] args) {
        String[] pron = new String[9];
        Scanner scan = new Scanner(System.in);
        System.out.print("한글로 변경할 숫자 입력 (0 ~ 99999) : ");
        int num = scan.nextInt();

        int tenThau = num / 10000;
        int thau = (num%10000) / 1000;
        int hund = (num%1000)/ 100;
        int ten = (num%100)/ 10;
        int lastNum = num % 10;
        System.out.print("일");
        switch (tenThau) {
            case 1 -> {System.out.print("일");}
            case 2 -> {pron[0] = "이";}
            case 3 -> {pron[0] = "삼";}
            case 4 -> {pron[0] = "사";}
            case 5 -> {pron[0] = "오";}
            case 6 -> {pron[0] = "육";}
            case 7 -> {pron[0] = "칠";}
            case 8 -> {pron[0] = "팔";}
            case 9 -> {pron[0] = "구";}
            default -> {break;}
        }
        switch (thau) {
            case 1 -> {pron[2] = "일";}
            case 2 -> {pron[2] = "이";}
            case 3 -> {pron[2] = "삼";}
            case 4 -> {pron[2] = "사";}
            case 5 -> {pron[2] = "오";}
            case 6 -> {pron[2] = "육";}
            case 7 -> {pron[2] = "칠";}
            case 8 -> {pron[2] = "팔";}
            case 9 -> {pron[2] = "구";}
            default -> {break;}
        }
        switch (hund) {
            case 1 -> {pron[4] = "일";}
            case 2 -> {pron[4] = "이";}
            case 3 -> {pron[4] = "삼";}
            case 4 -> {pron[4] = "사";}
            case 5 -> {pron[4] = "오";}
            case 6 -> {pron[4] = "육";}
            case 7 -> {pron[4] = "칠";}
            case 8 -> {pron[4] = "팔";}
            case 9 -> {pron[4] = "구";}
            default -> {break;}
        }
        switch (ten) {
            case 1 -> {pron[6] = "일";}
            case 2 -> {pron[6] = "이";}
            case 3 -> {pron[6] = "삼";}
            case 4 -> {pron[6] = "사";}
            case 5 -> {pron[6] = "오";}
            case 6 -> {pron[6] = "육";}
            case 7 -> {pron[6] = "칠";}
            case 8 -> {pron[6] = "팔";}
            case 9 -> {pron[6] = "구";}
            default -> {break;}
        }
        switch (lastNum) {
            case 1 -> {pron[8] = "일";}
            case 2 -> {pron[8] = "이";}
            case 3 -> {pron[8] = "삼";}
            case 4 -> {pron[8] = "사";}
            case 5 -> {pron[8] = "오";}
            case 6 -> {pron[8] = "육";}
            case 7 -> {pron[8] = "칠";}
            case 8 -> {pron[8] = "팔";}
            case 9 -> {pron[8] = "구";}
            default -> {break;}
        }
        pron[1] = "만";
        pron[3] = "천";
        pron[5] = "백";
        pron[7] = "십";


        System.out.println(Arrays.toString(pron));

        
        //숫자로쓰면 한글로 표시하기
    }

}
