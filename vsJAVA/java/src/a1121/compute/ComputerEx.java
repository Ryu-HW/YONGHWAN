package a1121.compute;

public class ComputerEx {
    public static void main(String[] args) {
        Computer myCom = new Computer(); //Computer 클래스를 말하는 듯

        int result1 = myCom.sum(1,2,3); //myCom은 폴더를 이어주는 매개체 같은 느낌인듯?
        System.out.println("result1: "+result1);

        int result2 = myCom.sum(1,2,3,3,4,5);
        System.out.println("result2: "+result2);

        int[] numnum = {1,2,3,4,5,6,7,8};
        int result3 = myCom.sum(numnum);
        System.out.println("result3: "+result3);

        int result4 = myCom.sum(new int[] {1,2,3,4,5}); // =을 안 썼다?
        System.out.println("result4: "+result4);
    }
}
