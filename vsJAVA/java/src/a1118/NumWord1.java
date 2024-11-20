package a1118;

import java.util.Scanner;

public class NumWord1 {
    public static void main(String[] args) {
        String[] moneyLevel = {"만","천","백","십",""};
        String[] eachNum = {"","일","이","삼","사","오","육","칠","팔","구"};
        Scanner scan = new Scanner(System.in);
        System.out.print("한글로 변경할 숫자 입력 (0 ~ 99999) : ");
        int num = scan.nextInt();

        int tenThau = num / 10000;
        int thau = (num%10000) / 1000;
        int hund = (num%1000)/ 100;
        int ten = (num%100)/ 10;
        int lastNum = num % 10;

        int[] levelNum = {tenThau,thau,hund,ten,lastNum};

        for(int i = 0;i<levelNum.length;i++){
            switch (levelNum[i]){
                case 1 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 2 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 3 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 4 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 5 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 6 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 7 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 8 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}
                case 9 -> {System.out.print(eachNum[levelNum[i]]+moneyLevel[i]);}

                default -> {break;}
            }
        }

        
        //숫자로쓰면 한글로 표시하기
    }

}
