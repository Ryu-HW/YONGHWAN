package a1122.school;

public class StudentEx {
    public static void main(String[] args) {
        Student a = new Student("류", "20141111", 80, 122, 67);
        Student b = new Student("용", "20141112", 88, 98, 89);
        Student c = new Student("환", "20141113", 92, 100, 52);
        System.out.println("총 학생 수는"+Student.count+"명 입니다.");
        Student[] students = {a,b,c};
        for(int i = 0; i<students.length;i++){
            System.out.println(students[i].toStr());
        }
        System.out.println();
        System.out.println();
        System.out.println(Student.allStudentAvg(students));


        a.setEng(82);
        
        a.getAvg();
        // System.out.println(a.getAvg()); //값을 리턴해서 출력하면서 실행도 됨

        
    }
}
