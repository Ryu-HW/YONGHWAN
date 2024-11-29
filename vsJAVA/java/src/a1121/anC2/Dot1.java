package a1121.anC2;

public class Dot1 {

    private static void printNumbers(int... num) { //들어온 놈들이 num배열이 됨.

        for(int eachnum : num){
            System.out.println(eachnum);
        }

    }
    public static void main(String[] args) {
        printNumbers(1,2,3);
        printNumbers(10,20);
    }

}
