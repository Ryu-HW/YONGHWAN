package a1122.shopping;

public class ProductEx {
    public static void main(String[] args) {
        Product laptop = new Product("노트북",1300000,20);
        Product iPhone = new Product("아이폰",1000000,35);
        Product mouse = new Product("마우스",50000,150);
        Product bag = new Product("가방",75000,20);
        Product sword = new Product("검",450000,5);

        

        Product[] Products = {laptop,iPhone,mouse,bag,sword};

        for(int i = 0; i < Products.length;i++){
            Products[i].checkProduct(); //이건 보이드 매소드
            System.out.println(Products[i].toStr()); //리턴값이 있는 메소드
        }
        System.out.println();


        laptop.setPrice(-500); //세터로 가격 수정
        System.out.println("수정된 가격 :" + laptop.getPrice());
        
        laptop.sellProduct(20);
        laptop.addStock(40);
        sword.sellProduct(20);
        sword.addStock(-5);
    }
}
