package a1129.bookLoan;

public class Books {
    private String name;
    private String author;
    private int number;
    private double ISBN;
    
    public Books(String name, String author, int number, double ISBN) {
        this.name = name;
        this.author = author;
        this.number = number;
        ISBN = ISBN;
    }

    public Books() {
    }

    public void loan(){
        this.number = this.number - 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getISBN() {
        return ISBN;
    }

    public void setISBN(double iSBN) {
        ISBN = iSBN;
    }

    @Override
    public String toString() {
        return "책 정보 - 제목 : " + name + ", 저자 : " + author + ", 재고 : " + number + ", ISBN : " + ISBN;
    }


}
