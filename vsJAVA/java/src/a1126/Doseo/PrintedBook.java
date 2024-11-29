package a1126.Doseo;

public class PrintedBook extends Book {
    private int pageCount;
    private double weight; //책의 무게

    public PrintedBook(String title, String author, String iSBN, int pageCount, double weight) {
        super(title, author, iSBN);
        this.pageCount = pageCount;
        this.weight = weight;
    }

    
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public void displayInfo() {
        
        super.displayInfo();
        System.out.println("Page Count: "+pageCount);
        System.out.println("Weight: "+pageCount+"kg");
    }



}
