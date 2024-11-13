package a1113;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("몇 단을 구할까요?");
        int sum = 0;
        int num = scan.nextInt();
        for(int i = 1;i <= 9;i++){
            sum = num * i; // = sum += i;
            System.out.printf("%d x %d = %d\n",num,i,sum);
        }
        
        
    }
}
