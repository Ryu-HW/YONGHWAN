package a1201.hak5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDAO {

    Scanner scan = new Scanner(System.in);

    private ArrayList<StudentDTO> sList;

    public StudentDAO(){

        sList = new ArrayList<>();
        //4명의 데이터  생성
        StudentDTO s1 = new StudentDTO(0,"테스트1",11,100,90,80);
        StudentDTO s2 = new StudentDTO(1,"테스트2",22,90,89,91);
        StudentDTO s3 = new StudentDTO(2,"테스트3",33,85,77,55);
        StudentDTO s4 = new StudentDTO(3,"테스트4",44,77,68,85);

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);

        // System.out.println(sList);
    }


    private void inset(StudentDTO s) {
        sList.add(s);
        System.out.println("학생 추가 완");
    }


    public void userInsert() {

        // System.out.println("<학생을 추가하기>");
        // System.out.print("이름 :");
        // String name = sc.next();
        // System.out.print("나이 :");
        // int age = sc.nextInt();
        // System.out.print("국어 :");
        // int kor = sc.nextInt();
        // System.out.print("영어 :");
        // int eng = sc.nextInt();
        // System.out.print("수학 :");
        // int math = sc.nextInt();
        // StudentDTO student = new StudentDTO(slist.size(), name, age,kor ,eng ,math);

        // slist.add(student);
        // System.out.println(slist);

        StudentDTO s = new StudentDTO();
        s.setId(sList.size());
        System.out.println("<학생 추가하기>");
        System.out.print("이름 : " );
        s.setName(scan.next());
        System.out.print("나이 : ");
        s.setAge(scan.nextInt());
        System.out.print("국어점수 : ");
        s.setKor(scan.nextInt());
        System.out.print("영어점수 : ");
        s.setEng(scan.nextInt());
        System.out.print("수학점수 : ");
        s.setMath(scan.nextInt());

        inset(s);
              
    }


    public void userDelete() {
        System.out.println("하생정보삭제");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 학생이 없습니다. ");
        }else{
            String name = sList.get(index).getName();
            delete(index);
            System.out.println(name + "학생 정보를 삭제했습니다.");
        }
    }

    private void delete(int index) {
        sList.remove(index); //인덱스번호를 넣어서 삭제도 됨
    }
    // private void delete(StudentDTO student) {
    //     sList.remove(student);
    // }


    private int searchIndex(){
        int index = -1;
        System.out.println("학생 이름을 입력해주세요");
        System.out.println(">>");
        String name = scan.next();
        for(int i=0;i<sList.size();i++){
            if(sList.get(i).getName().equals(name)){
                index = i;
                break;
            }
        }
        return index;
    }


    public void userSelect() {
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 학생이 없습니다.");
        }else{
            System.out.println(sList.get(index));
        }
    }


    public void userUpdate() {
        System.out.println("<학생정보수정>");
        int index = searchIndex();
        if(index == -1){
            System.out.println("찾는 학생이 없습니다.");
        }else{
            StudentDTO s = new StudentDTO();
            s.setId(sList.get(index).getId());
            s.setName(sList.get(index).getName());
            s.setAge(sList.get(index).getAge());

            System.out.println("<"+sList.get(index).getName()+"학생의 정보 수정>");

            System.out.println("국어 점수 : ");
            s.setKor(scan.nextInt());
            System.out.println("영어 점수 : ");
            s.setEng(scan.nextInt());
            System.out.println("수학 점수 : ");
            s.setMath(scan.nextInt());

            update(index,s);
        }
    }

    private void update(int index, StudentDTO s) {
        sList.set(index,s); //해당 index의 자리에 s 덮어쓰기 
    }


    public void printAll() {
        for(int i = 0; i<sList.size();i++){
            System.out.println(sList.get(i));
        }
    }


}
