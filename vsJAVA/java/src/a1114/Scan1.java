package a1114;

import java.util.Scanner;

public class Scan1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;

        while (x <= 0 || x > 12) {
            System.out.print("현재는 몇 월 입니까?");
            x = scan.nextInt();
            if(x > 0 && x <= 12){
                scanMonth(x);
                return;
            }
            System.out.println("다시 입력해주세요.");

        }

    }
    
    public static int scanMonth(int x){
        
        
        if(x >= 3 && x <=5 ){
            System.out.println("봄이네요.");
        }else if(x >= 6 && x <= 8){
            System.out.println("여름이네요.");
        }else if(x >= 9 && x <= 11){
            System.out.println("가을이네요.");
        }else if(x == 12 || x == 1 || x == 2){
            System.out.println("겨울이네요.");
        }
        
        return x;
    }
}
