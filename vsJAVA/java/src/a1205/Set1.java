package a1205;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//자바 컬렉션
//다수의 데이터를 쉽고 효과적으로 처리
//List인터페이스
//Map
//Set

public class Set1 {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<String>();

        set.add("apple");
        set.add("banana");
        set.add("pyopyo");
        set.add("kiwi");
        System.out.println();
        for(String e : set){
            System.out.println(e);
        }

        set.remove("apple");
        set.add("orenge");
        set.add("orenge"); //중복 요소 저장 x

        for(String e : set){
            System.out.println(e);
        }

        Iterator<String> iterSet = set.iterator();

        while (iterSet.hasNext()) {
            System.out.println(iterSet.next()+" ");
            
        }
        System.out.println();
        System.out.println(set);

        System.out.println(set.contains("orange"));

        set.clear();//전체 삭제
        System.out.println(set);
        System.out.println(set.isEmpty());

    }

}
