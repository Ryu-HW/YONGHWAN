package a1204.statement;


//각종 자바 내장 클래스들
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Statement {
    
    private String date; //날짜
    private String client; //거래처
    private static int page = 1; //엑셀 내 제품란이 최대 8개라 제품이 8개가 넘어가면 다음페이지로 넘어가기 위함
    private int priceSum; //총 제품 가격
    private ArrayList<Product> prods = new ArrayList<>(); //제품 배열 생성

    DecimalFormat df = new DecimalFormat("#,###원"); //원화 가격 표시 법

    Scanner scan = new Scanner(System.in); //스캐너 생성

    //BufferedWriter 를 위한 throws IOException과 작동 매소드
    public void runWriteStatement() throws IOException {

        //날짜를 받아오는 메서드
        date = inputDate();

        //거래처명을 받는 메서드
        client = getClientName();

        //제품들의 정보를 받는 메서드 prods = ArrayList<Product> prods
        prods = getProduct();

        //텍스트파일로 출력하는 메서드
        writeTxtData();

    }

    private void todaysDate(){

        LocalDate today = LocalDate.now();
        date = today.toString();
        
    }

    //외부에서 formattedDate 변수를 사용하기 위해 밖에서 정의.
    String formattedDate;
    //날짜를 받아오는 메서드
    private String inputDate() {

        while (true) {
            try{
                System.out.print("오늘 날짜의 명세서 입니까? \n 1.네 2.아니오 3.종료\n >>");
                int dateChoice = scan.nextInt();
                scan.nextLine();
                if(dateChoice == 1){
                    //오늘 날짜를 받아서 date에 할당해주는 메서드
                    todaysDate();
                    return date;
                //오늘이 아닌 경우 날짜를 받아오기.
                }else if(dateChoice == 2){
                    System.out.println("년도를 입력해주세요.");
                    int year = scan.nextInt();
                    scan.nextLine();
                    System.out.println("달을 입력해주세요.");
                    int month = scan.nextInt();
                    scan.nextLine();
                    System.out.println("일을 입력해주세요.");
                    int date = scan.nextInt();
                    scan.nextLine();
                    //format매서드를 통해 원하는 형식의 날짜 형식을 String으로 받아와서 출력
                    formattedDate = String.format("%d-%02d-%02d", year, month, date);
                    System.out.printf("\n%s 가 맞습니까? 1.네 2.아니오\n", formattedDate);
                    int check = scan.nextInt();
                    scan.nextLine();
            
                    //받아 온 날짜가 맞다면 formattedDate 리턴.
                    if(check == 1){
                        return formattedDate;
                    }else{
                        System.out.println("날짜를 다시 입력받습니다.");
                    }
                    //텍스트로 내보내기
                }else if(dateChoice == 3){
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }else{
                    System.out.println("잘못 입력하였습니다.");
                }
            //숫자형식 예외처리
            }catch(InputMismatchException e){
                System.out.println("숫자 형식이 올바르지 않습니다. 다시 입력해주세요.");
                scan.nextLine();
            }
        }

    }

    //거래처명을 받는 메서드
    private String getClientName() {
        try{
            System.out.println("거래처명을 입력해주세요.");
            System.out.print(" >> ");
            String ClientName = scan.nextLine();
            System.out.println("'"+ClientName+"'이 맞습니까? 1.네 2.아니오");
            int Choice = scan.nextInt();
            scan.nextLine();
            switch (Choice) {
                case 1 ->{
                    return ClientName;
                }
                case 2 -> {
                    //아니오의 경우 다시 메서드 실행
                    return getClientName();
                }
                default ->{
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                    //잘못 입력한 경우 다시 메서드 실행
                    return getClientName();
                }
            }
        }catch(InputMismatchException e){
            System.out.println("숫자 형식이 올바르지 않습니다. 프로그램을 종료합니다.");
            return null;
        }
        
    }

    //총 제품의 개수가 초기회되지 않게 count를 외부에서 정의(총 제품의 개수)
    int count = 0;
    //제품들의 정보를 받는 메서드
    private ArrayList<Product> getProduct() {
        try{
            //제품 개수를 0으로 초기화
            int prodNum = 0;
            boolean flag = true;
            //제품 수가 8개가 되면 종료
            while (flag && prodNum <8) {

                System.out.print(" 제품 명을 입력해주세요(종료는 Q입력) >>");
                String productName = scan.nextLine();

                if(productName.equalsIgnoreCase("q")){
                    //q입력시 와일문 종료.
                    flag = false;
                }else{
                    System.out.print(" 제품 '개수'를 입력해주세요 >>");
                    int num = scan.nextInt();
                    scan.nextLine();
                    System.out.print(" 제품 '개당 가격'을 입력해주세요 >>");
                    int price = scan.nextInt();
                    scan.nextLine();
                    price = price * num;
                    //prod객체를 새로 생성함
                    Product prod = new Product(productName, num, price);
                    System.out.println(prod+"이 맞습니까? 1. 네 2. 아니오");
                    int choice = scan.nextInt();
                    scan.nextLine();
    
                    switch (choice) {
                        case 1 -> {
                            //제품확인 후 prods(Product배열)에 새로 생성한 Product객체인 prod 추가.
                            prods.add(prod);
                            System.out.println("추가되었습니다.");
                            //총 가격 합산
                            priceSum = priceSum + price;
                            //페이지를 넘기기위한 prodNum++과 총 제품 카운트를 위한 count++
                            prodNum++;
                            count++;
                        }
                        case 2 -> {
                            System.out.println("다시 입력받겠습니다.");
                        }
                        default ->{
                            System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                        }
                    }

                }

            }
            //제품의 개수가 8개면, 다음페이지로 넘어감
            if(prodNum >=8){
                System.out.println("다음 페이지로 넘어갑니다.");
                page++;
                return getProduct();
            }
            //prods배열을 리턴해줌.
            return prods;


        }catch(InputMismatchException e){
            System.out.println("숫자 형식이 올바르지 않습니다. 프로그램을 종료합니다.");
            return null;
        }
    }

    //BufferedWriter 사용시 필수인 IOException 예외 처리
    private void writeTxtData() throws IOException {

        //try-with-resources 구문에서 파일과 파일 사이에 데이터를 열고나서 다시 닫아야해서 try()안에 BufferedWriter를 넣는다고 한다.. append:true를 해줘야 이어쓰기(같은 파일명이면 이어씀)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(client+"_"+formattedDate+"_"+page+"page.txt",true))) { //거래처,날짜,페이지 별로 파일(엑셀) 관리

            //메모장에 적는 것, 나중엔 엑셀에 넣어야함
            for (int i = 0; i < page; i++) {
                writer.write("--" + (i + 1) + "PAGE--\n");
                writer.write(date + "\t" + client + "\n");
                for (int j = i * 8; j < ((i + 1) * 8) && j < count; j++) {
                    writer.write(prods.get(j) + "\n");
                }
                writer.write("총 가격 : " + df.format(priceSum));
                writer.write("\n\n");
            }
            System.out.println("입력되었습니다.");
        } catch (IOException e) {
            System.out.println("파일을 쓸 수 없습니다: " + e.getMessage());
            throw e;
        }
        
    }




}
