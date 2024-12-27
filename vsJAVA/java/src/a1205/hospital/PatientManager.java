package a1205.hospital;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManager {
    private static ArrayList<Patient> patients; //환자 목록

    Scanner scan = new Scanner(System.in);

    public String hospital = "#     #    " + " ###     " + " ####     " + "#####    " + "#####    " + "#####      " + "#        " + "#\n"
                            +"#     #    " + "#   #    " + "#         " + "#   #    " + "  #      " + "  #       " + "# #       " + "#\n"
                            +"#######    " + "#   #    " + "#####     " + "#####    " + "  #      " + "  #      " + "#####      " + "#\n"
                            +"#     #    " + "#   #    " + "    #     " + "#        " + "  #      " + "  #     " + "#     #     " + "#\n"
                            +"#     #    " + " ###     " + "####      " + "#        " + "#####    " + "  #    " + "#       #    " + "#####\n";

    public PatientManager() {
        patients = new ArrayList<>();
        patients.add(new Patient("홍길동", "치과", "12:30"));
    }

    public void patientAppointment() {
        System.out.println("====환자 등록====");
        System.out.print("이름: ");
        String name = scan.next();
        scan.nextLine();
        System.out.print("진료 내용: ");
        String disease = scan.next();
        scan.nextLine();
        System.out.print("예약 시간: ");
        String time = scan.next();
        scan.nextLine();
        patients.add(new Patient(name, disease, time));
        System.out.println("접수 중입니다.");
        System.out.println("\n" + name + "님, 진료가 접수되었습니다.");
    }

    public void patientPrint() {
        boolean patientAppoint = false;
        System.out.print("등록된 정보를 보고싶은 환자의 이름 : ");
        String name = scan.next();
        for(Patient list : patients){
            if(list.getName().equalsIgnoreCase(name)){
                patientAppoint = true;
                System.out.println("등록정보: "+list.getDisease() +" "+list.getTime());
            }
        }
        if (!patientAppoint) {
            System.out.println("정보가 존재하지 않습니다");
            return;
        }
    }

    public void adminMenu() {
        while (true) {
            System.out.println("\n======= 관리자 메뉴 =======\n");
            System.out.println("1. 환자 등록 목록");
            System.out.println("2. 환자 등록 삭제");
            System.out.println("3. 환자 정보 수정");
            System.out.println("4. 메인으로 돌아가기\n");
            System.out.print("입력 > ");
            
            int choice = -1;
            try {
                choice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자만 입력하세요.");
                scan.next();
                continue;
            }

            switch (choice) {
                case 1 -> {
                    printAll();
                }
                case 2 -> {
                    cancelAppoint();
                }
                case 3 -> {
                    updatePatient(); //환자 정보 수정

                }
                case 4 -> {
                    return; //while문을 나가는 거였다.
                }
                
            
                default -> {
                    System.out.println("잘못 입력했어요 다시 입력해주세요.");
                }
            }
        }
    }

    private void printAll() {
        for(Patient Patient : patients){
            System.out.println(Patient);
        }
        if(patients.isEmpty()){
            System.out.println("환자가 존재하지 않아요");
            return; //와일문을 빠져나가는 듯?
        }
    }


    private void cancelAppoint() {
        boolean patientFound = false;
        System.out.print("삭제하고 싶은 환자 이름 : ");
        String cancelName = scan.next();

        for(Patient patient : patients){
            if(patient.getName().equalsIgnoreCase(cancelName)){
                patients.remove(patient);
                System.out.println("\n" +cancelName+"님의 정보가 삭제되었습니다.");
                patientFound = true;
                break;
            }
        }
        if(!patientFound){
            System.out.println("존재하지 않는 환자 정보입니다.");
        }
    }

    private void updatePatient() {
        boolean patientFound = false;
        System.out.println("정보를 수정할 환자 이름 : ");
        String name = scan.next();

        for(Patient patient : patients){
            if(patient.getName().equalsIgnoreCase(name)){

                System.out.println("수정하고 싶은 정보를 선택하세요");
                System.out.println("1. 과 | 2. 예약시간");
                System.out.print("입력> ");
                String updateNum = scan.next();
                if(updateNum.equals("1")){
                    System.out.println("과 수정>");
                    String updateDisease = scan.next();
                    patient.setDisease(updateDisease);
                    System.out.println("해당 과가 수정되었습니다.");
                    break;
                }else if(updateNum.equals("2")){
                    System.out.println("예약시간 수정>");
                    String updateTime = scan.next();
                    patient.setTime(updateTime);
                    System.out.println("예약시간이 수정되었습니다.");
                    break;
                }else{
                    System.out.println("잘못 입력했습니다");
                    break;
                }
            }
            }
            if(!patientFound){
                System.out.println("존재하지 않는 환자 정보입니다.");
            }
    }

}
