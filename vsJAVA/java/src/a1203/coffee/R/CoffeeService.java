package a1203.coffee;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CoffeeService {

    private boolean reOrder = false; //고객의 추가주문 여부
    private int orderNum = 1;
    Coffee coffee = Coffee.getInstance(); //커피메뉴 관리하는 싱글톤객체





    public CoffeeService(){
        orderList = new LinkedHashMap<>();
        //orderList : 고객주문 저장 순서 중요


    }
    //LinkedHashMap<>()
    //입력순서 또는 접근순서 보장, 속도 : 약간 느림 , 용도 : 순서가 중요한 경우 사용

    //커피 객체 준비
    //손님 
    Customer customer;
    //지연클래스 준비
    Thread t = new Thread(); //아직 안 배움

    Map<String, Integer> orderList;

    Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("\n 어서오세요 연세it커피숍입니다.");

        coffee.getMenu();

        //주문 메소드
        order();

        showOderedMenu();
        start();
    }

    private void order() {
        System.out.println("\n 취소를 원하시면 0번을 눌러주세요.");
        end:while (true) {
            try{
                
                customer = new Customer(orderNum); //주문번호와 함께 잔액이 있음
                
                System.out.println("\n 원하시는 음료의 번호를 선택해주세요");
                String choice = scan.next();
                int choiceNum = Integer.parseInt(choice.substring(0,1)); //한 글자만 추출해서 숫자로 변경
                if(choiceNum == 0){
                    System.out.println("주문 취소");
                    System.exit(0);//빠져나감 ??? 자바 프로그램 종료 명령어라고한다. 0을반환함.(0은 보통 정상종료를 의미)
                }
                scan.nextLine(); //입력된 불필요한 내용 삭제

                String coffeeName = coffee.coffeeList.get(choiceNum-1);
                System.out.println("선택하신 음료는 : "+coffeeName + "입니다. 몇 잔 주문하시겠습니까?");
                int orderCount = scan.nextInt();
                scan.nextLine();
                //재주문 if문

                if(reOrder){
                    for(String coff : orderList.keySet()){
                        if(coff.equals(coffeeName)){
                            int addCount = orderList.get(coff).intValue() + orderCount;
                            //주문한 커피 이름이 이미 있으면 주문리스트의 수량을 불러서 현재 수량에 더함.
                            orderList.replace(coffeeName, addCount);
                        }else{
                            orderList.put(coffeeName, orderCount);
                            break;
                        }
                        
                    }
                }else{
                    orderList.put(coffeeName, orderCount);
                }
                //추가주문 메소드
                addOrder();



                customer.setCoffeeOrder(orderList);
                break end; //지정한 곳으로 빠저나간다

            }catch(Exception e){
                System.out.println("잘못된 선택입니다.");
                continue;
            }

        }

    }

    private void addOrder() {
        reOrder = false;
        System.out.println("\n 주문을 계속하시겠습니까?");
        System.out.println("예(Y) / 아니오(N)");
        String yesOrNo = scan.next();
        if(yesOrNo.equals("예") || yesOrNo.equalsIgnoreCase("y")){
            coffee.getMenu();
            reOrder = true;
            order();
        }else if(yesOrNo.equals("아니오") || yesOrNo.equalsIgnoreCase("n")){
            return;
        }
    }

    private void showOderedMenu() {
        Customer customer = new Customer(orderNum);

        //맵객체의 menu를 만들고
        Map<String, Integer> menu;

        //coffee객체 내의 menu값을 받아오기
        menu = coffee.getMenuMap();
        int priceSum = 0;

        System.out.println("\n주문번호 : " + orderNum++);
        System.out.println("----------주문내역----------");
        for(Entry<String, Integer> list : orderList.entrySet()){
            int price = 0;
            for(Entry<String, Integer> get : menu.entrySet()){ 
                if(get.getKey().equals(list.getKey())){
                    price = price + (get.getValue()*list.getValue());
                }

            }
            priceSum = priceSum + price;
            
            // System.out.printf("%s \t  %d   %d원\n" ,list.getKey(), list.getValue(),price);
            System.out.printf("|   %-12s  %6d  %6d원|\n", list.getKey(), list.getValue(), price);

            // %-8s: 문자열을 왼쪽 정렬하고, 최소 8자 너비를 차지하도록 설정합니다. 8자보다 짧은 문자열은 오른쪽에 공백을 채웁니다.
            // %6d: 숫자를 최소 6자리로 출력하며, 자릿수가 부족하면 앞에 공백을 채워 출력합니다.
            // %6d: 가격을 최소 6자리로 출력합니다. 원은 숫자 뒤에 붙게 됩니다.

        }
        System.out.println("\n 총 가격 : "+ priceSum);

        System.out.println("----------------------------\n");
        System.out.println(orderNum+"번 손님의 남은 금액은 "+(customer.getMoney()-priceSum)+"입니다.");

        

    }

}
