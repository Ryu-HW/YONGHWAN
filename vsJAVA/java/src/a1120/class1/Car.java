package a1120.class1;

public class Car {

    String company;
    String model;
    String color;
    int maxSpead;
    int speed;
    
    public Car() {
    }

    public Car(String company, String model, String color, int maxSpead, int speed) { //다섯 인자를 받으면 다섯 개의 인자를 다 써야만 오류가 안 남
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpead = maxSpead;
        this.speed = speed;
    }


    // public Car(String comp,String mod,String col,int maxS,int sp){
    //     company = comp;
    //     model = mod;//둘이 이름이 다를 땐 this가 불필요
    //     this.color = col;
    //     this.speed = maxS; //이러면 Car()안에  maxSpead의 값이 speed에 들어감
    //     this.maxSpead = sp;
        
    // };


    // public Car(){}; //이게 생략돼있음. 안 써주는 이유는 컴파일 단계에서 알아서 써줌(생성자가 없으면?), 생성 방법에따라 써줘야할 때도 있음

}
