package practice.practice260409.practice1;

public class CheckingAccount extends Account {
    public CheckingAccount(int balance) {
        super(balance);
    }

    void showInfo(){
        System.out.println("체크 계좌 잔액 : " + balance);
    }
}
