package a1129.AccommodationReserve;

import java.util.Scanner;

// import javax.swing.plaf.synth.SynthEditorPaneUI; //???

public class Reservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AccManager manager = new AccManager(); //숙소 관리 객체
        boolean flag = true;
        while (flag) {
            System.out.println("\n 숙소예약 시스템에 오신 것을 환영합니다.");
            System.out.println("1. 예약가능한 숙소 보기");
            System.out.println("2. 숙소 예약하기");
            System.out.println("3. 예약한 숙소 보기");
            System.out.println("4. 숙소 추가하기");
            System.out.println("5. 숙소 삭제하기");
            System.out.println("6. 숙소 정보 수정하기");
            System.out.println("7. 숙소 내용 보기");
            System.out.println("8. 종료");
            System.out.print("원하는 작업을 선택하세요 > ");
            int choice = scan.nextInt();
            scan.nextLine(); //메모리에 있는 개행문자 삭제

            switch (choice) {
                case 1 ->{
                    System.out.println("예약 가능한 숙소");
                    manager.disAvailAccommodations();
                }

                case 2 ->{
                    System.out.println("숙소 예약하기");
                    System.out.println("예약하려는 숙소의 이름을 입력하세요.");
                    String accommodationName = scan.nextLine();
                    if(manager.bookedAccommodations(accommodationName)){
                        System.out.println("숙소가 성공적으로 예약되었습니다.");
                    }else{
                        System.out.println("예약이 불가능하거나 존재하지 않는 숙소입니다.");
                    }
                    //예약할 수 있는 숙소가 있으면 예약한 후 true 그렇지 않으면 false
                }
                case 3 ->{
                    System.out.println("예약한 숙소 보기");
                    manager.disBookedAccommodations();
                }
                case 4 ->{
                    System.out.println("추가하려는 숙소이름입력 \n 숙소이름 >>");
                    String newName = scan.nextLine();
                    System.out.println("숙소위치 >>");
                    String newlocation = scan.nextLine();
                    System.out.println("1박당 가격 >>");
                    Double newPrice = scan.nextDouble();
                    scan.nextLine();
                    System.out.println(newName+"(추가하려는 숙소 이름)");
                    if(newName.equals("")){
                        System.out.println("추가하려는 숙소이름입력 \n 숙소이름 >>");
                        newName = scan.nextLine();
                    }
                    manager.addAccommodation(newName,newlocation,newPrice);

                }
                case 5 ->{
                    System.out.println("삭제하려는 숙소이름입력 \n 숙소이름 >>");
                    String delName = scan.nextLine();
                    System.out.println(delName+"(삭제하려는 숙소 이름)");
                    if(delName.equals("")){
                        System.out.println("삭제하려는 숙소이름입력 \n 숙소이름 >>");
                        delName = scan.nextLine();
                    }
                    manager.removeAccommodation(delName);

                }

                case 6 ->{
                    System.out.println("수정 시작 >>");
                    System.out.print("수정하려는 호텔 이름을 입력해주세요.");
                    String upName = scan.nextLine();
                    System.out.println(upName+"(수정하려는 숙소 이름)");
                    if(upName.equals("")){
                        System.out.println("수정하려는 숙소이름입력 \n 숙소이름 >>");
                        upName = scan.nextLine();
                    }
                    manager.updateAccommodation(upName);

                }
                case 7 ->{
                    System.out.println("조회 시작 \n 숙소 이름 입력 >>");
                    String upName = scan.nextLine();
                    if(upName.equals("")){
                        System.out.println("조회하려는 숙소이름입력 \n 숙소이름 >>");
                        upName = scan.nextLine();
                    }
                    manager.showAccommodation(upName);
                    System.out.println("조회 끝");

                }

                case 8 ->{
                    System.out.println("종료");
                    flag = false;
                    scan.close(); // ?
                    System.exit(0); // ?
                }
                default ->{
                    System.out.println("다시 입력해주세요.");
                }

            }
            
        }
    }
}
