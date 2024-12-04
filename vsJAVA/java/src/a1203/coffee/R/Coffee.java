package a1203.coffee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Coffee {
    
    //싱글톤
    private static Coffee instance;

    private Coffee(){

    }

    public static Coffee getInstance(){
        if(instance == null){ //아직 객체생성 전이면
            instance = new Coffee(); //객체 생성
        }
        return instance;
    }

    //메뉴 리스트로 저장
    ArrayList<String> coffeeList; //커피메뉴의 리스트
    ArrayList<Integer> coffeePrice; //메뉴 가격
    Map<String, Integer> menu; //String 키값에 Integer가 들어가는 Map객체인 menu.

    public Map<String, Integer> getMenuMap() {
        return menu;
    }

    public void getMenu(){
        menu = new LinkedHashMap<String, Integer>();
        coffeeList = new ArrayList<>();
        coffeePrice = new ArrayList<>();

        coffeeList.add("에스프레소");
        coffeeList.add("아메리카노");
        coffeeList.add("아이스 아메리카노");
        coffeeList.add("카페라떼");
        coffeeList.add("아이스 카페라떼");
        coffeeList.add("카푸치노");
        coffeeList.add("아이스 카푸치노");

        // System.out.println(coffeeList);

        coffeePrice.add(500);
        coffeePrice.add(2000);
        coffeePrice.add(2500);
        coffeePrice.add(3000);
        coffeePrice.add(3000);
        coffeePrice.add(3500);
        coffeePrice.add(3500);
        for(int i=0; i < coffeeList.size(); i++){
            menu.put(coffeeList.get(i), coffeePrice.get(i));
        }
        DecimalFormat f = new DecimalFormat("0,000원"); //형식만들기?
        StringBuffer st = new StringBuffer();
        st.append("\n\n")
        .append("+-------------------------------------------------+\n")
        .append("+-------------------- 메뉴판 ---------------------+\n")
        .append("|         menu                      price         |\n");
        System.out.println(st.toString());
        int s=1;
        for(Entry<String, Integer> get : menu.entrySet()){ //맵값을 가져오는 객체? 순회하기위해 많이 쓰이는 듯
            //Entry<String, Integer> 타입의 get 객체로 키-값 쌍을 순회
            System.out.printf("|   [%d번]  %-20s\t:  %s|\n", s, get.getKey(), f.format(get.getValue()));
            s++;

        }
        System.out.println("+-------------------------------------------------+");

    }
}
