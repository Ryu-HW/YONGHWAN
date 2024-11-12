package a1112;

public class FloadDouble {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789f; //float 뒤에는 f를 붙여야한다 이유는몰루
        double var2 = 0.1234567890123456789;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);

        double var3 = 3e6; //3*10의6승
        float var4 = 3e6f;
        double var5 = 2e-3;

        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

    }
}
