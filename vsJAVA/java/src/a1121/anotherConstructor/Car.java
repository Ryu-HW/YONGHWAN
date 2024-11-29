package a1121.anotherConstructor;

public class Car {

    public String company = "현대자동차";
    public String model;
    public String color;
    public int maxSpeed;


    public Car(String model){
        this("자가용","은색",250); //순서대로 넣어야함.
    }

    public Car(String model, String color){
        this(model,color,250);
    }

    public Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
