package a1122;

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Honda", "Civic");
        car1.display();
        car2.display();
        car3.display();


    }
}
class Car{

    String brand;
    String model;
    
    public Car() {
        this("unknown","Unknown");
    }

    Car(String brand){
        this(brand,"Unknown");
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display(){
        System.out.println("Brand: " + brand + " , Model: " + model);
    }
    

}