package a1205;

import java.util.stream.IntStream;

public class Stream6 {
    public static void main(String[] args) {
        IntStream stream1 = IntStream.range(1,4); //1부터 4미만
        stream1.forEach(e -> System.out.println(e +" "));

        IntStream stream2 = IntStream.range(1,4);
        stream2.forEach(System.out::println);

    }
}
