package a1129.AccommodationReserve;

import java.util.ArrayList;
import java.util.Scanner;

import a1126.sec06.package1.A;

//숙소 관리
public class AccManager {
    private ArrayList<Accommodation> accommodations; //숙소집합
    private ArrayList<Accommodation> bookedAccommodations; //예약된 숙소집합

    public AccManager() {
        accommodations = new ArrayList<Accommodation>(); //초기 숙소 저장 리스트
        bookedAccommodations = new ArrayList<Accommodation>(); //초기 예약된 숙소 저장 리스트
        accommodations.add(new Accommodation("호텔A", "서울", 100.0));
        accommodations.add(new Accommodation("호텔B", "부산", 80.0));
        accommodations.add(new Accommodation("호텔C", "제주", 120.0));

    }

    public void disAvailAccommodations() {
        System.out.println("예약 가능 숙소보기");
        for(Accommodation accommodation : accommodations){
            if(accommodation.isAvailable()){
                System.out.println(accommodation);
            }
        }
    }

    public boolean bookedAccommodations(String accommodationName) {
        for(Accommodation accommodation : accommodations){
            //소문자로만 이름들 비교.
            if(accommodation.getName().equalsIgnoreCase(accommodationName) && accommodation.isAvailable()){
                accommodation.book();
                bookedAccommodations.add(accommodation);
                return true; //어디에 리턴?
            }
        }
        return false;//
    }

    public void disBookedAccommodations() {
        System.out.println("예약한 숙소 : ");
        for(Accommodation booked : bookedAccommodations){
            System.out.println(booked);
        }
    }

    public void addAccommodation(String newName, String newlocation, Double newPrice) {
        accommodations.add(new Accommodation(newName,newlocation,newPrice));
    }

    public void removeAccommodation(String delName) {
        boolean result = false;
        for(Accommodation accommodation : accommodations){
            if(accommodation.getName().equalsIgnoreCase(delName) && accommodation.isAvailable()){
                accommodations.remove(accommodation);
                result = true;
                break;
            }
        }
        if(result){
            System.out.println("삭제됨");
        }else{
            System.out.println("삭제 안 됨");
        }
    }


	// public void updateAccommodation(String upName) {
	// 	int i = 0;
    //     int index = -1;
    //     int menu;
    //     boolean flag = true;
    //     Scanner scan = new Scanner(System.in);

    //     Accommodation newA = new Accommodation();
    //     System.out.println(upName);
    //     for(Accommodation a : accommodations){
    //         i++;
    //         if(a.getName().equals(upName)){
    //             index = i - 1;
    //             newA = a;
    //         }
    //         System.out.println(a.getName().equals(upName) + " " + a.getName() + " " + upName);
    //     }


    //     if(index != -1){ //같은 이름이 있다.
    //         System.out.print("무엇을 수정하시겠습니까? \n 1.숙박업소 이름 \t 2.지역 \t 가격 \n  >> ");
    //         menu = scan.nextInt();
    //         scan.nextLine();
    //         while (flag) {

    //             switch (menu) {
    //                 case 1 -> {
    //                     System.out.println("수정할 이름 >> ");
    //                     newA.setName(scan.nextLine());
    //                     accommodations.set(index,newA);
    //                     scan.close(); // ?
    //                     flag = false;
    //                 }
    //                 case 2 -> {
    //                     System.out.println("수정할 지역 >> ");
    //                     newA.setLocation(scan.nextLine());
    //                     accommodations.set(index,newA);
    //                     flag = false;

    //                 }
    //                 case 3 -> {
    //                     System.out.println("수정할 지역 >> ");
    //                     newA.setPricePerNight(scan.nextInt());
    //                     accommodations.set(index,newA);
    //                     flag = false;

    //                 }
    //                 default -> {System.out.println("1~3번 중에 입력해주세요.");}
    //             }
                
    //         }
    //     }else{
    //         System.out.println("찾는 숙소가 없어서 업데이트 불가능.");
    //     }
	// }


	public void updateAccommodation(String upName) {

        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        System.out.println(upName);
        for(Accommodation a : accommodations){

            if(a.getName().equals(upName)){
                System.out.print("무엇을 수정하시겠습니까? \n 1.숙박업소 이름 \t 2.지역 \t 3.가격 \n  >> ");
                    int menu = scan.nextInt();
                    scan.nextLine();
                        while (flag) {

                            switch (menu) {
                                case 1 -> {
                                    System.out.println("수정할 이름 >> ");
                                    a.setName(scan.nextLine());
                                    scan.close();
                                    flag = false;
                                }
                                case 2 -> {
                                    System.out.println("수정할 지역 >> ");
                                    a.setLocation(scan.nextLine());
                                    flag = false;

                                }
                                case 3 -> {
                                    System.out.println("수정할 가격 >> ");
                                    a.setPricePerNight(scan.nextInt());
                                    flag = false;

                                }
                                default -> {System.out.println("1~3번 중에 입력해주세요.");}
                            }
                
                        }

            }

        }

	}


    public void showAccommodation(String upName) {
        for(Accommodation a : accommodations){
            if(a.getName().equals(upName)){
                System.out.println(a);
            }
        }
    }

    
}
