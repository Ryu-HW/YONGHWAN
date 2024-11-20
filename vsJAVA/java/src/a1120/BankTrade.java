package a1120;

import java.util.Scanner;

public class BankTrade {
    public static void main(String[] args) {
        int passWord = 1234;

        int money = 1000000;

        Scanner scan = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요 : ");
        int passWordCheck = scan.nextInt();

        if(passWord == passWordCheck){
            System.out.print("잔액조회는 1, 인출은 2, 종료는 3을 입력 >");
            int choose = scan.nextInt();
            switch (choose) {
                case 1 -> {
                    System.out.println("잔액은 "+money+"원 입니다.");
                }
                case 2 -> {
                    System.out.print("얼마를 인출? :");
                    int outMoney = scan.nextInt();
                    money = money - outMoney;
                }
            }
        }else{
            System.out.println("패스워드가 틀렸습니다. 프로그램을 종료합니다.");
        }
    }
}
