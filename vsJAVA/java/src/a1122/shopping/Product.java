package a1122.shopping;

public class Product {
    private String name;
    private double price;
    private int stock;


    Product(String name, double price, int stock) {
        this.name = name;

        if(price < 0){
            this.price = 0;
            return;
        }else{this.price = price;}

        if(stock < 0){
            this.stock = 0;
            return;
        }else{this.stock = stock;}
    }
    
    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    double getPrice() {
        return price;
    }

    // public void setPrice(double price) {
    //     if(price < 0){
    //         this.price = 0;
    //         return; //안 써도 됨 값을 반환하는 게 아니라서, 근데 이거하면 끝내라 라는 의미
    //     }else{
    //         this.price = price;
    //     }
    // }

    void setPrice(double price) {
        if(price < 0){
            if(this.price == 0){ //double의 기본 값은 0원이라서.
                System.out.println("음수가 입력되어 가격이 바뀌지 않았습니다.");
            }else{
                System.out.println("음수가 입력되어 가격이 0원으로 입력됩니다.");
                this.price = 0;
            }
            return; //안 써도 됨 값을 반환하는 게 아니라서, 근데 이거하면 끝내라 라는 의미
        }else{
            this.price = price;
            System.out.println("가격이 "+price+"로 입력됩니다.");

        }
    }

    public int getStock() {
        return stock;
    }

    void setStock(int stock) {
        if(stock < 0){
            this.stock = 0;
            return;
        }else{
            this.stock = stock;
        }
    }

    void addStock(int amount){
        if(amount < 0){
            System.out.println(this.name + " 재고 추가 실패(음수)");
        }else{
            this.stock = stock + amount;
            System.out.printf("%s의 재고가 %d개 추가됩니다. 현재 %s의 재고는 %d개입니다.\n",this.name,amount,this.name,this.stock);

        }
    }


    void checkProduct(){
        System.out.printf("%s의 가격은 %.2f원, 재고는 %d개 남았습니다.\n",this.name,this.price,this.stock);

    }
    void sellProduct(int amount){
        if(amount < 0){
            System.out.println(this.name +" 구매 실패(구매량 음수)");
        }else{
            if(stock < amount){
                System.out.println(this.name +" 구매 실패(재고 부족)");
            }else{
                this.stock = stock - amount;
                System.out.printf("%s를(을) %d개 구매했습니다. 재고는 %d개입니다.\n",this.name,amount,this.stock);
            }
        }
    }

    public String toStr() {
        return String.format("제품명 : %s , 가격 : %.2f , 재고 : %d",this.name,price,stock); //this 써도 안 써도 상관없음 생성자 만들 때 설정해둠
    }




}
