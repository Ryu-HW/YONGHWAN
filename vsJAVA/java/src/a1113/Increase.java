package a1113;

public class Increase {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println(x); //12
        System.out.println("---------------------------------");

        z = x++;
        // z = (x=x+1); // z = ++x; 와 같음

        // z = x = x + 1; 와 좀 다르긴함 여기선 13,13나옴 뒤에있는 ++ 은 라인하나를 추가해야할 듯.

        //여기서 z는 12, 그 후 x가 13으로 1 증가.
        System.out.println(z); //12
        System.out.println(x); //13

        // z = 12; , x = 13; , y = 10;
        System.out.println("---------------------------------");

        z = ++x + y++;

        System.out.println(z); //24
        System.out.println(y); //11
        System.out.println(x); //14

    }
}
