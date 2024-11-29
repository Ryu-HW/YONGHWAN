package a1127.aniSystem;

public class Fish extends Animal {

    
    public Fish(String name, int age) {
        super(name, age);
    }


    @Override
    void sound() {
        System.out.println("...");
        
    }

    @Override
    void move() {
        System.out.println("지느러미 헤엄");
        
    };
    
    
}
