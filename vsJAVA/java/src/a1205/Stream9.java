package a1205;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//회원 (Member) 객체에 '남자' 회원의 평균 나이를 
//외부 반복자를 이용하는 방법과 , 내부 반복자 람다식 스트림을 적용하는
//방법으로 코딩하시오
public class Stream9 {
    public static void main(String[] args) {

        // List<Member> list = new ArrayList<>();
        
        List<Member> list = Arrays.asList(
            new Member("박태호",Member.male,30),
            new Member("김연경",Member.feMale,29),
            new Member("손유일",Member.male,32),
            new Member("안재홍",Member.male,27)
        );

        //1. 외부 반복자
        //index값을 사용 for문과 if문으로 남성여성을 구분하고
        //남성나이만 sum 에 누적
        //count로 인원 체크,나눠서 평균값 출력가능

        int count = 0;
        double sum = 0;
        for(int i = 0; i<list.size();i++){
            if(list.get(i).getGender() == Member.male){
                sum = sum + list.get(i).getAge();
                count++;
            }
        }

        System.out.println(count);

        //2.내부 반복자

        // double ageAvg = list.stream().filter(m -> m.getGender() == Member.male).mapToInt(Member::getAge).average().getAsDouble();
        double ageAvg = list.stream().filter(m -> m.getGender() == Member.male).mapToInt(m -> m.getAge()).average().getAsDouble();
        //마지막변환타입 = list를 스트림타입으로 변환 후 해당list의 각 m에대해 male을 갖고있는 것중에, 해당 객체m에대한 나이값을 받아오고(추출). 그 평균을 구한다음, double타입으로 변환
        System.out.println("남자 회원의 평균 나이 : " + ageAvg);

    }
}
