package a1127.aniSystem;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name,age);
    }


    @Override
    void move() {
        System.out.println("네 발로 걷는다");
        
    }

    @Override
    void sound() {
        System.out.println("멍멍");
        
    }

    
}
