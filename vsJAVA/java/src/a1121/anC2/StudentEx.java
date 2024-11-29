package a1121.anC2;

public class StudentEx {
    public static void main(String[] args) {
        //Student 객체 생성

        Student student = new Student();

        student.name = "유영슈";
        student.age = 31;
        student.stdNo = "2013000000";
        student.major = "컴퓨터시스템공학과";

        int[] score = {10,20,30,40,50};

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stdNo);
        System.out.println(student.major);


        student.study("Java");

        System.out.printf("학생1 - 중간고사 점수 : %.2f \n" , student.getAverage(10,20));
        System.out.printf("학생1 - 기말고사 점수 : %.2f \n" , student.getAverage(30,40,50));
        System.out.printf("학생1 - 최종고사 점수 : %.2f \n" , student.getAverage(score));

        Student student2 = new Student("김승현",20,"20230002","전자공학");






        
        Student student1 = new Student("환");

        System.out.println(student1.name);
    }
}
