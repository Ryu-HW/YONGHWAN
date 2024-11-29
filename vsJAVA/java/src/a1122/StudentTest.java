package a1122;

public class StudentTest {
    public static void main(String[] args) {
        Student park = new Student(2019122104, "Park"); 
        Student kim = new Student(2019122107, "Kim"); 
        Student lee = new Student(2019122109, "Lee"); 
        System.out.println("학생(객체) 수 : "+Student.count);
    }
}
class Student {

    static int count = 0;
    //인스턴스 변수
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        Student.count++; // count++; 이것도 됨
    }

}