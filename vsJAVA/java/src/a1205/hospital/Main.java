package a1205.hospital;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PatientManager pm = new PatientManager();
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println(pm.hospital);
        System.out.println("\t\t    어서오세요. JAVA 병원입니다.");

        while (true) {
            System.out.println("\n=========== 메인 메뉴 ===========\n");
            System.out.println("1. 환자 등록");
            System.out.println("2. 등록 정보 보기");
            System.out.println("3. 관리자 메뉴");
            System.out.println("0. 종료\n");
            System.out.print("입력 > ");

            int choice = -1;
            try{
                choice = scan.nextInt();

            }catch(InputMismatchException e){
                System.out.println("잘못된 입력입니다. 숫자만 넣어주세요.");
                scan.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> {
                    pm.patientAppointment();
                }
                case 2 -> {
                    pm.patientPrint(); //환자 조회
                }
                case 3 -> {
                    boolean checkPw = checkAdminPw();
                    if(!checkPw){
                        System.out.println("비밀번호가 틀렸습니다.");
                        break;
                    }
                    pm.adminMenu();
                }
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                }
            
                default -> {

                }
            }

        }


    }

    private static boolean checkAdminPw() {
        Scanner scan = new Scanner(System.in);
        System.out.print("관리자 비밀번호를 입력하세요 >");
        String adminPw = scan.nextLine();
        return adminPw.equals("adminPw"); //이러면 비교가되나?
    }

    // private static boolean checkAdminPw() {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.print("관리자 비밀번호를 입력하세요> ");
    //     String adminPw = scan.nextLine();
    //     return "admin1234".equals(adminPw);
    // }   
}
