package a1205;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set2 {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("apple");
        items.add("banana");
        items.add("orange");
        items.add("apple");
        items.add("grape");

        Set<String> uniqueItems = new HashSet<>(items);

        System.out.println("중복 제거 후 리스트 : "+ uniqueItems);
    }
    //중복
}
