package a1127.downCasting;

class Animal{
    public void move(){
        System.out.println("움직입니다.");
    }
}
class Bird extends Animal{
   
    public void bark(){
        System.out.println("짹짹");
    }

    @Override
    public void move() {
        System.out.println("날아갑니다.");
    }
}

public class DownCasting1 {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        // Bird bird = new Bird();
        // animal.move();
        // bird.bark();
        // bird.move();
        Animal animal = new Bird(); //업캐스팅(자동) 변환개념인듯? 메커니즘을 바꾸는 느낌
        // Bird bird = (Bird) animal;

        animal.move(); //날아갑니다.

        // animal.bark(); // 안 됨

        // 다운캐스팅
        if(animal instanceof Bird){ //만약 동물이 새의 경우라면? , instance = 예, 경우. 여기서 객체를 만들어도 됨
            Bird bird = (Bird) animal;
            bird.bark();
            animal.move(); //날아갑니다.
        }else{
            System.out.println("Bird 타입이 아닙니다.");
        }

        // if(animal instanceof Bird bird){ //만약 동물이 새의 경우라면? , instance = 예, 경우. 여기서 객체를 만들어도 됨
        //     // Bird bird = (Bird) animal;
        //     bird.bark();
        //     animal.move();
        // }else{
        //     System.out.println("Bird 타입이 아닙니다.");
        // }

        // "Animal 타입의 변수 animal이 Bird 클래스의 객체를 참조하게 되지만,
        //  animal은 Animal 클래스에서 정의된 속성과 메서드만 직접 사용할 수 있다.
        //   다만, Bird 클래스에서 오버라이드된 메서드는 호출할 수 있으며,
        //    Bird 클래스에만 있는 메서드는 형변환을 통해 사용할 수 있다." 
    }
}
