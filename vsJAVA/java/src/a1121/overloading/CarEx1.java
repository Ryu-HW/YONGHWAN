package a1121.overloading;

public class CarEx1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);


        Car car2 = new Car("그랜저");
        System.out.println(car2.company);
        System.out.println(car2.model);

        Car car3 = new Car("그랜저","흰색");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);


        Car car4 = new Car("그랜저","흰색", 300);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);



    }
}
