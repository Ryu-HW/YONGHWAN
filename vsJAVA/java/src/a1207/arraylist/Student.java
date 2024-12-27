package a1207.arraylist;

public class Student {
    private String name;
    private int age;
    private String StudentId;
    

    public Student(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        StudentId = studentId;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getStudentId() {
        return StudentId;
    }
    public void setStudentId(String studentId) {
        StudentId = studentId;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", StudentId=" + StudentId + "]";
    }
}
