package practice.practice260409.practice1;

public class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
    void showInfo(){
        System.out.println("일반 계좌 잔액 : " + balance);
    }
}
