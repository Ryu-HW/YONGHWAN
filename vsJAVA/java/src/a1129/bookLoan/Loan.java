package a1129.bookLoan;

import java.util.Scanner;


public class Loan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LoaManager manager = new LoaManager(); //생성
        boolean flag = true;
        int choice2;
        while (flag) {
            System.out.println("\n 도서관");
            System.out.println("1. 대여하기");
            System.out.println("2. 반납하기");
            System.out.println("3. 관리자");
            System.out.println("4. 종료");
            System.out.print(" >> ");

            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {

                case 1 -> {
                    System.out.println("\n - 대여하기 -");
                    System.out.println("1. 책 목록 보기");
                    System.out.println("2. 책 검색(제목)");
                    System.out.println("3. 뒤로가기");
                    System.out.print(" >> ");


                    choice2 = scan.nextInt();
                    scan.nextLine(); 
                        switch (choice2) {
                            case 1 ->{
                                manager.showAllBooks();
                            }
                            
                            case 2 ->{
                                System.out.println("\n 검색할 책 이름을 입력해주세요.");
                                System.out.print(" >> ");
                                String bookName = scan.nextLine();
                                manager.searchBook(bookName);
                            }
                            default -> {
                                continue;
                            }
                        }
                }
                case 2 -> {
                    System.out.println("\n - 반납하기 -");
                    System.out.println("1. 대여한 책 목록 보기");
                    System.out.println("2. 반납할 책 이름");
                    System.out.println("3. 뒤로가기");
                    System.out.print(" >> ");

                    choice2 = scan.nextInt();
                    scan.nextLine(); 

                    switch (choice2) {
                        case 1 ->{
                            manager.showLoanedBooks();
                        }
                        
                        case 2 ->{
                            System.out.println("\n 반납할 책 이름을 입력해주세요.");
                            System.out.print(" >> ");
                            String bookName = scan.nextLine();
                            manager.returnBook(bookName);
                        }
                        default -> {
                            continue;
                        }

                    }
                }
                case 3 -> {
                    System.out.println("\n - 관리자 -");
                    System.out.println("1. 전체 책 목록");
                    System.out.println("2. 책 추가");
                    System.out.println("3. 책 삭제");
                    System.out.println("4. 책 정보 수정");
                    System.out.println("5. 해당 책 내용 보기");
                    System.out.println("6. 뒤로가기");
                    System.out.print(" >> ");

                    choice2 = scan.nextInt();
                    scan.nextLine(); 
                    switch (choice2) {
                        case 1 ->{
                            manager.showAllBooks();
                            manager.showLoanedBooks();
                        }
                        
                        case 2 ->{
                            manager.addBook();
                            System.out.println("책이 추가되었습니다.");
                        }
                        case 3 ->{
                            System.out.println("\n 삭제할 책 이름을 입력해주세요.");
                            System.out.print(" >> ");
                            String bookName = scan.nextLine();
                            manager.removeBook(bookName);
                        }
                        case 4 ->{
                            System.out.println("\n 수정할 책 이름을 입력해주세요.");
                            System.out.print(" >> ");
                            String bookName = scan.nextLine();
                            manager.updateBook(bookName);
                        }
                        case 5 ->{
                            System.out.println("\n 내용을 볼 책의 이름을 입력해주세요.");
                            System.out.print(" >> ");
                            String bookName = scan.nextLine();
                            manager.bookInfo(bookName);
                        }
                        default -> {
                            continue;
                        }
                    }

                }
                case 4 -> {
                    flag = false;

                }
                    
            }
        }
    }
}
