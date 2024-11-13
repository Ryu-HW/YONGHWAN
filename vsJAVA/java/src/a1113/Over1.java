package a1113;

public class Over1 {
    public static void main(String[] args) {

        byte var1 = 125;
        for(int i=0;i<5;i++){
            var1++;
            System.out.println("var1 :"+var1);

        }
        System.out.println("-----------------------");

        // byte var3 = -2;
        // for(byte i=0;i<300;i++){ //영원히 300에 도달할 수 없기에 영원히 반복됨.
        //     var3++;
        //     System.out.println("var3 :"+var3);

        // }
        // System.out.println("-----------------------");

        byte var3 = 0;
        for(byte i=10;i > -9;i++){ // -8까지 실행될 듯? 118번 실행됨. 127에도 한 번 10에도 한 번 실행돼서 127 - 10 + 1 인듯
            var3++;
            System.out.println("var3 :"+var3);

        }
        System.out.println("-----------------------");


        // char var2 = 'a';
        // for(int i=0;i<100;i++){
        //     var2++;
        //     System.out.println("var2 :"+var2);

        // }
        // System.out.println("-----------------------");


    }
}
