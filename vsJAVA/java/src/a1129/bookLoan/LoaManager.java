package a1129.bookLoan;

import java.util.ArrayList;
import java.util.Scanner;

public class LoaManager {
    private ArrayList<Books> books;
    private ArrayList<Books> LoanedBooks;
    Scanner scan = new Scanner(System.in);

    public LoaManager() {
        books = new ArrayList<>();
        LoanedBooks = new ArrayList<>();
        books.add(new Books("가", "저자1", 4, 123456));
        books.add(new Books("나", "저자2", 1, 123457));
        books.add(new Books("다", "저자3", 2, 123458));

    }

    public void showAllBooks() {
        for(Books book : books){
            System.out.println(book);
        }
    }

    public void searchBook(String bookName) {
        for(Books book : books){
            if(book.getName().equals(bookName)){
                System.out.println(book);
                if(book.getNumber() == 0){
                    System.out.println("해당 도서는 재고가 없어서 대여가 불가능 합니다.");
                }else{
                    System.out.println("해당 도서의 재고가 있습니다. 대여하시겠습니까? \n 1. 네 2. 아니오");
                    System.out.print(" >> ");
                    int choice = scan.nextInt();
                    scan.next();
                    switch (choice) {
                        case 1-> {
                            boolean b = false;
                            for(Books loanBook : LoanedBooks){
                                if(book.getName().equals(loanBook.getName())){ //ISBN넘버로 하면 확실
                                    loanBook.setNumber(loanBook.getNumber()+1);
                                    book.setNumber(book.getNumber()-1);
                                    b = true;
                                    break;
                                }
                            }
                            if(b = false){
                                Books newBook = new Books();
                                newBook = book;
                                newBook.setNumber(1);
                                LoanedBooks.add(newBook);
                            }
                            
                        }
                    }
                }
            }
        }
    }

    
    
}
