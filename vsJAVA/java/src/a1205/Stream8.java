package a1205;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,30,40,50);
        Stream<Integer> stream = list.stream();
        stream.forEach(value -> System.out.println(value + " "));
        //Stream 내부 반복자는 컬렉션 내부에서 요소를 반복시키고
        //개발자는 요소당 처리해야할 코드만 제공
    }
}
