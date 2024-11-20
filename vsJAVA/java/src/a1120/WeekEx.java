package a1120;

import java.util.Calendar;

public class WeekEx {
    public static void main(String[] args) {
        //Week 열거 타입 변수 선언
        Week today = null;

        Calendar cal = Calendar.getInstance();

        //오늘의 요일 얻기(1~7) 일요일 = 1.
        int week = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(week);

        switch (week) {
            case 1 -> {today = Week.SUNDAY;}
            case 2 -> {today = Week.MONDAY;}
            case 3 -> {today = Week.THURSDAY;}
            case 4 -> {today = Week.WEDNESDAY;}
            case 5 -> {today = Week.TUESDAY;}
            case 6 -> {today = Week.FRIDAY;}
            case 7 -> {today = Week.SATURDAY;}

            
        }

        if(today == Week.SUNDAY){
                System.out.println("일요일엔 축구");
        }else{
                System.out.println("열심히 자바공부 합니다.");
        }
    }
    //Garbage Collector
}
