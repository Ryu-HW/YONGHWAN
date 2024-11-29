package a1121.object;

public class CarTest {
    public static void main(String[] args) {
        Car genesis = new Car("g80", "black", 1000);

        System.out.println("모델명 : " + genesis.model);
        System.out.println("색상 : " + genesis.color);
        System.out.println("가격(단위: 만 원) : " + genesis.price);

        genesis.powerOn();
        genesis.accelerate(); //제네시스 객체와 연결된 클래스 내부의 매서드 accelerate를 불러오는 듯? 
        stop();
    }

    static void stop() {
        System.out.println("멈춘다.");
    }
}
