package a1120.class1;


// String company;
// String model;
// String color;
// int maxSpead;
// int speed;


public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.company = "hyundae";
        car1.model = "K7";
        car1.color = "black";
        car1.maxSpead = 250;
        car1.speed = 120;
        System.out.println("car1의 정보");
        System.out.println(car1.company);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.maxSpead);
        System.out.println(car1.speed);


        Car car2 = new Car();

        car2.company = "hyundae";
        car2.model = "K3";
        car2.color = "white";
        car2.maxSpead = 220;
        car2.speed = 100;

        car2.speed = 2000;
        System.out.println("car2의 정보");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.maxSpead);
        System.out.println(car2.speed);

        Car myCar1 = new Car("기아","그렌저","검정",210,90);

        System.out.println(myCar1.speed);


    }
    
}
