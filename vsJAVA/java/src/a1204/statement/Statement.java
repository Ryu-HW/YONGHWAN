package a1204.statement;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Statement {
    String date;
    String client; //거래처
    int page = 1;
    int currentPage;
    ArrayList<Product> product;

    DecimalFormat dateFormat = new DecimalFormat("00");

    Scanner scan = new Scanner(System.in);


    public Statement(String date, String client) {
        this.date = date;
        this.client = client;
        currentPage = page;
        page++;
    }

    public Statement() {
    }

    public void runWriteStatement() {
        try{
            System.out.println("오늘 날짜의 명세서 입니까? \n 1.네 2.아니오 \n >>");
            int dateChoice = scan.nextInt();
            scan.nextLine();
            if(dateChoice == 1){
                //오늘 날짜 받아오기
                getTodaysDate();
            }else if(dateChoice == 2){
                date = inputDate();
            }
        }catch(NumberFormatException e){
            System.out.println("숫자 형식이 올바르지 않습니다.");
        }

    }

    private void getTodaysDate(){

        LocalDate today = LocalDate.now();
        date = today.toString();
        
    }

    private String inputDate() {

        System.out.println("년도를 입력해주세요.");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("달을 입력해주세요.");
        int month = scan.nextInt();
        scan.nextLine();
        System.out.println("일을 입력해주세요.");
        int date = scan.nextInt();
        scan.nextLine();

        String formattedDate = String.format("%d-%02d-%02d", year, month, date);
        System.out.printf("\n%s-가 맞습니까? 1.네 2.아니오\n", formattedDate);
        int check = scan.nextInt();
        scan.nextLine();

        if(check == 1){
            return formattedDate;
        }else{
            System.out.println("날짜를 다시 입력받습니다.");
            return inputDate();
        }

    }

    
}
