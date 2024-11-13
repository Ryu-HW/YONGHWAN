package a1113;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 까지의 자연수의 합을 구할까요?");
        int sum = 0;
        int num = scan.nextInt();
        for(int i = 1;i <= num;i++){
            sum = sum + i; // = sum += i;

        }
        
        System.out.printf("1부터 %d까지의 합은 %d입니다",num,sum);
    }
}
