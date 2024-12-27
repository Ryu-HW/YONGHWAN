package a1205.streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
            new Transaction(raoul, 2012, 1100),
            new Transaction(raoul, 2011, 300),
            new Transaction(mario, 2011, 700),
            new Transaction(mario, 2010, 500),
            new Transaction(alan, 2011, 100),
            new Transaction(brian, 2013, 900)
        );

        //brian , mario 거래자 // Cambridge 거래자가 근무하는 도시
        getYearList(transactions);
        getTradersCity(transactions);
        getCambridgeTrader(transactions);
        getNameYear(transactions);
        traderExist(transactions);
        getCambridgeTransaction(transactions);
        traderNames(transactions);
        getMaxPrice(transactions);
        getMinPrice(transactions);


    }
    //1.문제 2011년에 일어난 모든 트랜젝션을 찾아 오름차순(벨류)으로 정렬?

    private static void getYearList(List<Transaction> transactions){
        List<Transaction> result = transactions.stream()
            .filter(m -> 2011 == m.getYear())
            .sorted(Comparator.comparing(Transaction::getValue))//오름차순
            .collect(Collectors.toList()); // ?
        System.out.println(result);

        //.sorted(Comparator.comparing(Transaction::getValue).reversed())//내림차순
        //.sorted((tran1, tran2) -> integer.compare(tran1.getValue(), tran2.getValue()))
    }

    //2.거래자가 근무하는 모든 도시를 중복없이 나열.
    private static void getTradersCity(List<Transaction> transactions){;
        List<String> result = transactions.stream()
            .map((t)->t.getTrader().getCity()) //t(transactions) 객체를 입력받아서 
            //.map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
            //.map(Trader::getCity) //각 거래자에서 도시정보추출
            .distinct() //중복제거
            .collect(Collectors.toList());
        System.out.println(result);
    }

    //3. 케임브리지에서 근무하는 모든 거래자를 찾아 이름순으로 정렬
    private static void getCambridgeTrader(List<Transaction> transactions){
        List<Trader> result = transactions.stream()
            .map((t)->t.getTrader())
            .filter(t -> t.getCity().equals("Cambridge"))
            .sorted(Comparator.comparing(t->t.getName()))
            //.sorted(Comparator.comparing(Trader::getName)) //람다식 ? 
            .collect(Collectors.toList());
        System.out.println(result);

    }

    //4. Raoul 이름을 찾아 그 사람의 거래를 년도순으로 정렬
    private static void getNameYear(List<Transaction> transactions){
        List<Transaction> result = transactions.stream()
            .filter(t -> t.getTrader().getName().equals("Raoul"))
            .sorted(Comparator.comparing(t->t.getYear()))
            .collect(Collectors.toList());
        System.out.println(result);
    }

    //5 밀라노에 거래자가 있는지 확인
    private static void traderExist(List<Transaction> transactions){
        boolean result = transactions.stream()
            .anyMatch(t -> t.getTrader().getCity().equals("Milan")); //참거짓을 가져옴
    }
    //6. 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시요.

    private static void getCambridgeTransaction(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
            .filter(t -> t.getTrader().getCity().equals("Cambridge"))
            .collect(Collectors.toList());
        System.out.println(result);
    }

    //7.모든 거래자의 이름을 알파벳 순으로 정렬

    private static void traderNames(List<Transaction> transactions) {
        String result = transactions.stream()
            .map(t->t.getTrader().getName()) //여기서 이미 string
            .sorted(Comparator.naturalOrder())
            .distinct()
            .collect(Collectors.joining(", "));
        System.out.println(result);
    }

    //8.전체 트랜잭션 중 최댓값은 얼마인가?
    private static void getMaxPrice(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .max(Comparator.comparing(t -> t.getValue())); //해당 값이 제일 높은 Transaction 객체 하나.
            //Optional null 이어도 에러 없음
        System.out.println(result.get().getValue());
    }
    //9.전체 트랜잭션 중 최소값은 얼마인가?
    private static void getMinPrice(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
            .min(Comparator.comparing(Transaction::getValue));

        System.out.println(result.get().getValue());
    }
}
