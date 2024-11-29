package a1127.shape;

import java.util.Scanner;

public class ShapeMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Shape shape = null;
        double width = 0.0;
        double height = 0.0;
        double radius = 0.0;
        
        //총합
        double roundSum = 0.0;
        double areaSum = 0.0;

        //입력 받은 도형 정보 배열
        Shape[] shapeList = new Shape[3];
        int index = 0;

        while (true) {
            if(index ==3) break;

            System.out.println("1.삼 2. 사 3.원");
            System.out.println(">>");
            String input = scan.next();

            if(input.equals("그만")){break;}

            switch (input) {
                case "1" -> {System.out.print("가로>>");
                width = scan.nextDouble();
                System.out.print("높이>>");
                height = scan.nextDouble();
                shape = new Triangle(width,height); //업캐스팅
                shapeList[index++] = shape;}

                case "2" -> {System.out.print("가로>>");
                width = scan.nextDouble();
                System.out.print("높이>>");
                height = scan.nextDouble();
                shape = new Rectangle(width,height); //업캐스팅
                shapeList[index++] = shape;}

                case "3" -> {System.out.print("반지름>>");
                radius = scan.nextDouble();
                shape = new Circle(radius); //업캐스팅
                shapeList[index++] = shape;}

            }

        }
        for(Shape s : shapeList){
            if(s == null) continue;

            //instance of 인스턴스를 비교하는 연산
            if(s instanceof Triangle){
                System.out.println("[삼각형]");
            }
            if(s instanceof Rectangle){
                System.out.println("[사각형]");
            }
            if(s instanceof Circle){
                System.out.println("[원형]");
            }

            double area = s.area();
            double round = s.round();

            roundSum = roundSum + round;
            areaSum = areaSum + area;

            System.out.print("넓이 : " + area + " \t");
            System.out.print("둘레 : " + area + " \t");
            System.out.println();
        }
        System.out.println("둘레 총합 : " + roundSum);
        System.out.println("넓이 총합 : " + areaSum);
    }
}
