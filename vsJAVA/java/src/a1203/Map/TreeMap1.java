package a1203.Map;

import java.util.HashMap; //맵 불러오기 어레이 리스트랑 비슷한 역할인듯?
import java.util.Iterator;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        //put() 메소드를 이용한 요소의 저장

        tm.put(30,"삼십");
        tm.put(10,"십");
        tm.put(40,"사십");
        tm.put(20,"이십");

        System.out.println("맵의 저장된 키들의 집합 : " + tm.keySet()); //들어간 순서가 아니라 정렬이 돼버림 키값으로 정렬
        for(Integer key : tm.keySet()){
            System.out.println(String.format("키 : %s , 값 : %s", key, tm.get(key)));
            //키는 키값, tm.get(key) 는 해당 키의 벨류다.

        };

        TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();

        //put() 메소드를 이용한 요소의 저장

        tm1.put("ㄷㄷㄷ", 30);
        tm1.put("ㄱㄱㄱ",10);
        tm1.put("ㅎㅎㅎ",40);
        tm1.put("ㅅㅅㅅ",20);


        System.out.println("맵의 저장된 키들의 집합 : " + tm1.keySet()); //들어간 순서가 아니라 정렬이 돼버림 키값으로 정렬 가나다 순도 됨
        for(String key : tm1.keySet()){
            System.out.println(String.format("키 : %s , 값 : %s", key, tm1.get(key)));
            //키는 키값, tm.get(key) 는 해당 키의 벨류다.

        };
    }
}
