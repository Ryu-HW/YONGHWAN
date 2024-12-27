package a1205;

public class Member {
    public static int male = 1; //남자
    public static int feMale = 0; //남자
    //클래스 변수는 클래스명, 변수명 바로 접근 가능
    private String name;
    private int gender;
    private int age;


    public Member(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    

}
