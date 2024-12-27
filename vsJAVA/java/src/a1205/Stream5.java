package a1205;

import java.util.stream.Stream;

public class Stream5 {
    public static void main(String[] args) {
        //가변 매개변수

        Stream<Double> stream = Stream.of(4.2,2.5,3.1,1.5); //전달되는 값이 몇 개인지 모를 때
        //of()메서드를 사용하면 가변 매개변수를 전달받아서 스트림을 만든다.. 무슨말이여
        stream.forEach(System.out::println);
    }
}
