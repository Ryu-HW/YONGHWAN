package a1122;

public class final1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota","Corolla");
        car.display();
        // car.brand = "Honda"; final은 재할당 불가능
        Car car1 = new Car("Toyota1","Corolla1");
        car1.display();

    }
}
class Car {
    final String brand; //final 필드선언
    final String model;
    //객체마다 고유하지만 한 번만 초기화 후 변경할 수 없는 데이터. 한 번 객체를 만들고 값을 주면 변하지 않음
    // static final 모든 객체가 공유되면 한 번 지정하면 변하지 않음
    //final ? 콘스트랑 비슷한듯?
    static final double PI = 3.14159; //static final은 그 자리에서 값을 줘야하는듯?

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display(){
        System.out.println("Brand : " + brand + " , Model : " + model);
    }
    
} 