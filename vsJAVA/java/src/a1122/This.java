package a1122;

public class This {
    public static void main(String[] args) { //메인을 갖고 있는 애만 퍼블릭을 붙여야함.
        Person person = new Person("Alice");

        person.display();
    }
}
class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    void display(){
        System.out.println("Name: " + this.name);
    }
    
}