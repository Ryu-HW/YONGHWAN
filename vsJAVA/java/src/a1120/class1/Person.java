package a1120.class1;

public class Person {
    private String name; //private는 같은 클래스 내부에서만 사용 가능
    private int age;
    private String gender;

    public Person(String na,int ag,String gender){
        name = na;
        age = ag;
        this.gender = gender;
    }
    
    public Person(){
        
    }

    public void setName(String name,int age,String gender){
        this.name = name;
        this.age =age;
        this.gender = gender;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Person ryu = new Person("yongwhan",50,"male");

        System.out.println("- ryu의 정보 -");
        System.out.println(ryu.name);
        System.out.println(ryu.age);
        System.out.println(ryu.gender);
    }
}
