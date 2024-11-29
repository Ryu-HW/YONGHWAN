package a1121.method;

public class MethodType {
    
    String name;

    public String primeName(String name) {
        this.name = name;
        return name;
    }

    public void primeNumber() {
        System.out.println("10");
    }

    public double multiply(double ...num) {
        double result = 1;
        for(double eachnum : num){
            result = eachnum*result;
        }
        return result;
    }






}
