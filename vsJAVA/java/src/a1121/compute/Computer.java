package a1121.compute;

public class Computer {

    public int sum(int...  nums) {
        int sum = 0;
        for(int eachNum : nums){
            sum+=eachNum;
        }
        return sum;
    }
    
}
