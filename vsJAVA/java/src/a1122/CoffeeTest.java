package a1122;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee cup1 = new Coffee("아메리카노", 3000);


        System.out.println(cup1.getName() +" "+ cup1.getPrice());
        cup1.setPrice(cup1.getPrice()+500);
        System.out.println("인상된 가격은 " + cup1.getPrice());
    }
}
class Coffee{
    private String name; //직접 name 접근이 불가능
    private int price;


    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int increasePrice(int price){
        this.price = this.price + price;
        System.out.println(this.name + "이(가)" + price + "원 인상되어" + this.price +"원 입니다.");
        return this.price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}