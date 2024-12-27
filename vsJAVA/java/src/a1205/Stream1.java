package a1205;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Stream1 {
    public static void main(String[] args) {
        int[] data = {5,6,4,2,3,1,1,2,2,4,8};
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i = 0; i < data.length;i++){
            if(data[i] % 2 == 0){
                dataList.add(data[i]);
            }
        }

        HashSet<Integer> dataSet = new HashSet<>(dataList);

        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        System.out.println(dataSet);


        //역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());

        //순방향
        // distinctList.sort(Comparator.naturalOrder());

        int[] result = new int[distinctList.size()];

        for(int i = 0; i < distinctList.size();i++){
            result[i] = distinctList.get(i);
        }
        for(int num : result){
            System.out.println(num + " ");
        }

    }
}
