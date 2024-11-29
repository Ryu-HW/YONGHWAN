package a1126.Doseo;

public class EBook extends Book {
    private double fileSize; //파일을 크기(mb단위)
    private String format; //파일포멧(예 : pdf , epub)

    public EBook(String title, String author, String iSBN, double fileSize, String format) {
        super(title, author, iSBN);//부모(book) 클래스 생성자 호출
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }

    @Override //부모를 이용해 재정의하는 것
    public void displayInfo() {
        
        super.displayInfo();
        System.out.println("page Count "+ fileSize + "MB");
        System.out.println("Format: "+format);

    }

    
    
    
}
