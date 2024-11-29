package a1121.methodOverloding;

public class Calculator {

    public double add(double ...num){
        double sum = 0;
        for(double eachnum:num){
            sum = sum + eachnum;
        }
        return sum;
    }
}
