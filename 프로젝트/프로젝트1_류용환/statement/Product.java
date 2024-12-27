package a1204.statement;

import java.text.DecimalFormat;

public class Product {
    String name;
    int each;
    int price;
    
    DecimalFormat df = new DecimalFormat("#,###원");


    public Product(String name, int each, int price) {
        this.name = name;
        this.each = each;
        this.price = price;
    }


    @Override
    public String toString() {
        return "제품명 : "+name + ", " + each + "개, 총" + df.format(price);
    }
    
}
