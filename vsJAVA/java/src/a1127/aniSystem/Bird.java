package a1127.aniSystem;

public class Bird extends Animal{

    
    public Bird(String name, int age) {
        super(name, age); //생성자가 있어야함
    }

    @Override
    void move() {
        System.out.println("날개로 날아간다.");
    }

    @Override
    void sound() {
        System.out.println("짹짹");
        
    }
}