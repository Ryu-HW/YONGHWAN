package a1127.aniSystem;

import java.util.Scanner;

public class AniSys {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Animal animal = null;
        Animal[] animals = new Animal[3];

        String name;
        int age;
        int index = 0;
        while (index < 3) {


            System.out.print("1.개 2.물고기 3.새 >>");
            String input = scan.nextLine();

            if(input.equals("1")){
                System.out.print("이름");
                name = scan.nextLine();
                System.out.print("나이");
                age = scan.nextInt();
                scan.nextLine();

                animals[index++] = new Dog(name,age);
            }
            else if(input.equals("2")){
                System.out.print("이름");
                name = scan.nextLine();
                System.out.print("나이");
                age = scan.nextInt();
                scan.nextLine();

                animals[index++] = new Fish(name,age);
            }
            else if(input.equals("3")){
                System.out.print("이름");
                name = scan.nextLine();
                System.out.print("나이");
                age = scan.nextInt();

                animals[index++] = new Bird(name,age);
            }else{return;}
        
        }
        for(int i = 0; i < animals.length; i++){
            animals[i].move();
            animals[i].sound();
            animals[i].info();
        };
        



    }
}
