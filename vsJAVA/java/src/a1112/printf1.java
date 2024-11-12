package a1112;

public class printf1 {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("상품의 가격:%d원\n",value); //%d 는 정수를 의미.
        System.out.printf("상품의 가격:%6d원\n",value); // %6d 총 6자리수.
        System.out.printf("상품의 가격:%-6d원\n",value); //%-6d 총 6자리인데 앞에부터 채움
        System.out.printf("상품의 가격:%06d원\n",value); //%06d 6자리 중 남은 자리에 0 채움

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넒이:%10.2f\n",10,area); //총 10자리인데 소수점은 2자리인 float로 보여라, 소수점 반올림함

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%d | %-10s | %10s \n", 1, name, job);

    }
}
