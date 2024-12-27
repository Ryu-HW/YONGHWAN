package a1207.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice",20,"S001"));
        students.add(new Student("Bob",22,"S002"));
        students.add(new Student("Charlie",19,"S003"));

        boolean run = true;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("---학생 관리 프로그램---");
            System.out.println("1. 학생 추가하기");
            System.out.println("2. 학생들 리스트 보기");
            System.out.println("3. 학생수정");
            System.out.println("4. 학생삭제");
            System.out.println("5. Exit");
            System.out.print("선택은 ?");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1->{
                    System.out.print("이름 : ");
                    String name = scan.nextLine();
                    System.out.print("나이 : ");
                    int age = scan.nextInt();
                    scan.nextLine();
                    System.out.print("아이디 : ");
                    String id = scan.nextLine();

                    students.add(new Student(name, age, id));
                    System.out.println("추가 완");

                }
                case 2->{
                    if(students.isEmpty()){
                        System.out.println("등록된 학생 없음");
                    }else{
                        for(Student stu : students){
                            stu.toString();
                        }
                    }

                }
                case 3->{
                    System.out.println("학생입력");
                    String updateId = scan.nextLine();
                    boolean found = false;
                    for(Student stu : students){
                        if(stu.getStudentId().equals(updateId)){
                            System.out.print("새 이름 : ");
                            String name = scan.nextLine();
                            stu.setName(name);
                            System.out.print("새 나이 : ");
                            int age = scan.nextInt();
                            scan.nextLine();
                            stu.setAge(age);
                            System.out.println("수정완");
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("찾는 학생 없음");
                    }
                }
                case 4 -> {
                    System.out.println("학생입력");
                    String delId = scan.nextLine();
                    boolean found = false;
                    for(Student stu : students){
                        if(stu.getStudentId().equals(delId)){
                            students.remove(stu);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("찾는 학생 없음");
                    }
                }
                
                case 5 ->{
                    System.out.println("프로그램 끝");
                    scan.close();
                    //System.exit(0);
                    // return; //현재 메서드 전체를 종료.
                    run = false;
                }
                
            
                default -> {}

            }
        }

    }

}