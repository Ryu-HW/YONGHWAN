package a1121.anotherConstructor;

public class CarEx1 {
    public static void main(String[] args) {



        Car car2 = new Car("그랜저"); //여기에 들어가도 안에서 바뀌면 바뀐대로.
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);


        Car car3 = new Car("그랜저","흰색");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.maxSpeed);



        Car car4 = new Car("그랜저","흰색", 300);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);



    }
}
