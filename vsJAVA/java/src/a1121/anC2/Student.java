package a1121.anC2;

public class Student {
    //학생의 속성
    //필드명 내지 변수명
    String name;
    int age;
    String stdNo;
    String major;

    
    public Student() {
        this("이름없음",1,"00000000","없음");
    }
    public Student(String name) {
        this(name,1,"00000000","없음");

    }
    public Student(String name,int age) {
        this(name,age,"00000000","없음");
    }
    public Student(String name,int age,String stdNo) {
        this(name,age,stdNo,"없음");
    }

    public Student(String name, int age, String stdNo, String major) {
        this.name = name;
        this.age = age;
        this.stdNo = stdNo;
        this.major = major;
    }

    public void study(String subject) {
        System.out.println(subject + "(을/를) 공부합니다.");
        //반환타입이 void면 리턴값을 생략 가능. 아무것도 안 써도 됨? 근데 안 쓰면 리턴 필요
        //static이면 리턴값이 있어야함 ?
        // return; 없어도됨

        
    }
    public double getAverage(int i, int j) {
        double avg = (double)(i+j)/2;
        return avg;
    }
    public double getAverage(int i, int j, int k) {
        double avg = (double)(i+j+k)/3;
        return avg;
    }
    public double getAverage(int[] score) {
        double avg = 0;
        int sum = 0;


        // for(int i = 0; i<score.length;i++){
        //     sum += score[i];
        // }

        for(int each : score){
            sum += each;
        }

        avg = sum/score.length;;
        return avg;
    }

    
}
