package a1129.bookLoan;

import java.util.ArrayList;
import java.util.Scanner;


public class LoaManager {
    private ArrayList<Books> books;
    private ArrayList<Books> loanedBooks;

    Scanner scan = new Scanner(System.in);

    public LoaManager() {
        books = new ArrayList<>();
        loanedBooks = new ArrayList<>();
        books.add(new Books("가", "저자1", 4, 123456));
        books.add(new Books("나", "저자2", 1, 123457));
        books.add(new Books("다", "저자3", 2, 123458));

    }

    public void showAllBooks() {
        System.out.println(" - 책 목록 - ");
        for(Books book : books){ 
            System.out.println(book);
        }
    }

    public void searchBook(String bookName) {
        boolean a = false;
        //제목이 맞는 도서 찾기
        for(Books book : books){
            
            if(book.getName().equals(bookName)){
                System.out.println(book);
                //재고확인 후 포문 빠져나오기
                if(book.getNumber() <= 0){
                    System.out.println("해당 도서는 재고가 없어서 대여가 불가능 합니다.");
                    break;
                }else{
                    System.out.println("해당 도서의 재고가 있습니다. 대여하시겠습니까? \n 1. 네 2. 아니오");
                    System.out.print(" >> ");
                    int choice = scan.nextInt();
                    scan.nextLine();

                    switch (choice) {
                        case 1-> {
                            boolean b = false;

                            for(Books loanedBook : loanedBooks){

                                //빌렸던 전적이 있는 책에 빌린책권수 추가
                                if(book.getName().equals(loanedBook.getName())){ //ISBN넘버로 하면 확실
                                    loanedBook.setNumber(loanedBook.getNumber()+1);
                                    book.setNumber(book.getNumber()-1);
                                    System.out.println("'"+bookName + "' 도서가 대여되었습니다.");
                                    b = true;
                                }

                            }

                            //처음 빌리는 책이라면 해당 도서객체를 복사 후 빌린책목록(객체)에 추가.
                            if(!b){
                                Books newBook = new Books(book.getName(), book.getAuthor(), 1, book.getISBN());
                                //newBook에 해당 book 객체 정보 입력과 동시에 생성
                                //이렇게 하면 되는데 새로 생성한 후에 값을 지정해주면 안 됨.. 이유??
                                loanedBooks.add(newBook);
                                System.out.println("'"+bookName + "' 도서가 대여되었습니다.");
                                book.setNumber(book.getNumber()-1);
                                
                            }
                            
                            
                        }
                        case 2 -> {
                            System.out.println("대여 안 함을 선택하셨습니다.");

                        }
                        default -> {
                        }
                    }
                    //해당 제목의 도서를 찾았다는 의미의 a = true;
                    a = true;
                }
            //해당 도서를 찾았으면 포문을 나와라 (아마 다음 for문에 나올 듯)
            }else if(a){
                break;
            }
            
        }
        //해당 제목의 도서를 찾지 못했다면 (!a) 출력
        if(!a){
            System.out.println("해당 제목의 도서는 없습니다.");
        }

    }

    //빌린 책 목록 출력
    public void showLoanedBooks() {
        System.out.println(" - 빌린 책 목록 - ");
        for(Books book : loanedBooks){
            System.out.println(book);
        }
    }


    //책 반납하기
    public void returnBook(String bookName) {
        boolean a = false;
        for(Books loanedBook : loanedBooks){
            
            if(loanedBook.getName().equals(bookName)){
                System.out.println(loanedBook);
                System.out.println("해당 도서가 대여 중에 있습니다. 반납하시겠습니까? \n 1. 네 2. 아니오");
                System.out.print(" >> ");
                int choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 1-> {
                        for(Books book : books){
                            
                            //반납시 빌린 책의 수량 감소, 책 재고 증가, 빌린 책의 개수가 0이면 해당객체 삭제
                            if(loanedBook.getName().equals(book.getName())){
                                loanedBook.setNumber(loanedBook.getNumber()-1);
                                book.setNumber(book.getNumber()+1);
                                if(loanedBook.getNumber() == 0){
                                    loanedBooks.remove(loanedBook);
                                }
                                System.out.println("'"+bookName + "' 도서가 반납되었습니다.");
                                break;
                            }
                        }
                        
                    }
                    case 2 -> {
                        System.out.println("대여 안 함을 선택하셨습니다.");
                        
                    }
                    default -> {
                    }
                }
                a = true;
            }else if(a){
                break;
            }else{
                System.out.println("해당 제목의 도서는 대여 중이 아닙니다.");
            }
        }
    }

    public void addBook() {

        //임시 객체 생성
        Books newBook = new Books();

        //추가할 책 정보 입력
        System.out.println("- 추가할 책 정보를 입력합니다. -");
        System.out.print("책 이름 : " );
        newBook.setName(scan.next());
        System.out.print("저자 : ");
        newBook.setAuthor(scan.next());
        System.out.print("수량 : ");
        newBook.setNumber(scan.nextInt());
        System.out.print("ISBN : ");
        newBook.setISBN(scan.nextDouble());


        boolean a = false;

        //추가할 책이 이미 등록돼있는 경우 해당 수량만큼 재고 증가
        for(Books book : books){
            if(book.getISBN() == newBook.getISBN()){ //책비교
                book.setNumber(book.getNumber() + newBook.getNumber());

                //등록된 책인 경우를 나타내는 a = true;
                a = true;
                break;
            }
        }

        //등록된 책이 아닌경우(!a)
        if(!a){
            //객체 추가
            books.add(newBook);
        }

    }

    public void removeBook(String bookName) {
        boolean a = false;
        for(Books book : books){
            
            if(book.getName().equals(bookName)){
                System.out.println("해당 도서를 삭제하시겠습니까? \n 1. 네 2. 아니오");
                System.out.print(" >> ");
                int choice = scan.nextInt();
                scan.nextLine();
                switch (choice) {
                    case 1-> {
                        //도서 목록에서 삭제
                        books.remove(book);
                        System.out.println("삭제되었습니다.");
                    }
                    case 2 -> {
                        System.out.println("삭제하지 않습니다.");
                    }
                    default -> {
                        System.out.println("잘못입력하셨습니다.");
                    }
                }
                a = true;
            }else if(a){
                break;
            }
        }    
        if(!a){
            System.out.println("해당 제목의 도서는 없습니다.");
        }
    
    }

    public void updateBook(String bookName) {
        boolean a = false;
        for(Books book : books){
            
            //수정할 책이 있다면
            if(book.getName().equals(bookName)){
                //a가 참이 될 때까지 와일문 실행 (수정종료시 참)
                while (!a) {
                    System.out.println("수정할 내용 선택 \n 1. 책 제목 2. 저자 3. 수량 4.ISBN 5. 수정 종료");
                    System.out.print(" >> ");
                    int choice = scan.nextInt();
                    scan.nextLine();
                    switch (choice) {
                        case 1-> {
                            System.out.println("수정될 책의 이름을 적어주세요");
                            System.out.print(" >> ");
                            String n = scan.nextLine();
                            book.setName(n);
    
                        }
                        case 2-> {
                            System.out.println("수정될 저자의 이름을 적어주세요");
                            System.out.print(" >> ");
                            String n = scan.nextLine();
                            book.setAuthor(n);
    
                        }
                        case 3-> {
                            System.out.println("수정될 책의 수량을 적어주세요");
                            System.out.print(" >> ");
                            int n = scan.nextInt();
                            book.setNumber(n);
    
                        }
                        case 4-> {
                            System.out.println("수정될 ISBN을 적어주세요");
                            System.out.print(" >> ");
                            double n = scan.nextDouble();
                            book.setISBN(n);
    
                        }
                        case 5 -> {
                            a = true;

                        }
                        default -> {
                            System.out.println("잘못입력하셨습니다.");
                        }
    
                    }
    
                }

            }else if(a){
                break;
            }
        }    
        if(!a){
            System.out.println("해당 제목의 도서는 없습니다.");
        }
    }


    //해당 책 정보 출력
    public void bookInfo(String bookName) {

        for(Books book : books){
            if(book.getName().equals(bookName)){
                System.out.println(book);
            }
        }
        
    }


}