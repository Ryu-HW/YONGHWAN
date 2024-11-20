package a1118;

import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        // for(int i = 0; i < numArr.length; i++){
        //     System.out.print(numArr[i]+", ");
        // }
        System.out.println(Arrays.toString(numArr));


        for(int i = 0; i < 100;i++){
            int n = (int)(Math.random()*10);
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        System.out.println(Arrays.toString(numArr));

    }
}
