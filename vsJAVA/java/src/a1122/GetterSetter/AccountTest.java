package a1122.GetterSetter;

public class AccountTest {
    public static void main(String[] args) {
        Account axx = new Account();
        axx.setBalance(1000);
        System.out.printf("잔액 : %d", axx.getBalance());
    }
}
class Account {
    private int balance;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }



    // public int getBalance(){
    //     return balance;
    // }

    // //세터 메소드 약간 생성자네
    // public void setBalance(int balance){
    //     this.balance = balance;
    // }
}