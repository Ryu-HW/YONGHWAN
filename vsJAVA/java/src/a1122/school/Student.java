package a1122.school;

public class Student {
    private String name;
    private String idNum;
    private int kor;
    private int math;
    private int eng;

    private double avg;

    static int count = 0;
    public Student(String name, String idNum, int kor, int math, int eng) {
        this.name = name;
        this.idNum = idNum;
        if(kor < 0 || kor > 100){
            System.out.println(name+"학생의 국어 점수가 제대로 입력되지 않았습니다. 다시 기입해주세요.");

        }else{
            this.kor = kor;
        }
        if(math < 0 || math > 100){
            System.out.println(name+"학생의 수학 점수가 제대로 입력되지 않았습니다. 다시 기입해주세요.");

        }else{
            this.math = math;

        }
        if(eng < 0 || eng > 100){
            System.out.println(name+"학생의 영어 점수가 제대로 입력되지 않았습니다. 다시 기입해주세요.");

        }else{
            this.eng = eng;

        }
        count++;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        if(kor < 0 || kor > 100){
            System.out.println("국어 점수가 제대로 입력되지 않았습니다. 다시 기입해주세요.");

        }else{
            this.kor = kor;
            System.out.println(name+"의 영어 점수가 " +kor+"점으로 변경되었습니다");

        }
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        if(math < 0 || math > 100){
            System.out.println("수학 점수가 제대로 입력되지 않았습니다. 다시 기입해주세요.");
        }else{
            this.math = math;
            System.out.println(name+"의 영어 점수가 " +math+"점으로 변경되었습니다");
        }
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        if(eng< 0 || eng > 100){
            System.out.println("영어 점수가 제대로 입력되지 않았습니다. 다시 기입해주세요.");

        }else{
            this.eng = eng;
            System.out.println(name+"의 영어 점수가 " +eng+"점으로 변경되었습니다");
        }
    }

    public String toStr() {
        return String.format("학생의 이름 : %s , ID : %s , 국어 : %d , 수학 : %d , 영어 : %d", name, idNum, kor,math,eng);
    }

    public double getAvg(){
        avg =  (kor+math+eng)/3;
        System.out.printf("%s학생의 국영수 평균은 %.2f입니다.",name,avg);
        return avg;
    } //값을 반환하면서 sout도 함



    public static double allStudentAvg(Student[] students){
        double sum =0;
        double allStudentAvg = 0;
        for(int j =0; j<students.length;j++){
            sum = sum + students[j].getAvg();
        };
        allStudentAvg = sum / count;
        return allStudentAvg;
    }
}
