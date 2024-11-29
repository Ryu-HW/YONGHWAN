package a1122;

public class WebtoonTest {
    public static void main(String[] args) {
        Webtoon w1 = new Webtoon("나 혼자만 레벨업", "판타지", "추공");
        Webtoon w2 = new Webtoon("스위트집", "스릴러", "킨비");
        Webtoon w3 = new Webtoon("이태원클래식", "드라마", "광진");

        Webtoon[] Webtoons = {w1,w2,w3};
        //Webtoon 배열에 여러개의 객체 한 번에 저장
        // for(int i = 0; i< Webtoons.length;i++){
        //     System.out.print(Webtoons[i].getTitle()+" , ");
        //     System.out.print(Webtoons[i].getGenre()+" , ");
        //     System.out.println(Webtoons[i].getAuthor());
        // }

        for(int i = 0; i< Webtoons.length;i++){
            System.out.println(Webtoons[i].toStr());
        }
        System.out.println(Webtoon.count());

    }
}
class Webtoon{
    private String title; //제목
    private String genre; //장르
    private String author; //저자

    // public static int getCount() {
    //     return count;
    // }

    public static String count() {
        return String.format("%s", count);
    }

    public String toStr(){
        return String.format("Webtoon{title:%s, genre:%s, author:%s}",title, genre, author); //스트링형식으로 반환함.
    }
    // public String getTitle() {
    //     return title;
    // }


    // public String getGenre() {
    //     return genre;
    // }


    // public String getAuthor() {
    //     return author;
    // }

    

    private static int count = 0;


    public Webtoon(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        Webtoon.count++;
    }
    
    

    

}