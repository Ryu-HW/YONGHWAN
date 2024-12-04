package a1204.ramda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ramda3 {
    public static void main(String[] args) {
        
        List<Person> people = new ArrayList<>();

        Person p1 = new Person(1, "허준석", 30);
        Person p2 = new Person(2, "김진짜", 33);
        Person p3 = new Person(3, "박성철", 31);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.forEach(p -> System.out.println(p));

        //나이순으로 정렬
        Collections.sort(people, (pp1, pp2) -> pp1.getAge() - pp2.getAge());
        people.forEach(p->System.out.println(p));
        Collections.sort(people, (pp1, pp2) -> pp2.getName().compareTo(pp1.getName() ));
        people.forEach(p -> System.out.println(p));
    }
}

class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
    
}