package a1127.aniSystem;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void sound();
    abstract void move();

    public void info(){
        System.out.println(this.getClass().getSimpleName() + " : " + name + " 나이 : " + age); //클래스의 클래스 명 갖고오기
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
}
